# Change Log/Revision History

= 24.0.0 =
=======
- Maven **`au.gov.nehta:hi-wsdl`** **24.0.0** (Java **24** / **Jakarta**, **26** `Service` stubs, full MCA). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use the same coordinate.
- Compile: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3**. Runtime guidance: consumers add **`jaxws-rt` 4.0.5** (not packaged in this JAR). **`jaxws-maven-plugin` 4.0.5** for **`-Pregenerate-sources`** on JDK 17+.
- Messages `searchIHI`: `electronicCommunication` before `dateOfBirth` (international address before unstructured) so Consumer Search IHI (including batch) request XML matches the HI Service message schema.
- Interface `searchIHI`: optional `electronicCommunication` before `dateOfBirth` and `australianUnstructuredStreetAddress` before `internationalAddress` on **`HI_ConsumerSearchIHIInterface-3.0`**.
- **Tests:** **`JakartaStackTest`**, **`SearchIhiPropOrderTest`**, **`SearchForProviderIndividualPropOrderTest`**, **`AustralianStreetAddressPropOrderTest`**, **`InternationalAddressPropOrderTest`**, **`WsdlStubContractTest`**, **`HiWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**. Stub count remains **26**.

= 21.0.0 =
=======
- Maven **`au.gov.nehta:hi-wsdl`** **21.0.0** (Java **21** / **Jakarta**, **26** `Service` stubs, full MCA). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use the same coordinate.
- Compile: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3**. Runtime guidance: consumers add **`jaxws-rt` 4.0.5** (not packaged in this JAR). **`jaxws-maven-plugin` 4.0.5** for **`-Pregenerate-sources`** on JDK 17+.
- Messages `searchIHI`: `electronicCommunication` before `dateOfBirth` (international address before unstructured) so Consumer Search IHI (including batch) request XML matches the HI Service message schema.
- Interface `searchIHI`: optional `electronicCommunication` before `dateOfBirth` and `australianUnstructuredStreetAddress` before `internationalAddress` on **`HI_ConsumerSearchIHIInterface-3.0`**.
- **Tests:** **`JakartaStackTest`**, **`SearchIhiPropOrderTest`**, **`SearchForProviderIndividualPropOrderTest`**, **`AustralianStreetAddressPropOrderTest`**, **`InternationalAddressPropOrderTest`**, **`WsdlStubContractTest`**, **`HiWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**. Stub count remains **26**.

= 17.0.0 =
=======
- Maven **`au.gov.nehta:hi-wsdl`** **17.0.0** (Java **17** / **Jakarta**, **26** `Service` stubs, full MCA). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use the same coordinate.
- Compile: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3**. Runtime guidance: consumers add **`jaxws-rt` 4.0.5** (not packaged in this JAR). **`jaxws-maven-plugin` 4.0.5** for **`-Pregenerate-sources`** on JDK 17+.
- Messages `searchIHI`: `electronicCommunication` before `dateOfBirth` (international address before unstructured) so Consumer Search IHI (including batch) request XML matches the HI Service message schema.
- Interface `searchIHI`: optional `electronicCommunication` before `dateOfBirth` and `australianUnstructuredStreetAddress` before `internationalAddress` on **`HI_ConsumerSearchIHIInterface-3.0`**.
- **Tests:** **`JakartaStackTest`**, **`SearchIhiPropOrderTest`**, **`SearchForProviderIndividualPropOrderTest`**, **`AustralianStreetAddressPropOrderTest`**, **`InternationalAddressPropOrderTest`**, **`WsdlStubContractTest`**, **`HiWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**. Stub count remains **26**.

= 11.0.0 =
=======
- Maven **`au.gov.nehta:hi-wsdl`** **11.0.0** (Java **11** / **Jakarta**, **26** `Service` stubs, full MCA). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use the same coordinate.
- Runtime guidance: consumers add **`jaxws-rt` 4.0.5** (not packaged in this JAR).
- Messages `searchIHI`: `electronicCommunication` before `dateOfBirth` (international address before unstructured) so Consumer Search IHI (including batch) request XML matches the HI Service message schema.
- Interface `searchIHI`: optional `electronicCommunication` before `dateOfBirth` and `australianUnstructuredStreetAddress` before `internationalAddress` on **`HI_ConsumerSearchIHIInterface-3.0`**.
- **Tests:** **`SearchIhiPropOrderTest`**, **`SearchForProviderIndividualPropOrderTest`**, **`AustralianStreetAddressPropOrderTest`**, **`InternationalAddressPropOrderTest`**, **`WsdlStubContractTest`**, **`HiWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**.

= 1.7.0
=========
24 Apr 2026
- **Version:** Maven **`au.gov.nehta:hi-wsdl`** **1.7.0-SNAPSHOT** (aligns with **hi-b2b-client-java** 1.7 line; SCM tag **`HEAD`** until release).
- **Scope:** Full MCA - **26** primary HI B2B **`@WebServiceClient`** services (Java **11**, Jakarta XML WS / Bind).
- **POM:** lean compile deps (**`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3** only); **`jaxws-rt`** not in the published JAR (consumers add **`jaxws-rt` 4.0.5** at runtime). **`maven-enforcer-plugin`** bans legacy Metro / **`javax`** JAX-WS.
- **`-Pregenerate-sources`:** **26** **`wsimport`** executions; licensed tree at **`wsdls/xml/`** (**`hi.wsdl.tree.root`**); **`jaxb-xjc` 4.0.9** for valid schema-fragment Javadoc; **`hi_override`** XMLDSig aligned with **1.6.5** line.
- **Tests:** **`HiWsdlArtifactTest`** asserts **26** classpath WSDLs and **26** **`@WebServiceClient`** stubs; **`GeneratedWsdlBindingsTest`** smoke bindings.
- **New/regenerated services:** ConsumerSearchIHIBatchAsync 3.0; ConsumerUpdateIHI 3.2; ConsumerNotifyDuplicate/Replica 3.2; ConsumerResolveProvisional 3.0.2; ConsumerCreate(Merge|Update)Provisional 3.0; ConsumerCreateUnverified 3.0.2; ConsumerCreateVerifiedIHI 4.0; ProviderSearch/Manage TDS ProviderIndividual 5.1; plus related message/core packages. **ProviderMatchProviderAdministrativeIndividual** remains out of scope (virtual service; not a published HI B2B interface in this artifact).
- **Documentation:** version-first release-lines table (**1.6.3** / **1.6.5** / **1.7.0**); README, CONTRIBUTING, MAINTAINERS, SECURITY, **`wsdls/readme.txt`**, build scripts, `.github/workflows/ci.yml`.
- GPG signing skipped by default (**`-Dgpg.skip=true`**); enable for release with **`-Dgpg.skip=false`**.

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
