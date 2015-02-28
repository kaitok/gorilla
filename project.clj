(defproject gorilla-test "0.1.0-SNAPSHOT"
  :description "A test project for Gorilla REPL."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [incanter "1.5.5"]
                 [incanter-gorilla "0.1.0"]
                 [cc.artifice/clj-ml "0.6.0-SNAPSHOT"]
                 [org.atilika.kuromoji/kuromoji "0.7.7"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :repositories [["Atilika Open Source repository" "http://www.atilika.org/nexus/content/repositories/atilika"]]
  :plugins [[lein-gorilla "0.3.3"]]
  :profiles {:uberjar {:aot :all}})