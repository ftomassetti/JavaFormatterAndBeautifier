(defproject app "0.0.1-SNAPSHOT"
  :description "A Java formatter and beautifier"
  :dependencies [
  		[org.clojure/clojure "1.6.0"]
  		[clj-antlr "0.2.2"]
  	]
  :plugins [
  	[lein-antlr4 "0.1.0-SNAPSHOT"]]
  :antlr-src-dir "src/antlr"
  :antlr-dest-dir "gen-src"
  :antlr-options {:verbose true}
  :main app.core)