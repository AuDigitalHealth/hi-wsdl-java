# Contributing

**Audience:** developers building or changing **this repository**. Integrators should use **README.md** and Maven Central coordinates. See **SECURITY.md** before committing.

## Prerequisites

- **JDK 8+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.

## Build

From the project root:

```text
mvn -B "-Dgpg.skip=true" clean verify
```

| Goal | Command |
| ---- | ------- |
| Compile + attach sources/Javadoc | `mvn -B "-Dgpg.skip=true" clean verify` |
| Skip tests | `mvn -B "-Dgpg.skip=true" clean verify "-DskipTests=true"` |
| Install SNAPSHOT for sibling client build | `mvn -B "-Dgpg.skip=true" clean install` — required before **`hi-b2b-client-java`** **`verify`** when both repos are at matching **`*-SNAPSHOT`** versions |

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

## Dependencies

- Compile: **`javax.xml.bind:jaxb-api`** and **`javax.xml.ws:jaxws-api`** only.
- Runtime SOAP stack: **`com.sun.xml.ws:jaxws-rt`** **2.3.7** in **consuming** applications.
- **`maven-enforcer-plugin`** rejects Metro **`webservices-*`** coordinates on the classpath.

## Local builds (unpublished artifacts)

When co-developing with **`hi-b2b-client-java`**, install matching **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** before the client **`verify`** (same SNAPSHOT or GA — see **README.md** release table).

```text
mvn -B "-Dgpg.skip=true" clean install
```

Integrators using GA versions from Maven Central do not need a sibling checkout. Maintainer notes: **MAINTAINERS.md**.

## Repository hygiene

- **Do not commit** keystores, production HI URLs, populated **`settings.xml`** with release credentials, or the licensed ADHA MCA **`wsdls/xml`** download tree (**`1.6.5`** / **`1.7.0`** regeneration). See **SECURITY.md**.
- **`1.6.3`:** generated Java under **`src/main/java`** is frozen — this POM has no **`wsimport`** / XJC profile.
- **Line endings:** the repository uses **LF** (see **`.gitattributes`**). On **Windows**, run **`git config core.autocrlf false`** in your clone before committing.
