# HI WSDL Library

Introduction
============

This library provides the artefacts required to support Health Identifier (HI) B2B clients.

Authoritative WSDL / XSD source (compliance and capability)
===========================================================

This repository ships WSDL files under `src/main/resources`. Those interfaces use
`schemaLocation` references such as `../../../schema/mca/...` relative to each WSDL
file, i.e. they resolve to **`schema/mca/...`** at this project root,
matching the layout inside the licensed
**Healthcare Identifiers Integration Toolkit** (MCA `xml/schema` tree).

**You must obtain the official, current WSDL/XSD pack from the Australian Digital
Health Agency**, not from third-party copies, for conformance and redistribution
policy:

- [Healthcare Identifiers Integration Toolkit](https://developer.digitalhealth.gov.au/resources/healthcare-identifiers-integration-toolkit-v1-2)
  on the **Digital Health Developer Portal** (licence acceptance and developer
  registration apply).
- HI Service overview for developers: [Services Australia – HI Service for software developers](https://www.servicesaustralia.gov.au/healthcare-identifier-hi-service-for-software-developers).

After you unzip the toolkit, copy or stage the licensed schema files locally:

1. Copy the toolkit’s `xml/schema` folder to **`schema`** at the root of this repo
   (so `schema/mca/...` exists next to `pom.xml`), **or**
2. In a monorepo that already contains the MCA tree under `../wsdls/xml/schema`,
   build once with **`mvn -Pstage-mca-schemas generate-sources`** (see `pom.xml`).
   That profile copies `../wsdls/xml/schema` into `./schema` when that path exists.
   If schemas live next to **`hi-b2b-client-java`** instead (`../hi-b2b-client-java/wsdls/xml/schema`),
   use **`mvn -Pstage-mca-schemas-from-b2b-client generate-sources`**.
   The copied tree is ignored by Git (see `.gitignore`).

With `schema/` in place, Jakarta XML Web Services tooling can resolve imports
when regenerating Jakarta XML WS / Jakarta XML Binding source from the HI WSDLs.

Setup
=====

-   To build and test the distributable package, an appropriate Java IDE or
    build environment must be installed.

-   WSDL files are included in:
    `src/main/resources`

    Generated Java source files can be found in:
    `src/main/java`

-   For detailed API documentation, refer to the included Javadoc package.

Solution
========

The package consists of these components:

    -   `hi-wsdl-<version>.jar`
        Contains the required classes and WSDL resources for B2B client
        development, deployment, and invocation.

    -   `hi-wsdl-<version>-docs.jar`
        Contains Javadoc for generated code.

    -   `hi-wsdl-<version>-sources.jar`
        Contains generated Java source files.

Pre-Requisites
==============

Java Development Kit (JDK)
------------------------------------
1.  Download and install JDK 11 or later:
    URL: https://adoptium.net/temurin/releases/?version=11

2.  Unpack the JDK distribution into a directory of your choice.

    This directory will be your <JDK_HOME>and will be used in this document
    to refer to the root directory of the JDK installation.

3.  Create a JAVA_HOME environment variable pointing to the <JDK_HOME>
    directory in Step 2.

4.  Add <JDK_HOME>/bin to the system path.

5.  Build and test with Maven:
    `mvn clean test`


Licensing
=========
Copyright 2012 NEHTA

Copyright 2021 ADHA

Licensed under the NEHTA/ADHA Open Source (Apache) License; you may not use this
file except in compliance with the License. A copy of the License is in the
'LICENSE.txt' file, which should be provided with this work.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations
under the License.
