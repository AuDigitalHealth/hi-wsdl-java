# Security

## Reporting issues

Report security-sensitive findings through your organisation's usual channel for **ADHA / AuDigitalHealth** repositories (do not open a public issue with exploit details before it is triaged).

## This repository

- **Do not commit secrets to git.** That includes passwords, API tokens, private keys, real mutual-TLS keystores, production or staging HI endpoint URLs with embedded credentials, and Services Australia / vendor registration material — even inside comments, test fixtures, or tracked documentation.
- **`local.properties`** is gitignored. Never commit real HI credentials or keystores.
- **`settings.xml`** at the repository root is gitignored when it contains release credentials; do not commit populated copies. Use **`settings.xml.example`** as the template (server id **`central`**).
- **Licensed MCA WSDL/XSD download tree:** on **`1.6.5`** and **`1.7.0`**, the full ADHA bundle under **`wsdls/xml/`** (or equivalent) must stay out of Git. This **`1.6.3`** line ships only the standard HI B2B binding WSDL set under **`src/main/resources/`** as published artifact content.
- In property files, prefer **forward slashes** in filesystem paths so the same values work on **Windows**, **macOS**, and **Linux**.
