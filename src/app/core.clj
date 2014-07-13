(ns app.core
	(:require [clj-antlr.core :as antlr])
	(:require [clojure.pprint :as pp]))


(defn -main []
	(def java (antlr/parser "src/antlr/Java.g4"))
	(pp/pprint (java "package a; class A { }")))
