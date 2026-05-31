# Maintainer guide (hi-wsdl-java)

Audience: maintainers of this repository. Facade client design lives in **hi-b2b-client-java** `MAINTAINERS.md`.

Paths are relative to this project root (directory containing **`pom.xml`**).

---

## 1. What this repository is

Maven coordinates:

- **`au.gov.nehta:hi-wsdl`** (packaging **`jar`**) — HI WSDL on the classpath + **Jakarta** generated JAX-WS/JAXB types (Java **11**)

**Not** included: HI facade clients, TLS/signing handlers, or runtime filesystem WSDL resolution (see **hi-b2b-client-java** `HiWsdlArtifactRoot` when using that client).

---

## 2. Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/` | HI `HI_*.wsdl` (classpath root; packaged in JAR) |
| `src/main/java/` | Committed generated types + `hi_override` XMLDSig |
| `src/test/java/au/gov/nehta/hiwsdl/` | Offline binding smoke tests |
| `wsdls/readme.txt` | Licensed WSDL tree staging instructions (tracked) |
| `wsdls/xml/` | Local licensed WSDL/XSD for regeneration (**gitignored**) |
| `scripts/generate-wsimport-executions.py` | Extract 26 wsimport executions from **hi-b2b-client-java** |
| `scripts/write-pom.py` | Refresh `-Pregenerate-sources` block in **`pom.xml`** |
| `.github/workflows/ci.yml` | GitHub Actions **`mvn verify`** on push/PR |

---

## 3. HI service coverage

Generated **`Service`** stubs cover the same **26** primary HI B2B interfaces used by **hi-b2b-client-java** `wsimport` (consumer 3.0–4.0, provider 3.2 / 5.0 / 5.1, TDS 5.1, batch async 5.1, etc.). Interface-only WSDL variants may also exist under **`src/main/resources`**.

**ProviderMatchProviderAdministrativeIndividual** is intentionally out of scope (virtual service in .NET tooling).

---

## 4. Build design

- **Java 11**, **`jakarta.*`** APIs only in **`src/main/java`** (no `javax.xml.bind` / `javax.xml.ws`).
- **`jaxws-rt`** **4.0.4** (runtime scope in POM).
- Generated sources are **committed**; root POM has **no** default **`wsimport`** execution.
- Regeneration: **`-Pregenerate-sources`** — sync **`pom.xml`** from **hi-b2b-client-java** via **`scripts/write-pom.py`** (after **`scripts/generate-wsimport-executions.py`**, with **`HI_B2B_CLIENT_POM`** pointing at a hi-b2b checkout if not a sibling). WSDL from **`hi.wsdl.tree.root`** (default **`wsdls/xml/`**). Sync classpath WSDL with **`scripts/sync-wsdl-resources.*`**. Commit types with **`-Dhi.wsdl.sync.generated=true`**.
- **`maven-gpg-plugin`**: skipped unless **`-Dgpg.skip=false`** (releases).

Align **`jaxws-rt`** with **hi-b2b-client-java** when bumping toolchain versions.

---

## 5. Release

1. Update **CHANGELOG.md** and **`pom.xml`** **`<version>`** / SCM **`<tag>`**.
2. **`mvn -B -Dgpg.skip=false clean verify`** (with signing credentials).
3. Deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
