# Change Log/Revision History

= 1.6.5-SNAPSHOT =
======
- **`1.6.5`** line: Java **11** / **Jakarta** committed types and classpath WSDL (**14** `Service` stubs, standard HI B2B scope).
- Compile: **`jakarta.xml.bind-api`** 4.0.5, **`jakarta.xml.ws-api`** 4.0.3 only (no **`jaxws-rt`** in the published JAR). **`junit`** test-scoped for offline smoke tests.
- Javadoc: **`maven-javadoc-plugin`** 3.12.0; committed types use PCEHR/XJC 4.0.7+ schema-fragment style; **`-Pregenerate-sources`** pins **`jaxb-xjc`** / **`jaxb-jxc`** **4.0.9** for maintainer regen.

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
