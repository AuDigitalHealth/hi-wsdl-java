# HI WSDL library

Maven artifact **`au.gov.nehta:hi-wsdl`** — HI B2B **WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for Healthcare Identifiers (HI) client development.

This repository supplies the **generated type layer** and classpath WSDL only—no TLS, signing handlers, or NEHTA facade clients. Use it from any application that calls HI B2B services (your own JAX-WS/JAXB code, another internal library, tests, or tooling). For NEHTA’s ready-made HI facades, see **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)**.

## Release lines

Use **version numbers** in documentation and dependencies — **not** Git branch names.

| Version | Java | XML stack | HI service scope |
| ------- | ---- | --------- | ---------------- |
| **1.6.4** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | Standard HI B2B — **14** `Service` stubs |
| **1.6.6** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | Standard HI B2B — **14** `Service` stubs |
| **1.7.1** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | Full MCA — **26** `Service` stubs |

**This checkout** builds **`1.6.6-SNAPSHOT`** (Java **11** / **Jakarta**).

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)** like any other dependency — no local build is required.

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>hi-wsdl</artifactId>
  <version>1.6.6</version>
</dependency>
```

Compile dependencies: **`jakarta.xml.bind-api`** **4.0.5** and **`jakarta.xml.ws-api`** **4.0.3**. Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **4.0.4** at runtime in your application when you invoke SOAP endpoints. This JAR does not bundle **`jaxws-rt`**.

Align **`hi-wsdl`** and **`hi-b2b-client`** at the **same version** when both are on the classpath (GA versions in the table above).

## Local development (SNAPSHOT)

This repository builds **`1.6.6-SNAPSHOT`** on the Java **11** / **Jakarta** line. **`hi-b2b-client-java`** declares **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** — install this types JAR **first** when both checkouts are unpublished:

```text
# 1) hi-wsdl (1.6.6-SNAPSHOT — this repository)
mvn -B "-Dgpg.skip=true" clean install

# 2) hi-b2b-client (1.6.6-SNAPSHOT — matching version)
mvn -B "-Dgpg.skip=true" clean verify
```

If Maven warns that a **GA** POM is missing (for example **`1.6.6`** before Central publish), clear stale **`au/gov/nehta/hi-wsdl`** entries in your **local Maven repository** (folders with only **`.lastUpdated`** files) and reinstall the SNAPSHOT. **`mvn clean`** in one project does not clear the local repository cache.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| HI service WSDL (classpath) | `src/main/resources/HI_*.wsdl` |
| Jakarta generated stubs | `src/main/java/` |
| XMLDSig JAXB override | `src/main/java/hi_override/` |

The published JAR includes WSDL on the classpath root (for example `/HI_ConsumerSearchIHI-3.0.wsdl`). Generated **`Service`** classes reference those locations.

## Licensed WSDL tree (regeneration only)

WSDL under **`src/main/resources`** references XSD paths resolved from the licensed toolkit layout at **`wsdls/xml/`** (not in public Git). Obtain the pack when **regenerating** types from WSDL:

- [Healthcare Identifiers Integration Toolkit](https://developer.digitalhealth.gov.au/resources/healthcare-identifiers-integration-toolkit-v1-2) (Digital Health Developer Portal)
- [HI Service for software developers](https://www.servicesaustralia.gov.au/healthcare-identifier-hi-service-for-software-developers) (Services Australia)

A normal **`mvn verify`** on committed sources does **not** require a local licensed tree.

Confirm your organisation’s redistribution terms for HI WSDL before mirroring this repository.

## Building from source

**Audience:** contributors changing this repository — not integrators adding a Maven dependency.

Prerequisites: **JDK 11+**, **Maven 3.6+**. Generated Java is **committed**; the default build does not run **`wsimport`**.

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or **`build.ps1`**, **`build.sh`**, **`build.bat`**. See **`CONTRIBUTING.md`** for tests, regeneration, and optional **`mvn install`** when you need an unpublished snapshot in your local Maven cache.

## When to use this artifact

| You need | Use |
| -------- | --- |
| HI JAXB/JAX-WS types + `HI_*.wsdl` on the classpath | **`hi-wsdl`** (this JAR) |
| NEHTA facade clients, TLS, and signing | **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)** |
| My Health Record (PCEHR) only | **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** — separate domain |

## Relationship to hi-b2b-client-java

| | **hi-wsdl-java** (this repo) | **hi-b2b-client-java** |
| --- | --- | --- |
| Artifact | `hi-wsdl` | `hi-b2b-client` |
| Facade clients | No | Yes (`au.gov.nehta.vendorlibrary.hi.*`) |
| Codegen | **14** committed `Service` stubs; **`-Pregenerate-sources`** for maintainer refresh only | **`1.6.6`**: depends on **`hi-wsdl`** from Maven Central (no in-repo **`wsimport`**) |

Full MCA (**26** services) is **`1.7.1`** in both repositories.

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors building from source |
| **MAINTAINERS.md** | Release and codegen alignment |
| **SECURITY.md** | Security reporting and secrets hygiene |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |
| **wsdls/readme.txt** | Licensed WSDL tree staging (regeneration only) |

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java) | NEHTA HI facade clients |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facades (separate domain) |

## License

Apache License 2.0. See **LICENSE.txt**.
