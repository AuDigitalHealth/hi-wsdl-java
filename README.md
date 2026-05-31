# HI WSDL library (Java 11 / Jakarta)

Maven artifact **`au.gov.nehta:hi-wsdl`** — HI B2B **WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for Healthcare Identifiers (HI) client development.

For hand-written facade clients, TLS, and signing, use **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)**. This repository supplies the **generated type layer** only.

## Dependency

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>hi-wsdl</artifactId>
  <version>1.7.0-SNAPSHOT</version>
</dependency>
```

Runtime (transitive in this repo): Eclipse **`jaxws-rt`** 4.x. Align Jakarta XML Web Services versions with **`hi-b2b-client`** if both are on the classpath.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| HI service WSDL (classpath) | `src/main/resources/HI_*.wsdl` |
| Jakarta generated stubs | `src/main/java/` |
| XMLDSig JAXB override | `src/main/java/hi_override/` |

The published JAR includes WSDL on the classpath root (for example `/HI_ConsumerSearchIHI-3.0.wsdl`). Generated **`Service`** classes reference those locations.

## Licensed MCA schemas (regeneration only)

WSDL files reference **`schema/mca/...`** at the repository root (toolkit layout). The **MCA XSD tree is not in Git** — obtain it from the official pack when **regenerating** types from WSDL:

- [Healthcare Identifiers Integration Toolkit](https://developer.digitalhealth.gov.au/resources/healthcare-identifiers-integration-toolkit-v1-2) (Digital Health Developer Portal)
- [HI Service for software developers](https://www.servicesaustralia.gov.au/healthcare-identifier-hi-service-for-software-developers) (Services Australia)

Copy the licensed toolkit **`xml`** tree to **`wsdls/xml/`** in this repository (see **`wsdls/readme.txt`**). A normal **`mvn verify`** on committed sources does **not** require a local licensed tree.

Confirm your organisation’s redistribution terms for HI WSDL before mirroring this repository.

## Build from source

Prerequisites: **JDK 11+**, **Maven 3.6+**. Generated Java is **committed**; default build does not run **`wsimport`**. CI runs the same **`mvn verify`** on every push/PR (see **`.github/workflows/ci.yml`**).

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or **`build.ps1`**, **`build.sh`**, **`build.bat`**.

Install to the local repository:

```text
mvn -B "-Dgpg.skip=true" clean install
```

## Relationship to hi-b2b-client-java

| | **hi-wsdl-java** (this repo) | **hi-b2b-client-java** |
| --- | --- | --- |
| Artifact | `hi-wsdl` | `hi-b2b-client` |
| Facade clients | No | Yes (`au.gov.nehta.vendorlibrary.hi.*`) |
| Codegen | Pre-generated, committed; **`-Pregenerate-sources`** matches hi-b2b **26** wsimport executions | In-repo **`wsimport`** (26 executions) |
| WSDL in this repo | `src/main/resources/HI_*.wsdl` (shipped in JAR); regen tree **`wsdls/xml`** | Licensed tree under `wsdls/xml/` (not in public Git) |

**hi-b2b-client-java** default build runs in-repo **`wsimport`**. Optional **`-Phi-wsdl-artifact`** on that client uses **`hi-wsdl`** instead (install this artifact to `~/.m2` first). Use **`hi-wsdl`** alone when you need HI types and classpath WSDL without the full client library.

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
| [hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java) | HI facade clients; default in-repo **`wsimport`**, or **`-Phi-wsdl-artifact`** to use this JAR |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facades (separate domain) |

## License

Apache License 2.0. See **LICENSE.txt**.
