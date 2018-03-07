# Troubleshooting

## ALPN is not configured properly

If you see exceptions related to `ALPN is not configured properly`, such as:

```
Caused by: java.lang.IllegalArgumentException: ALPN is not configured properly. See https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting for more information.
```

This can mean that:
- You are not on a [supported platform](https://github.com/GoogleCloudPlatform/google-cloud-java/#supported-platforms)
- There are classpath conflicts with `netty`
- Or, you are seeing any of the conflicts specified in [gRPC Troubleshooting guide](https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting).

If you are using `google-cloud-java` packages prior to version 0.35.0, then consider upgrading to gRPC 1.9.0 or newer and use `grpc-netty-shaded` dependency, for example:

```
<properties>
  <grpc.version>1.9.0</grpc.version>
</properties>

<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-core</artifactId>
      <version>${grpc.version}</version>
    </dependency>
    <!-- grpc-netty-shaded version must be the same as other gRPC dependencies, such as grpc-core -->
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-netty-shaded</artifactId>
      <version>${grpc.version}</version>
    </dependency>
  </dependencies>
</dependencyManagement>
```

The `grpc-netty-shaded` dependency avoids conflicts with other `netty` dependencies that may also be in the classpath.

If you are using `google-cloud-java` version 0.35.0 or above, then it already uses `grpc-netty-shaded`. If you are still running into `ALPN` related problems, please see [gRPC Troubleshooting guide](https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting) for other causes.

## ClassNotFoundException, NoSuchMethodError, NoClassDefFoundError

These errors are usually caused by having multiple versions or conflicting versions of the same dependency in the classpath.
Usually these dependency conflicts occur with `guava` or `protobuf-java`.

There may be multiple sources for classpath conflicts:
- Multiple versions of the same transitive dependency in the dependency tree
- Your runtime classpath has different versions of dependences than what you specified in the build

For example, if you have a direct or a transitive dependency on Guava version 10.0, and also `google-cloud-java` uses Guava version 20.0, then `google-cloud-java` could be using Guava methods that don't exist in Guava 10.0, and could cause `NoSuchMethodError`.

Similarily, if your classpath has an older version of `protobuf-java`, but `google-cloud-java` requires newer version, then you may see `NoClassDefFoundError` that fails to initialize `google-cloud-java` classes, e.g.:

```
java.lang.NoClassDefFoundError: Could not initialize class com.google.pubsub.v1.PubsubMessage$AttributesDefaultEntryHolder
```

### Validate the conflict

Check the dependency tree to see if you have multiple versions of the same dependencies, e.g.:

```
$ mvn dependency:tree
```

Look for versions of potentially conflicting dependencies like `guava`, `protobuf-java`, etc.

If you experience the error only during runtime, then it means that your runtime environment may be introducing conflicting JARs into your runtime classpath. A typical example of this is that Hadoop, Spark, or other server software that your application runs on may have conflicting versions `netty`, `guava`, or `protobuf-java` JARs in the classpath.

### Detecting the conflict early during build

To detect dependnecy version conflicts early, use the [Enforcer Plugin](https://maven.apache.org/enforcer/maven-enforcer-plugin/index.html) in your Maven configuration to enforce dependency convergence:

```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-enforcer-plugin</artifactId>
  <version>...</version>
  <executions>
    <execution>
      <id>enforce</id>
      <configuration>
        <rules>
<dependencyConvergence/>
        </rules>
      </configuration>
      <goals>
        <goal>enforce</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```

There is no way to detect runtime classpath conflicts though. You'll need to be fully aware of what JARs/classes are included in the runtime classpath as every server environment is different.

### Resolving the conflict

There are different strategies to resolve conflicts, but you must understand the root cause of the conflicts, e.g.:
- If you have the control over the dependency tree, runtime classpath, and you have the option to upgrade offending dependencies (e.g., upgrading Guava version), then this is the easiest route.
- If you don't have control over the dependency tree, nor runtime classpath, or changing dependency versions causes other failures, then you should consider [shading dependencies](https://maven.apache.org/plugins/maven-shade-plugin/) of `google-cloud-java`.

For example, to shade `guava` and `protobuf-java`:

```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-shade-plugin</artifactId>
  <version>...</version>
  <executions>
    <execution>
      <phase>package</phase>
      <goals>
        <goal>shade</goal>
      </goals>
      <configuration>
        <keepDependenciesWithProvidedScope>false</keepDependenciesWithProvidedScope>
        <relocations>
          <!-- move protobuf to a shaded package -->
          <relocation>
            <pattern>com.google.protobuf</pattern>
            <shadedPattern>myapp.shaded.com.google.protobuf</shadedPattern>
          </relocation>
          <!-- move Guava to a shaded package -->
          <relocation>
            <pattern>com.google.common</pattern>
            <shadedPattern>myapp.shaded.com.google.common</shadedPattern>
          </relocation>
        </relocations>
      </configuration>
    </execution>
  </executions>
</plugin>
```

