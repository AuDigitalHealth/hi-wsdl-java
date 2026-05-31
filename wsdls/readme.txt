Licensed HI WSDL/XSD tree (same layout as hi-b2b-client-java wsdls/xml).

Copy the toolkit xml folder here as wsdls/xml/ (contains wsdl/, schema/, binding/), or override at regeneration time:

  mvn -B clean -Pregenerate-sources \
    -Dhi.wsdl.tree.root=wsdls/xml \
    -Dhi.wsdl.sync.generated=true \
    generate-sources process-sources

  # optional: -Dhi.wsdl.tree.root=/path/to/licensed/tree

Sync flat classpath WSDL into src/main/resources/:

  scripts/sync-wsdl-resources.ps1   (Windows)
  scripts/sync-wsdl-resources.sh    (Unix)

Refresh pom.xml wsimport block from hi-b2b-client-java (maintainer; sibling checkout or HI_B2B_CLIENT_POM):

  set HI_B2B_CLIENT_POM=../hi-b2b-client-java/pom.xml   (Windows)
  export HI_B2B_CLIENT_POM=../hi-b2b-client-java/pom.xml (Unix)
  python scripts/generate-wsimport-executions.py
  python scripts/write-pom.py
