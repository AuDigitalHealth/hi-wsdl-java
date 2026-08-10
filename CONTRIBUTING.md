# Contributing

**Audience:** developers building or changing **this repository** (**`1.6.6-SNAPSHOT`** / Java **11** / **Jakarta**). Integrators adding a Maven dependency should use **README.md**.

---

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.
- Licensed HI WSDL/XSD under **`wsdls/xml/`** only when **regenerating** Jakarta stubs (not required for default **`mvn verify`**). See **`wsdls/readme.txt`**.

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
| Install SNAPSHOT for sibling client build | `mvn -B "-Dgpg.skip=true" clean install` — required before **`hi-b2b-client-java`** **`verify`** when both repos are at matching **`*-SNAPSHOT`** versions |

Default tests: **`GeneratedWsdlBindingsTest`** (offline smoke tests; no licensed schema or network required).

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

---

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** is **committed**. Regeneration is maintainer-only and requires:

1. Current HI WSDL under **`src/main/resources`** (sync from licensed tree if interfaces change).
2. Licensed toolkit tree at **`wsdls/xml/`** (see **`wsdls/readme.txt`**).
3. Eclipse EE4J **`wsimport`** tooling aligned with **`MAINTAINERS.md`** (**`jaxws-rt`** / **`jaxws-maven-plugin`** 4.0.x, Java 11).

Regenerate committed types (requires **`wsdls/xml/`** locally):

```text
mvn -B clean -Pregenerate-sources generate-sources process-sources -Dhi.wsdl.sync.generated=true
mvn -B "-Dgpg.skip=true" clean verify
```

The **`regenerate-sources`** profile runs **`wsimport`** with **`com.sun.xml.bind:jaxb-xjc`** **4.0.9** on the **`jaxws-maven-plugin`** classpath (older XJC from **`jaxws-tools`** is excluded). That produces PCEHR-style schema-fragment Javadoc (`&lt;p&gt;`, `{&#064;code`, closed tags). Do not patch Javadoc in generated sources by hand — regen and commit. Update **CHANGELOG.md** after regeneration.

---

## Local builds (unpublished artifacts)

When co-developing with **`hi-b2b-client-java`**, install matching **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** before the client **`verify`** (same SNAPSHOT or GA — see **README.md** release table).

```text
mvn -B "-Dgpg.skip=true" clean install
```

Integrators using GA versions from Maven Central do not need a sibling checkout. Maintainer notes: **MAINTAINERS.md**.

---

## Repository hygiene

- **Do not commit:** populated **`local.properties`**, **`settings.xml`** (use **`settings.xml.example`** as a template only), the licensed **`wsdls/xml/`** tree, keystores under **`certs/`**, or production HI URLs. See **SECURITY.md**.
- **Line endings:** LF per **`.gitattributes`**. On Windows: **`git config core.autocrlf false`** in this clone before committing.

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
