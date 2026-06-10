# Contributing

**Audience:** developers building or changing **this repository**. Integrators adding a Maven dependency should use **README.md**.

---

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.
- Licensed HI WSDL/XSD tree at **`wsdls/xml/`** only when **regenerating** Jakarta stubs from WSDL (not required for default **`mvn verify`**). See **`wsdls/readme.txt`**.

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
| Install snapshot locally (optional) | `mvn -B "-Dgpg.skip=true" clean install` — when co-developing with **`hi-b2b-client`** at the same **`${project.version}`** (see **README.md**) |

Default tests: **`GeneratedWsdlBindingsTest`**, **`HiWsdlArtifactTest`** (offline smoke tests; no licensed WSDL tree or network required).

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

---

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** is **committed**. Regeneration is maintainer-only and requires:

1. Licensed toolkit copied to **`wsdls/xml/`** (contains **`wsdl/`**, **`schema/`**, **`binding/`** — same layout as **hi-b2b-client-java**).
2. Jakarta **`wsimport`** tooling aligned with **`MAINTAINERS.md`** (**`jaxws-rt`** 4.0.x, Java 11).

Regenerate committed types:

```text
mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"
mvn -B "-Dgpg.skip=true" clean verify
```

When HI interfaces change, copy updated flat **`HI_*.wsdl`** from the licensed tree into **`src/main/resources/`** before committing.

The **`regenerate-sources`** profile runs **26** **`wsimport`** executions with **`jaxb-xjc` 4.0.9** (correct schema-fragment Javadoc from XJC). Update **CHANGELOG.md** after regeneration.

---

## Repository hygiene

- **Do not commit:** populated **`local.properties`**, **`settings.xml`** (use **`settings.xml.example`** as a template only), the licensed **`wsdls/xml/`** tree, keystores under **`certs/`**, or production HI URLs. See **SECURITY.md**.
- **Line endings:** LF per **`.gitattributes`**. On Windows: **`git config core.autocrlf false`** in this clone before committing.
- Maintainer notes: **MAINTAINERS.md**.

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
