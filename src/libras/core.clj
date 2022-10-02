(ns libras.core)
(require '[stencil.api :refer :all])

(def template-1 (prepare (clojure.java.io/resource "template.docx")))
(defn render-template-1 [output-file data]
  (render! template-1 data :output output-file))



(defn -main [& args]
  (render-template-1 "resources/output-1.docx" {"customerName" "John Doe"})
)