# Security

## If you integrate this library

**`hi-wsdl`** provides WSDL resources and generated types. Do **not** embed mutual-TLS private keys, keystore passwords, or production HI endpoint URLs in **your** application's source control.

## Reporting issues

For **security vulnerabilities in this library** (not routine support):

1. Prefer **GitHub private vulnerability reporting** for this repository if it is enabled (**Security** tab → **Report a vulnerability**).
2. Otherwise use your organisation's channel for **ADHA / AuDigitalHealth** repositories. Do **not** post exploit details, live credentials, or production URLs in a **public issue** before triage.

## This repository

- **Do not commit secrets to git.** That includes passwords, API tokens, private keys, mutual-TLS keystores, and vendor registration material.
- **Licensed HI WSDL/XSD tree (`wsdls/xml/...`)** must **not** be pushed to a public fork. **`.gitignore`** excludes **`/wsdls/*`** except **`wsdls/readme.txt`**; verify with **`git status`** before every push. Obtain the toolkit from the [Healthcare Identifiers Integration Toolkit](https://developer.digitalhealth.gov.au/resources/healthcare-identifiers-integration-toolkit-v1-2) for local regeneration only.
- **Do not commit** populated **`settings.xml`** (see **`settings.xml.example`**). Use **`MVN_SETTINGS`** or merge release credentials into your Maven user settings file locally.
- **HI WSDL files** under **`src/main/resources/`** are published as part of this open-source artifact. If your organisation's vendor terms differ, confirm with ADHA before mirroring or redistributing.
- **Do not commit** populated **`local.properties`** or machine-specific **`settings.xml`**.
