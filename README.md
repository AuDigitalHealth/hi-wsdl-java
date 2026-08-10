# HI WSDL library

Maven artifact **`au.gov.nehta:hi-wsdl`** — HI B2B **WSDL resources** and **pre-generated JAX-WS / JAXB types** for Healthcare Identifiers (HI) client development.

For NEHTA facade clients, TLS, and signing, use **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)**. This repository supplies the **generated type layer** and classpath WSDL only.

## Release lines

| Version | Java | XML stack | HI service scope |
| ------- | ---- | --------- | ---------------- |
| **1.6.4** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | Standard HI B2B — **14** `Service` stubs |
| **1.6.6** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | Standard HI B2B — **14** `Service` stubs |
| **1.7.1** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | Full MCA — **26** `Service` stubs |

**This checkout** builds **`1.6.4-SNAPSHOT`** (Java **8** / **`javax`**) — **committed** generated types with **14** standard HI B2B services (no **`wsimport`** in the build).

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)** like any other dependency — no local build is required.

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>hi-wsdl</artifactId>
  <version>1.6.4</version>
</dependency>
```

Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **2.3.7** at runtime in your application when you invoke SOAP endpoints ( **`javax.xml.ws`** / **`javax.xml.bind`** ). This JAR does not bundle **`jaxws-rt`**. 

Align **`hi-wsdl`** and **`hi-b2b-client`** at the **same version** when both are on the classpath (GA versions in the table above).

## Local development (SNAPSHOT)

This repository builds **`1.6.4-SNAPSHOT`** on the Java **8** / **`javax`** line. **`hi-b2b-client-java`** declares **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** — install this types JAR **first** when both checkouts are unpublished:

```text
# 1) hi-wsdl (1.6.4-SNAPSHOT — this repository)
mvn -B "-Dgpg.skip=true" clean install

# 2) hi-b2b-client (1.6.4-SNAPSHOT — matching version)
mvn -B "-Dgpg.skip=true" clean verify
```

If Maven warns that a **GA** POM is missing (for example **`1.6.4`** before Central publish), clear stale **`au/gov/nehta/hi-wsdl`** entries in your **local Maven repository** (folders with only **`.lastUpdated`** files) and reinstall the SNAPSHOT. **`mvn clean`** in one project does not clear the local repository cache.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| **14** primary binding WSDLs (classpath) | `src/main/resources/HI_*.wsdl` (plus supporting message/interface WSDLs in the same tree) |
| Generated stubs (`javax`) | `src/main/java/` |
| XMLDSig JAXB override | `src/main/java/hi_override/` |

## Building from source

**Audience:** contributors changing this repository — not integrators adding a Maven dependency.

Prerequisites: **JDK 8+**, **Maven 3.6+**. All JAX-WS/JAXB types are **committed** in **`src/main/java`**; the build compiles them only (no codegen, no licensed MCA schema tree required).

```text
mvn -B "-Dgpg.skip=true" clean verify
```

See **`CONTRIBUTING.md`** for optional **`mvn install`** when testing unpublished snapshots locally.

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java) | HI facade clients |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facades (separate domain) |

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors |
| **MAINTAINERS.md** | Releases and tooling |
| **SECURITY.md** | Secrets and licensed material |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |

## License

Apache License 2.0. See **LICENSE.txt**.
