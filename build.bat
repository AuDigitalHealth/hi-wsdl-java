@echo off
setlocal
cd /d "%~dp0"
if defined MVN_SETTINGS (
  mvn -B -s "%MVN_SETTINGS%" -Dgpg.skip=true clean verify %*
) else (
  mvn -B -Dgpg.skip=true clean verify %*
)
exit /b %ERRORLEVEL%
