# Change Log/Revision History

= 1.7.0
=========
24 Apr 2026
- **Version:** Maven **`au.gov.nehta:hi-wsdl`** **1.7.0-SNAPSHOT** (aligns with **hi-b2b-client-java** / **mhr-b2b-client-java** 1.7 line; SCM tag **`HEAD`** until release).
- Public repository documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY, LICENSE (ADHA Apache 2.0), build scripts, `.gitattributes`, `.editorconfig`, `.github/workflows/ci.yml`, **`schema/readme.txt`**, **`settings.xml.example`**.
- POM aligned with hi-b2b-client-java / mhr-b2b-client-java (Java 11, **`jaxws-rt`** 4.0.4, modern Maven plugins).
- **`-Pregenerate-sources`** profile: 26 **`wsimport`** executions with **`jaxb-xjc` 4.0.7** (valid schema-fragment Javadoc from XJC; no post-processing).
- Removed Javadoc post-processing scripts and **`GeneratedJavadocPreBlockTest`** after confirming JAXB 4.0.7 output.
- Updated generated sources, tests, and build dependencies to Java 11 and the Jakarta XML Web Services / Jakarta XML Binding namespaces.
- Added Jakarta XML WS stubs for **ConsumerSearchIHIBatchAsync** (`au.net.electronichealth.ns.hi.svc.consumersearchihibatchasync._3`): port type, service (WSDL loaded from classpath root `/HI_ConsumerSearchIHIBatchAsync-3.0.wsdl`), fault bean.
- Regenerated Jakarta XML WS / Jakarta XML Binding stubs for parity with HI .NET svcutil artefacts: ConsumerUpdateIHI 3.2, ConsumerNotifyDuplicate/Replica 3.2, ConsumerResolveProvisional 3.0.2, ConsumerCreate(Merge|Update)Provisional 3.0, ConsumerCreateUnverified 3.0.2, plus related message/core packages.
- Reused the existing `hi_override` XMLDSig JAXB bindings in new port types to avoid duplicate XML element mappings.
- Documented official HI WSDL/XSD sourcing from the Digital Health Developer Portal toolkit; MCA **`schema/`** is gitignored for local regeneration only.
- Updated Maven build plugins and API/runtime dependencies for Java 11.
- Added JUnit smoke tests for new generated service WSDL bindings and representative JAXB schema types.
- GPG signing for `mvn verify`/`install` is skipped by default; enable it for release builds with `-Dgpg.skip=false`.
- Added Jakarta XML WS stubs for **ConsumerCreateVerifiedIHI** 4.0 (`au.net.electronichealth.ns.hi.svc.consumercreateverifiedihi._4_0`), **ProviderSearchTdsProviderIndividual** / **ProviderManageTdsProviderIndividual** 5.1 (`providersearchtdsproviderindividual`, `providermanagetdsproviderindividual`). **ProviderMatchProviderAdministrativeIndividual** remains outside this repo’s WSDL set (virtual service in .NET tooling).

= 1.6.2
=========
13 Dec 2021
- Included WSDL files in correct location as per David Shepherdson merge request

= 1.6.1
=========
12 Feb 2021
- Converted to Maven

= 1.0 =
=======
- Initial release
