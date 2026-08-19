# Change Log/Revision History

= 8.0.0.1 =
=======
- Maven **`au.gov.nehta:hi-wsdl`** **8.0.0.1** (Java **8** / **`javax`**, **14** `Service` stubs). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`hi-wsdl`** to **`${project.version}`** (including **`hi-b2b-client`**) use the same coordinate.
- Messages `searchIHI`: `electronicCommunication` before `dateOfBirth` so Consumer Search IHI (including batch sync) request XML matches the HI Service message schema.
- Interface `searchIHI`: optional `electronicCommunication` before `dateOfBirth` and `australianUnstructuredStreetAddress` before `internationalAddress` on **`HI_ConsumerSearchIHIInterface-3.0`**.
- **Tests:** **`SearchIhiPropOrderTest`** asserts Messages and Interface `searchIHI` `propOrder`. **`SearchForProviderIndividualPropOrderTest`** asserts HI31/HI33 `searchForProviderIndividual` `propOrder`. **`AustralianStreetAddressPropOrderTest`** asserts Consumer `AustralianStreetAddressType` / `AustralianUnstructuredStreetAddressType` and HI31/HI33 `SearchAustralianAddressType` `propOrder`. **`InternationalAddressPropOrderTest`** asserts Consumer `InternationalAddressType`, provider `InternationalAddressType` / `InternationalAddressCriteriaType`, and HI31/HI33 `SearchInternationalAddressType` `propOrder`.

= 1.6.3-SNAPSHOT =
======
- **`1.6.3`** line: Java **8** / **`javax`** committed types and classpath WSDL (**14** `Service` stubs, standard HI B2B scope).
- POM: Eclipse EE4J stack alignment - compile **`jaxb-api`** / **`jaxws-api`** only; **`maven-enforcer-plugin`** bans legacy Metro **`webservices-*`** bundles. Consuming apps use **`jaxws-rt` 2.3.7** at runtime.
- Build plugins and dependency versions updated to latest Java **8**-compatible releases (aligned with **hi-b2b-client-java** **`1.6.3`** tooling where applicable).
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`quiet=true`**, **`failOnWarnings=false`**, **`detectOfflineLinks=false`**.

= 1.6.2 =
=========
13 Dec 2021
- Included WSDL files in correct location as per David Shepherdson merge request

= 1.6.1 =
=========
12 Feb 2021
- Converted to Maven

= 1.0 =
=======
- Initial release
