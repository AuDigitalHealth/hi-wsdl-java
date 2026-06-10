#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
MVN=(mvn -B)
if [[ -n "${MVN_SETTINGS:-}" ]]; then
  MVN+=(-s "$MVN_SETTINGS")
fi
echo 'Building hi-wsdl JAR'
exec "${MVN[@]}" -Dgpg.skip=true clean verify "$@"
