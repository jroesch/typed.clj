(defproject typed.clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.analyzer.jvm "0.6.9"]]
  :plugins [[lein-scalac "0.1.0"]]
  :scala-source-paths "src/scala"
  :prep-tasks ["scalac"])
