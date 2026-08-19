# HI WSDL library

Maven artifact **`au.gov.nehta:hi-wsdl`** - HI B2B **WSDL resources** and **pre-generated JAX-WS / JAXB types** for Healthcare Identifiers (HI) client development.

For NEHTA facade clients, TLS, and signing, use **[hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java)**. This repository supplies the **generated type layer** and classpath WSDL only.

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)**. Use a **`<version>`** that matches your JDK (see **Versioning**).

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>hi-wsdl</artifactId>
  <version>8.0.0.1</version>
</dependency>
```

**This line (`8.0.0.1`):** Java **8**, **`javax.xml.ws`** / **`javax.xml.bind`**, **14** standard HI B2B **`Service`** stubs, **committed** generated types (no **`wsimport`** in the build). Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **2.3.7** at runtime in your application when you invoke SOAP endpoints. This JAR does not bundle **`jaxws-rt`**.

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

The **8.0.0.1** JAR ships the standard HI B2B binding set only (**14** `Service` stubs, **`javax`**). **11.0.0.1** and later lines use **Jakarta** and include **26** stubs (full MCA).
The current state of the **8.0.0.1** line is the original committed types, minimally updated to allow a successful build.
Java 8 is no longer a supported platform; consumers of this types library should upgrade to a current Java LTS version.

---

## Local development (SNAPSHOT)

This repository builds **`8.0.0.1-SNAPSHOT`**. The default lifecycle compiles **committed** types only. To make an unpublished JAR resolvable for other local projects:

```text
mvn -B "-Dgpg.skip=true" clean install
```

Consumers that declare **`au.gov.nehta:hi-wsdl`** at **`${project.version}`** (including **`hi-b2b-client-java`**) need that install (or a Central GA) before their **`verify`**.

If Maven warns that a **GA** POM is missing (for example **`8.0.0.1`** before Central publish), clear stale **`au/gov/nehta/hi-wsdl`** entries in your **local Maven repository** (folders with only **`.lastUpdated`** files) and reinstall the SNAPSHOT. **`mvn clean`** in this project does not clear the local repository cache.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| **14** primary binding WSDLs (classpath) | `src/main/resources/HI_*.wsdl` (plus supporting message/interface WSDLs in the same tree) |
| Generated stubs (`javax`) | `src/main/java/` |
| XMLDSig JAXB override | `src/main/java/hi_override/` |

## Building from source

**Audience:** contributors changing this repository - not integrators adding a Maven dependency.

Prerequisites: **JDK 8+**, **Maven 3.6+**. All JAX-WS/JAXB types are **committed** in **`src/main/java`**; the build compiles them only (no codegen, no licensed MCA schema tree required).

```text
mvn -B "-Dgpg.skip=true" clean verify
```

See **`CONTRIBUTING.md`** for **`mvn install`** when testing unpublished snapshots locally.

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [hi-b2b-client-java](https://github.com/AuDigitalHealth/hi-b2b-client-java) | HI facade clients (depends on this artifact) |
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
