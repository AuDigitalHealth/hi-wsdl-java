Licensed HI WSDL/XSD tree (same layout as hi-b2b-client-java wsdls/xml).

Copy the toolkit xml folder here as wsdls/xml/ (contains wsdl/, schema/, binding/), or override at regeneration time:

  mvn -B clean -Pregenerate-sources \
    -Dhi.wsdl.tree.root=wsdls/xml \
    -Dhi.wsdl.sync.generated=true \
    generate-sources process-sources

  # optional: -Dhi.wsdl.tree.root=/path/to/licensed/tree

Copy updated HI_*.wsdl from the licensed tree into src/main/resources/ when interfaces change (same flat classpath layout as in this JAR).

To refresh the -Pregenerate-sources wsimport block in pom.xml, copy the executions from hi-b2b-client-java/pom.xml (26 executions) by hand.
