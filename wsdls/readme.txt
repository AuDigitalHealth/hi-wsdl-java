Licensed HI WSDL/XSD tree (same layout as hi-b2b-client-java wsdls/xml).

Copy the toolkit xml folder here as wsdls/xml/ (contains wsdl/, schema/, binding/), or override at regeneration time:

  mvn -B clean -Pregenerate-sources generate-sources process-sources "-Dhi.wsdl.sync.generated=true"

  # optional: -Dhi.wsdl.tree.root=/path/to/licensed/tree

When HI interfaces change, copy flat HI_*.wsdl from the licensed tree into src/main/resources/.

The 26 wsimport executions in pom.xml (-Pregenerate-sources) align with hi-b2b-client-java 1.7.0.
