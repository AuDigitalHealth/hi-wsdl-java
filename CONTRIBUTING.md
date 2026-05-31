# Contributing

**Audience:** developers building or changing **this repository**. Integrators adding a Maven dependency should use **README.md**.

---

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.
- **`schema/mca/...`** and **`schema/w3c/...`** only when **regenerating** Jakarta stubs from WSDL (not required for default **`mvn verify`**). See **`schema/readme.txt`**.

---

## Build

From the project root (directory containing **`pom.xml`**):

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or use **`build.ps1`**, **`build.sh`**, or **`build.bat`**. Set **`MVN_SETTINGS`** if you must pass **`-s`** to Maven.

| Goal | Command |
| ---- | ------- |
| Compile + unit tests | `mvn -B "-Dgpg.skip=true" clean verify` |
| Skip tests | `mvn -B "-Dgpg.skip=true" clean verify "-DskipTests=true"` |
| Install to local repo | `mvn -B "-Dgpg.skip=true" clean install` |

Default tests: **`GeneratedWsdlBindingsTest`** (offline smoke tests; no licensed schema or network required).

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

---

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** is **committed**. Regeneration is maintainer-only and requires:

1. Current HI WSDL under **`src/main/resources`** (update from toolkit if interfaces change).
2. **`schema/mca/...`** present locally (see **`schema/readme.txt`**).
3. Jakarta **`wsimport`** tooling aligned with **`MAINTAINERS.md`** (**`jaxws-rt`** 4.0.x, Java 11).

Regenerate committed types (requires **`schema/mca/`** and **`schema/w3c/`** locally):

```text
mvn -B -Pregenerate-sources -Dhi.wsdl.codegen.clean=true generate-sources process-sources -Dhi.wsdl.sync.generated=true
mvn -B "-Dgpg.skip=true" clean verify
```

The **`regenerate-sources`** profile runs **`wsimport`** with **`jaxb-xjc` 4.0.7** (correct schema-fragment Javadoc from XJC). Update **CHANGELOG.md** after regeneration.

---

## Repository hygiene

- **Do not commit:** populated **`local.properties`**, **`settings.xml`** (use **`settings.xml.example`** as a template only), the licensed **`schema/mca/`** tree, keystores under **`certs/`**, or production HI URLs. See **SECURITY.md**.
- **Line endings:** LF per **`.gitattributes`**. On Windows: **`git config core.autocrlf false`** in this clone before committing.
- Maintainer notes: **MAINTAINERS.md**.

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
