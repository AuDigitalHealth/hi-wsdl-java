# HI WSDL library

Maven artifact **`au.gov.nehta:hi-wsdl`** - HI B2B **WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for Healthcare Identifiers (HI) client development.

For NEHTA facade clients, TLS, and signing, use **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)**. This repository supplies the **generated type layer** and classpath WSDL only.

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)**. Use a **`<version>`** that matches your JDK (see **Versioning**).

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>hi-wsdl</artifactId>
  <version>11.0.0.1</version>
</dependency>
```

**This line (`11.0.0.1`):** Java **11**, **Jakarta** XML WS / Bind, **26** HI B2B **`Service`** stubs (full MCA), **committed** generated types (no **`wsimport`** in the default build). Compile dependencies: **`jakarta.xml.bind-api`** **4.0.5** and **`jakarta.xml.ws-api`** **4.0.3**. Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **4.0.4** at runtime in your application when you invoke SOAP endpoints. This JAR does not bundle **`jaxws-rt`**.

When **`hi-b2b-client`** is also on the classpath, use the **same** Maven version for both artifacts.

---

## Versioning

The **first number** of the Maven version is the **Java SE** version that this types JAR targets. Downstream artifacts that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use that same coordinate on a given line.

| Maven version | Java SE | XML stack | `Service` stubs |
| ------------- | ------- | --------- | --------------- |
| **8.0.0.1** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | **14** (standard HI B2B) |
| **11.0.0.1** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **26** (full MCA) |
| **17.0.0.1** | **17** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **26** (full MCA) |
| **21.0.0.1** | **21** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **26** (full MCA) |
| **24.0.0.1** | **24** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **26** (full MCA) |

Pick the coordinate that matches your JDK. Do not mix **`hi-wsdl`** versions with a consumer that expects a different line. All published versions are on **[Maven Central](https://central.sonatype.com/)**.

---

## Note

The **11.0.0.1** JAR ships **Jakarta** types and the full MCA binding set (**26** `Service` stubs). **8.0.0.1** is **`javax`** with **14** stubs (standard HI B2B only).

---

## Local development (SNAPSHOT)

This repository builds **`11.0.0.1-SNAPSHOT`**. The default lifecycle compiles **committed** types only. To make an unpublished JAR resolvable for other local projects:

```text
mvn -B "-Dgpg.skip=true" clean install
```

Consumers that declare **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** (including **`hi-b2b-client-java`**) need that install (or a Central GA) before their **`verify`**.

If Maven warns that a **GA** POM is missing (for example **`11.0.0.1`** before Central publish), clear stale **`au/gov/nehta/hi-wsdl`** entries in your **local Maven repository** (folders with only **`.lastUpdated`** files) and reinstall the SNAPSHOT. **`mvn clean`** in this project does not clear the local repository cache.

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

Confirm your organisation's redistribution terms for HI WSDL before mirroring this repository.

## Building from source

**Audience:** contributors changing this repository - not integrators adding a Maven dependency.

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
| My Health Record (PCEHR) only | **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** - separate domain |

## Relationship to hi-b2b-client-java

| | **hi-wsdl-java** (this repo) | **hi-b2b-client-java** |
| --- | --- | --- |
| Artifact | `hi-wsdl` | `hi-b2b-client` |
| Facade clients | No | Yes (`au.gov.nehta.vendorlibrary.hi.*`) |
| Codegen | **26** committed `Service` stubs; **`-Pregenerate-sources`** for maintainer refresh only | **`11.0.0.1`**: in-repo **`wsimport`** (26 executions) by default; optional **`-Phi-wsdl-artifact`** uses matching **`hi-wsdl`** from Maven Central |

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors |
| **MAINTAINERS.md** | Releases and tooling |
| **SECURITY.md** | Secrets and licensed material |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |
| **wsdls/readme.txt** | Licensed WSDL tree staging (regeneration only) |

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java) | HI facade clients (depends on this artifact) |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facades (separate domain) |

## License

Apache License 2.0. See **LICENSE.txt**.
