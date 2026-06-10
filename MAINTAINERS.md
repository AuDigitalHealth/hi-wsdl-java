# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release lines

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** — never Git branch names.

| Version | Java | APIs | `Service` stubs |
| ------- | ---- | ---- | ----------------- |
| **1.6.3** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`** | **14** (standard HI B2B) |
| **1.6.5** | 11 | **Jakarta** XML WS / Bind | **14** (standard HI B2B) |
| **1.7.0** | 11 | **Jakarta** XML WS / Bind | **26** (full MCA) |

**Git branch mapping (maintainers / checkout only — do not use in integrator docs):**

| Version | Git branch |
| ------- | ---------- |
| **1.6.3** | `java-8-javax` |
| **1.6.5** | `java-11-jakarta` |
| **1.7.0** | `java-11-jakarta-full-wsdl` |

**This checkout (`1.6.3-SNAPSHOT`):** Java **8**, committed **`javax`** generated types, **14** primary HI B2B **`@WebServiceClient`** services (no **`wsimport`** / XJC in this POM). **`hi-b2b-client`** **`1.6.3`** resolves **`hi-wsdl`** at **`${project.version}`** — **`mvn install`** here before an unpublished client **`verify`**. GA **`1.6.3`** pairs ship to Maven Central together. Type regeneration for new HI releases is on **`1.6.5`** / **`1.7.0`** lines.

## Artifact

- **`au.gov.nehta:hi-wsdl`** — HI WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** facade clients, TLS/signing, or runtime filesystem WSDL resolution (**`HiWsdlArtifactRoot`** lives in **hi-b2b-client-java**).

## Build (`1.6.3` line)

- **`maven.compiler.release` 8**
- Compile deps: **`jaxb-api` 2.3.1**, **`jaxws-api` 2.3.1** — no **`jaxws-rt`** in this POM
- **`maven-enforcer-plugin`:** bans Metro **`webservices-rt`** / **`webservices-api`** / **`webservices-extra*`** / **`metro-*`** and all **`jakarta.xml.*`** / **`jakarta.jws`** API coordinates ( **`javax`** compile deps only)
- Consumers (e.g. **hi-b2b-client**): **`com.sun.xml.ws:jaxws-rt` 2.3.7** (Eclipse EE4J, last **2.3.x** on Central for Java **8**)
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`verbose=false`**, **`quiet=true`**, **`failOnWarnings=false`**, **`detectOfflineLinks=false`**, **`source=${maven.compiler.release}`** (8).
- **No source regeneration** on **`1.6.3`** — no licensed MCA **`wsdls/xml`** tree and no **`-Pregenerate-sources`** profile. **`src/main/java`** and **`hi_override/`** are committed as-is.

## Release

1. Update **CHANGELOG.md** and **`pom.xml`** **`<version>`** / SCM **`<tag>`**.
2. **`mvn -B -Dgpg.skip=false clean verify`** (with signing credentials).
3. Deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
