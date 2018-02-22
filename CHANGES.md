# v0.33.0
## BigQuery
- Fix spelling. The name "Bigquery" is some methods are now properly spelled "BigQuery".
- `Job.getQueryResults` now waits for the query to complete.
  - You no longer have to call `Job.waitFor`.
- `BigQuery.getQueryResults(JobId)` is replaced.
  - Instead of `bigquery.getQueryResults(id)`, use `bigquery.getJob(id).getQueryResults()`.
- `BigQuery.query` and `Job.getQueryResults` returns `TableResult`, not `QueryResponse`.
  - Instead of `queryResponse.getResult().iterateAll()`, use `tableResult.iterateAll()`.
  - This change should make iterating large result sets significantly faster.
- `BigQuery.listTableData` and `Table.list` returns `TableResult` instead of `Page<FieldValueList>`.
  - This remains source-compatible, since `TableResult` implements `Page<FieldValueList>`.
  - `TableResult` allows inserting `Shema` into each iterated row.
  - `TableResult.getTotalRows()` can be called to obtain the total number of rows across pages.
- Various `Job` statistics are no longer available at `QueryResponse`.
  - Use `BigQuery.getJob` then `Job.getStatistics` instead.
