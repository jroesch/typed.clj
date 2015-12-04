(ns typed.clj)

(import typeck)
(require '[clojure.tools.analyzer.jvm :as analyzer])

(defn top-level? [item]
    (= (item :top-level) true))

(defn try-typeck
  (.hello_world (new Foo)))

; (defn check-ns [namespace]
;   (let [forms (analyzer/analyze-ns namespace)
;         top-level-forms (filter top-level? forms)]
;         (..hello_world )
