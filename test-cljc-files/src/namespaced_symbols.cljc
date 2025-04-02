(ns namespaced-symbols
  (:require
   [hyperfiddle.electric3 :as e]
   [other-namespace-1]
   [Other-namespace-2]))

(defn hosted-call [& _])

(e/defn ElectricCall [& _])

(def global-1 42)

(e/defn Foo [local-1]
  (e/server
   (hosted-call global-1 local-1)
   (ElectricCall global-1 local-1)
   (other-namespace-1/hosted-call global-1 local-1)
   (other-namespace-1/ElectricCall global-1 local-1)
   (Other-namespace-2/hosted-call global-1 local-1)
   (Other-namespace-2/ElectricCall global-1 local-1)))
