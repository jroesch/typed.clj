(defproject typed.clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.analyzer.jvm "0.6.9"]
                 [org.scala-lang/scala-library "2.11.7"]]
  :plugins [[lein-zinc "1.2.0"]]
  :java-source-paths ["src/scala"]
  :test-paths ["test" "test/java" "test/scala"]
  :prep-tasks ["zinc" "compile"])
