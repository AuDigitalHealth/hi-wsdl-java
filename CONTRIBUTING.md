# Contributing

**Audience:** developers building or changing **this repository**. Integrators should use **README.md** and Maven Central coordinates. See **SECURITY.md** before committing.

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set (see **`maven.compiler.release`** in **`pom.xml`**).
- **Maven 3.6+** on **`PATH`**.
- Licensed HI WSDL/XSD tree at **`wsdls/xml/`** only when **regenerating** Jakarta stubs from WSDL (not required for default **`mvn verify`**). See **`wsdls/readme.txt`**.

Dependencies resolve from **[Maven Central](https://central.sonatype.com/)** unless you are installing a **local SNAPSHOT** (below). This POM has no sibling Maven modules.

## Versioning

The **first number** of **`au.gov.nehta:hi-wsdl`** is the **Java SE** version that this types JAR targets. **8.0.0.1** is **`javax`** with **14** `Service` stubs; **11.0.0.1** and later are **Jakarta** with **26** stubs. See **`README.md`**.

Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) must use the **same** version as this **`pom.xml`**.

## Build

From the project root:

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or use **`build.ps1`**, **`build.sh`**, or **`build.bat`**. Set **`MVN_SETTINGS`** if you must pass **`-s`** to Maven.

This line (**`11.0.0.1`**) compiles **committed** types. Regeneration is a maintainer profile only (below).

| Goal | Command |
| ---- | ------- |
| Compile + unit tests | `mvn -B "-Dgpg.skip=true" clean verify` |
| Skip tests | `mvn -B "-Dgpg.skip=true" clean verify "-DskipTests=true"` |
| Install SNAPSHOT to the local Maven repository | `mvn -B "-Dgpg.skip=true" clean install` |

Default tests: **`GeneratedWsdlBindingsTest`**, **`HiWsdlArtifactTest`**, **`SearchIhiPropOrderTest`**, **`SearchForProviderIndividualPropOrderTest`** (offline smoke tests; no licensed WSDL tree or network required).

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

## Local builds (unpublished artifacts)

**`mvn install`** here is enough for any unpublished consumer of **`au.gov.nehta:hi-wsdl`** at **`${project.version}`**. Integrators using GA versions from Maven Central do not need a source checkout.

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** is **committed**. Regeneration is maintainer-only and requires:

1. Licensed toolkit copied to **`wsdls/xml/`** (contains **`wsdl/`**, **`schema/`**, **`binding/`** - same layout as **hi-b2b-client-java**).
2. Jakarta **`wsimport`** tooling aligned with **`MAINTAINERS.md`** (**`jaxws-rt`** 4.0.x, Java 11).

Regenerate committed types:

```text
mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"
mvn -B "-Dgpg.skip=true" clean verify
```

When HI interfaces change, copy updated flat **`HI_*.wsdl`** from the licensed tree into **`src/main/resources/`** before committing.

The **`regenerate-sources`** profile runs **26** **`wsimport`** executions with **`jaxb-xjc` 4.0.9** (correct schema-fragment Javadoc from XJC). Update **CHANGELOG.md** after regeneration.

## Repository hygiene

- **Do not commit** keystores, production HI URLs, populated **`settings.xml`** with release credentials, or the licensed ADHA MCA **`wsdls/xml`** download tree. See **SECURITY.md**.
- **`11.0.0.1`:** generated Java under **`src/main/java`** is committed; use **`-Pregenerate-sources`** only when refreshing types from licensed WSDL.
- **Line endings:** the repository uses **LF** (see **`.gitattributes`**). On **Windows**, run **`git config core.autocrlf false`** in your clone before committing.

Maintainer notes: **MAINTAINERS.md**.
