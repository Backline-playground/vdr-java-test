# VDR Java Test

Test repository for testing OSV.dev fallback for fix version resolution in Backline.

## Vulnerable Packages

This project includes dependencies with known vulnerabilities from VDR reports:

| Package | Version | Vulnerability |
|---------|---------|---------------|
| mssql-jdbc | 8.4.0.jre8 | GHSA-m494-w24q-6f7w |
| logback-core | 1.4.14 | GHSA-6v67-2wr5-gvf4, GHSA-pr98-23f8-jwxv |
| commons-lang3 | 3.13.0 | GHSA-j288-q9x7-2f5v |
| jetty-http | 11.0.20 | GHSA-qh8g-58pp-2wxh |
| jetty-server | 11.0.20 | GHSA-g8m5-722r-8whq |

## Usage

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.backline.test.App"
```

## Testing with Backline

1. Upload `vdr-report.csv` as Custom Report
2. Use `vdr-csv-mapping.yaml` as config file
3. Repository URL: https://github.com/backline-playground/vdr-java-test
