Licensed XSD staging (not in Git)
=================================

HI WSDL under src/main/resources reference schema/mca/... and schema/w3c/...
at the repository root (toolkit layout). Licensed schema content must NOT be
committed to a public repository.

Obtain schemas from:
  - Healthcare Identifiers Integration Toolkit (Digital Health Developer Portal)
    https://developer.digitalhealth.gov.au/resources/healthcare-identifiers-integration-toolkit-v1-2
  - HI Service for software developers (Services Australia)
    https://www.servicesaustralia.gov.au/healthcare-identifier-hi-service-for-software-developers

Local staging:

  Copy the toolkit xml/schema folder to schema/ next to pom.xml
  (so schema/mca/... and schema/w3c/... exist).

Required only for -Pregenerate-sources (wsimport with jaxb-xjc 4.0.7).
Default mvn verify uses committed generated sources and does not need schema/.
