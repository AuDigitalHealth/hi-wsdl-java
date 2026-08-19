# Maintainer notes

**Audience:** people changing the **`hi-wsdl`** build, generated types, WSDL layout, or release process - not library integrators. Integrators should use **README.md**, published Javadoc, and **`pom.xml`** coordinates.

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Versioning

The **first number** of **`<version>`** is the **Java SE** target of **this** types JAR.

| Maven version | Java SE |
| ------------- | ------- |
| **8.0.0.1** | **8** |
| **11.0.0.1** | **11** |
| **17.0.0.1** | **17** |
| **21.0.0.1** | **21** |
| **24.0.0.1** | **24** |

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** - never Git branch names.

| Version | Java | XML APIs | `Service` stubs |
| ------- | ---- | -------- | --------------- |
| **8.0.0.1** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`** | **14** (standard HI B2B) |
| **11.0.0.1** | 11 | **Jakarta** XML WS / Bind | **26** (full MCA) |
| **17.0.0.1** | 17 | **Jakarta** XML WS / Bind | **26** (full MCA) |
| **21.0.0.1** | 21 | **Jakarta** XML WS / Bind | **26** (full MCA) |
| **24.0.0.1** | 24 | **Jakarta** XML WS / Bind | **26** (full MCA) |

**Git branch mapping (maintainers / checkout only - do not use in integrator docs):**

| Version | Official Git branch |
| ------- | ------------------- |
| **8.0.0.1** | `java-8` |
| **11.0.0.1** | `java-11` |
| **17.0.0.1** | `java-17` |
| **21.0.0.1** | `java-21` |
| **24.0.0.1** | `java-24` |

Artifact id stays **`hi-wsdl`**; the version distinguishes the Java SE line. Downstream projects that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) keep the **same** version and the **same** branch names on their matching line.

On a given branch, **do not change the first number** of **`<version>`**. Next GA on **`java-11`** is **`11.0.0.2`** (then **`11.0.0.2-SNAPSHOT`**), not **`17.x`**. A new Java SE target is a **new branch**, not a bump on this one.

**This checkout (`11.0.0.1-SNAPSHOT`):** Java **11**, committed **Jakarta** generated types, **26** primary HI B2B **`@WebServiceClient`** services. Stack and **`.github/workflows/ci.yml`** (branch **`java-11`**, JDK **11**) below apply to **this line only**. Other branches keep their own **`pom.xml`**, CI branch filter, and JDK. Type regeneration uses **`-Pregenerate-sources`** and a local licensed **`wsdls/xml/`** tree.

## Artifact

- **`au.gov.nehta:hi-wsdl`** - HI WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** facade clients, TLS/signing, or runtime filesystem WSDL resolution (**`HiWsdlArtifactRoot`** lives in **hi-b2b-client-java**).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/` | HI `HI_*.wsdl` (classpath root; packaged in JAR) |
| `src/main/java/` | Committed generated types + `hi_override` XMLDSig |
| `src/test/java/au/gov/nehta/hiwsdl/` | Offline binding smoke tests |
| `wsdls/readme.txt` | Licensed WSDL tree staging instructions (tracked) |
| `wsdls/xml/` | Local licensed WSDL/XSD for regeneration (**gitignored**) |
| `pom.xml` (`-Pregenerate-sources`) | **26** **`wsimport`** executions; align with **hi-b2b-client-java** **11.0.0.1** when adding services |
| `.github/workflows/ci.yml` | GitHub Actions **`mvn verify`** on **`java-11`**, JDK **11** |

## Release scope (`11.0.0.1`)

- **Goal:** Java **11** bytecode (`maven.compiler.release` **11**) with **Jakarta** generated types; **26** full MCA **`Service`** stubs.
- The default lifecycle does **not** run **`wsimport`**. **`src/main/java`** and **`hi_override/`** are committed. Refresh with **`-Pregenerate-sources`**.

## HI service coverage (`11.0.0.1`)

**26** primary HI B2B interfaces (consumer 3.0-4.0, provider 3.2 / 5.0 / 5.1, TDS 5.1, batch async 5.1, etc.). Interface-only WSDL variants may also exist under **`src/main/resources`**.

**ProviderMatchProviderAdministrativeIndividual** is intentionally out of scope (virtual service; not a published HI B2B interface in this artifact).

## Contributors vs release publisher (`pom.xml`)

**Contributors (PRs, ordinary commits):** Do not change **`<version>`** (stay on **`-SNAPSHOT`** unless the maintainer requests a bump), **`<scm><tag>`**, or **`distributionManagement`**. If a maintainer requests a SNAPSHOT bump on this branch, change only the trailing numbers (**`11.0.0.2-SNAPSHOT`**), never the Java SE digit. Leave **`maven-gpg-plugin`** **`skip`** **`true`** so default **`mvn verify`** does not require a signing key. Record user-visible work under **`CHANGELOG.md`** in the **`= <pom-version> =`** block that matches **`pom.xml`** **`<version>`**.

**Release publisher:** In the release change set: set **`<version>`** to the GA coordinate (no **`-SNAPSHOT`**); set **`<scm><tag>`** to the Git tag you will publish (match existing tag naming). Move **`CHANGELOG.md`** bullets from the snapshot section into a new **`= <GA-version> =`** section; add a fresh **`-SNAPSHOT`** block for the next development cycle. Deploy via Sonatype Central Portal (**`central-publishing-maven-plugin`**; copy **`settings.xml.example`** -> **`settings.xml`**, server id **`central`**). See **Release** below.

## Release

Publishing uses **`central-publishing-maven-plugin`** (Sonatype Central Portal). Copy **`settings.xml.example`** -> **`settings.xml`**, server id **`central`**.

**Parallel release lines (maintainers only):** each Git branch of **this** repository publishes a **different Maven version** of **`hi-wsdl`**. Integrators choose by coordinate, not branch name. The first number of that version is the targeted Java SE version. Run **`release:prepare` / `release:perform`** (or manual deploy) **on that branch** (not detached HEAD).

| Branch | Java | `hi-wsdl` | `Service` stubs |
| ------ | ---- | --------- | --------------- |
| **`java-8`** | 8 / javax | **8.0.0.1** | 14 |
| **`java-11`** | 11 / Jakarta | **11.0.0.1** | 26 |
| **`java-17`** | 17 / Jakarta | **17.0.0.1** | 26 |
| **`java-21`** | 21 / Jakarta | **21.0.0.1** | 26 |
| **`java-24`** | 24 / Jakarta | **24.0.0.1** | 26 |

**Order:** publish **this artifact** first. Any consumer that depends on **`hi-wsdl`** at the same GA (including **`hi-b2b-client`**) cannot complete **`verify`** / **`release:perform`** until this coordinate is on Central (or installed locally).

**`-DdevelopmentVersion`:** keep the same first number as **`-DreleaseVersion`** (example on this line: **`11.0.0.1`** then **`11.0.0.2-SNAPSHOT`**).

### SNAPSHOT or manual GA

1. Update **CHANGELOG.md** (and **`pom.xml`** / SCM **`<tag>`** for manual GA).
2. **`mvn -B "-Prelease" clean verify`**
3. **`mvn -B "-Prelease" deploy`**

Git/SCM settings for **`maven-release-plugin`** live in **`pom.xml`** properties (**`scm.repo.url`**, **`release.*`**). Tags default to **`{artifactId}-{version}`** (e.g. **`hi-wsdl-11.0.0.1`**).

### Automated GA (`maven-release-plugin`)

Run on the **target branch** with a **clean** working tree. The plugin commits version bumps, creates the release tag, deploys from the tag checkout, bumps to the next **`-SNAPSHOT`**, and **pushes branch + tag** (**`pushChanges`** / **`remoteTagging`** in **`pom.xml`**). Git remote credentials (SSH or HTTPS) must work non-interactively.

```text
mvn -B "-Prelease" release:prepare release:perform -DreleaseVersion=11.0.0.1 -DdevelopmentVersion=11.0.0.2-SNAPSHOT -Dtag=hi-wsdl-11.0.0.1
```

Replace **`-DreleaseVersion`**, **`-DdevelopmentVersion`**, and **`-Dtag`** for the branch you are on (same first number). Omit **`-D...`** only if you accept interactive prompts.

**After success:** confirm **`hi-wsdl`** GA on Central. Downstream artifacts that pin this coordinate can then cut their matching GA. No extra Git steps unless push failed; then from the release branch:

`git push origin java-11` (or **`java-8`**, **`java-17`**, **`java-21`**, **`java-24`**) and **`git push origin <tag>`**.

**`-Dgpg.skip=false`** is equivalent to **`-Prelease`** for signing.

## Changelog and releases

**`CHANGELOG.md`** uses **`= version =`** section headers. Match the snapshot header to **`pom.xml`** **`<version>`** until the publisher cuts GA.

## New Java SE line

When adding a line (e.g. Java **25**): create **`java-25`** in **this** repository from the nearest existing types line; set **`<version>`** first number to **25** (e.g. **`25.0.0.1-SNAPSHOT`**); set **`maven.compiler.release`**, JAX-WS / JAXB coordinates, CI **`java-version`** / branch filter, WSDL/stub inventory, and docs to that line. Do not retarget an existing branch.

Consumers that pin **`hi-wsdl`** to **`${project.version}`** need a matching line of their own once this artifact exists.

## Build (`11.0.0.1` line)

This subsection is **this `java-11` checkout**. Other lines document their stack in their own **MAINTAINERS** / **`pom.xml`**.

- **`maven.compiler.release` 11**
- Compile deps: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3** - no **`jaxws-rt`** in the published JAR (**`test`** scope only, for **`GeneratedWsdlBindingsTest`**)
- **`jaxws-rt` 4.0.4** for **`-Pregenerate-sources`** only (via **`jaxws-tools`** on **`jaxws-maven-plugin`** classpath; not a compile/runtime dependency of the published JAR)
- Consuming applications add **`com.sun.xml.ws:jaxws-rt` 4.0.4** at runtime
- Generated sources are **committed**; root POM has **no** default **`wsimport`** execution
- **`maven-enforcer-plugin`:** bans legacy Metro **`webservices-*`** and **`javax.xml.ws` / `javax.xml.bind`**
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`verbose=false`**, **`quiet=true`**, **`failOnWarnings=false`**, **`detectOfflineLinks=false`**, **`source=${maven.compiler.release}`** (11). Do not hand-edit Javadoc in generated **`src/main/java`**.
- **Regenerate committed types:** `mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"` - licensed tree at **`hi.wsdl.tree.root`** (default **`wsdls/xml/`**). Copy updated **`HI_*.wsdl`** into **`src/main/resources/`** when interfaces change. Pins **`jaxb-xjc`** **4.0.9** on **`jaxws-maven-plugin`**.
- **`.github/workflows/ci.yml`:** GitHub Actions **`mvn verify`** on **`java-11`**, JDK **11**

Align **`jaxws-rt`** with **hi-b2b-client-java** when bumping toolchain versions.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 - see **LICENSE.txt**.
