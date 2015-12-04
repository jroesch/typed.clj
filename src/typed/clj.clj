(ns typed.clj)

(import compiler)
(require '[clojure.tools.analyzer.jvm :as analyzer])

(defn top-level? [item]
    (= (item :top-level) true))

; (defn check-ns [namespace]
;   (let [forms (analyzer/analyze-ns namespace)
;         top-level-forms (filter top-level? forms)]
;         (..hello_world )
