# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release lines

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

**This tree (`1.7.0-SNAPSHOT`):** Java **11**, committed **Jakarta** generated types, **26** primary HI B2B **`@WebServiceClient`** services. **`hi-b2b-client`** **`1.7.0`** aligns with matching **`hi-wsdl`** releases from Maven Central.

## Artifact

- **`au.gov.nehta:hi-wsdl`** — HI WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** facade clients, TLS/signing, or runtime filesystem WSDL resolution (**`HiWsdlArtifactRoot`** lives in **hi-b2b-client-java**).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/` | HI `HI_*.wsdl` (classpath root; packaged in JAR) |
| `src/main/java/` | Committed generated types + `hi_override` XMLDSig |
| `src/test/java/au/gov/nehta/hiwsdl/` | Offline binding smoke tests |
| `wsdls/readme.txt` | Licensed WSDL tree staging instructions (tracked) |
| `wsdls/xml/` | Local licensed WSDL/XSD for regeneration (**gitignored**) |
| `pom.xml` (`-Pregenerate-sources`) | **26** **`wsimport`** executions; align with **hi-b2b-client-java** 1.7.0 when adding services |
| `.github/workflows/ci.yml` | GitHub Actions **`mvn verify`** on push/PR to release branches |

## HI service coverage (`1.7.0`)

**26** primary HI B2B interfaces (consumer 3.0–4.0, provider 3.2 / 5.0 / 5.1, TDS 5.1, batch async 5.1, etc.). Interface-only WSDL variants may also exist under **`src/main/resources`**.

**ProviderMatchProviderAdministrativeIndividual** is intentionally out of scope (virtual service in .NET tooling).

## Build (`1.7.0` line)

- **`maven.compiler.release` 11**
- Compile deps: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3** — no **`jaxws-rt`** in the published JAR (**`test`** scope only, for **`GeneratedWsdlBindingsTest`**)
- **`jaxws-rt` 4.0.4** for **`-Pregenerate-sources`** only (via **`jaxws-tools`** on **`jaxws-maven-plugin`** classpath; not a compile/runtime dependency of the published JAR)
- Generated sources are **committed**; root POM has **no** default **`wsimport`** execution
- **`maven-enforcer-plugin`:** bans legacy Metro **`webservices-*`** and **`javax.xml.ws` / `javax.xml.bind`**
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`verbose=false`**, **`quiet=true`**, **`failOnWarnings=false`**, **`detectOfflineLinks=false`**, **`source=11`**. Do not hand-edit Javadoc in generated **`src/main/java`**.
- **Regenerate committed types:** `mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"` — licensed tree at **`hi.wsdl.tree.root`** (default **`wsdls/xml/`**). Copy updated **`HI_*.wsdl`** into **`src/main/resources/`** when interfaces change. Pins **`jaxb-xjc`** **4.0.9** on **`jaxws-maven-plugin`**.

Align **`jaxws-rt`** with **hi-b2b-client-java** when bumping toolchain versions.

## Release

1. Update **CHANGELOG.md** and **`pom.xml`** **`<version>`** / SCM **`<tag>`**.
2. **`mvn -B -Dgpg.skip=false clean verify`** (with signing credentials).
3. Deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
