#Requires -Version 5.1
# Optional: $env:MVN_SETTINGS = path to settings.xml
Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath $PSScriptRoot
$mvnArgs = @('-B')
if ($null -ne $env:MVN_SETTINGS -and $env:MVN_SETTINGS.Trim().Length -gt 0) {
    $mvnArgs += @('-s', $env:MVN_SETTINGS.Trim())
}
Write-Output 'Building hi-wsdl JAR'
$mvnArgs += @('-Dgpg.skip=true', 'clean', 'verify')
& mvn @mvnArgs
exit $LASTEXITCODE
