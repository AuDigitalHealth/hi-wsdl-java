# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release lines

| Version | Java | APIs | `Service` stubs |
| ------- | ---- | ---- | ----------------- |
| **1.6.3** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`** | **14** (standard HI B2B) |
| **1.6.6** | 11 | **Jakarta** XML WS / Bind | **14** (standard HI B2B) |
| **1.7.0** | 11 | **Jakarta** XML WS / Bind | **26** (full MCA) |

**Git branch mapping (maintainers / checkout only — do not use in integrator docs):**

| Version | Git branch |
| ------- | ---------- |
| **1.6.3** | `java-8-javax` |
| **1.6.6** | `java-11-jakarta` |
| **1.7.0** | `java-11-jakarta-full-wsdl` |

**This tree (`1.6.6-SNAPSHOT`):** Java **11**, committed **Jakarta** generated types, **14** primary HI B2B **`@WebServiceClient`** services. **`hi-b2b-client`** **`1.6.6`** resolves **`hi-wsdl`** at **`${project.version}`** — **`mvn install`** here before an unpublished client **`verify`**. GA **`1.6.6`** pairs ship to Maven Central together.

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

## HI service coverage (`1.6.6`)

**14** primary HI B2B interfaces (consumer search/batch-sync, provider 3.2 / 5.0 / 5.1 batch async). Additional **`HI_*.wsdl`** under **`src/main/resources`** ship in the JAR without committed port types.

**ProviderMatchProviderAdministrativeIndividual** is intentionally out of scope (virtual service in .NET tooling). Full MCA (**26** services) is **`1.7.0`**.

## Build (`1.6.6` line)

- **`maven.compiler.release` 11**
- Compile deps: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3** — no **`jaxws-rt`** in this POM
- **`jaxws-rt` 4.0.4** for **`-Pregenerate-sources`** only (not a compile/runtime dependency of the published JAR)
- Generated sources are **committed**; root POM has **no** default **`wsimport`** execution
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`verbose=false`**, **`quiet=true`**, **`failOnWarnings=false`**, **`detectOfflineLinks=false`**, **`source=11`**. Do not hand-edit Javadoc in generated **`src/main/java`**.
- **Regenerate committed types:** `mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"` — WSDL from **`hi.wsdl.tree.root`** (default **`wsdls/xml/`**). Copy **`HI_*.wsdl`** into **`src/main/resources/`** when the licensed tree changes. Pins **`jaxb-xjc`** / **`jaxb-jxc`** **4.0.9** on **`jaxws-maven-plugin`**.

Align **`jaxws-rt`** with **hi-b2b-client-java** when bumping toolchain versions.

## Release

Publishing uses **`central-publishing-maven-plugin`** (Sonatype Central Portal). Copy **`settings.xml.example`** → **`settings.xml`**, server id **`central`**.

**Parallel release lines (maintainers only):** each Git branch publishes a **different Maven version** — integrators choose by coordinate, not branch name.

| Branch | Java | HI client / WSDL version | Facades |
| ------ | ---- | ------------------------ | ------- |
| **`java-8-javax`** | 8 / javax | **1.6.3** | 14 |
| **`java-11-jakarta`** | 11 / Jakarta | **1.6.6** | 14 |
| **`java-11-jakarta-full-wsdl`** | 11 / Jakarta | **1.7.0** | 26 |

Release **`hi-wsdl`** and **`hi-b2b-client`** at the **same GA version** on the matching branch pair before integrators upgrade.

### SNAPSHOT or manual GA

1. Update **CHANGELOG.md** (and **`pom.xml`** / SCM **`<tag>`** for manual GA).
2. **`mvn -B "-Prelease" clean verify`**
3. **`mvn -B "-Prelease" deploy`**

Git/SCM settings for **`maven-release-plugin`** live in **`pom.xml`** properties (**`scm.repo.url`**, **`release.*`**). Tags default to **`{artifactId}-{version}`** (e.g. **`hi-wsdl-1.7.0`**).

### Automated GA (`maven-release-plugin`)

Run on the **target branch** with a **clean** working tree. The plugin commits version bumps, creates the release tag, deploys from the tag checkout, bumps to the next **`-SNAPSHOT`**, and **pushes branch + tag** (**`pushChanges`** / **`remoteTagging`** in **`pom.xml`**). Git remote credentials (SSH or HTTPS) must work non-interactively.

```text
mvn -B "-Prelease" release:prepare release:perform -DreleaseVersion=1.7.0 -DdevelopmentVersion=1.7.1-SNAPSHOT -Dtag=hi-wsdl-1.7.0
```

Replace versions and **`-Dtag`** for the branch you are on (**`hi-wsdl-1.6.6`**, **`hi-b2b-client-1.6.3`**, etc.). Omit **`-D…`** only if you accept interactive prompts.

**After success:** confirm the artifact on Central; repeat on the paired types/client repo. No extra Git steps unless push failed (then **`git push origin <branch>`** and **`git push origin <tag>`**).

**`-Dgpg.skip=false`** is equivalent to **`-Prelease`** for signing.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
