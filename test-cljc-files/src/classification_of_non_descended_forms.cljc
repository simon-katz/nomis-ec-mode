(ns classification-of-non-descended-forms
  (:require
   [hyperfiddle.electric3 :as e]))

(defn hosted-call [& _])

(e/defn ElectricCall [& _])

(e/defn ElectricCall2 [& _])

(def global-1 42)

(e/defn Foo [local-1]
  (e/server
   ElectricCall2 'foo '(foo foo) local-1 global-1
   (hosted-call ElectricCall2 'foo '(foo foo) local-1 global-1)
   (ElectricCall ElectricCall2 'foo '(foo foo) local-1 global-1)))
