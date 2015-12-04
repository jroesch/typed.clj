(ns typed.clj)

(require '[clojure.tools.analyzer.jvm :as analyzer])

(defn top-level? [item]
    (= (item :top-level) true))

(defn check-ns [namespace]
  (let [forms (analyzer/analyze-ns namespace)
        top-level-forms (filter top-level? forms)]
        (println (map (fn [i] (i :name)) top-level-forms))))
