(ns other-things
  (:require
   [hyperfiddle.electric3 :as e]))

(defn hosted-call [& _])

(e/defn ElectricCall [& _])

(def global-1 42)

(defn ensure-db! [] @(hosted-call))

(e/defn Foo [local-1]
  (e/client (let [!my-atom (atom nil)]
              @!my-atom
              @(ElectricCall global-1 local-1)
              @(hosted-call global-1 local-1)))
  (e/client `(hosted-call global-1 ~local-1)
            `(hosted-call global-1 ~@local-1)
            `(ElectricCall global-1 ~local-1)
            `(ElectricCall global-1 ~@local-1)
            `(ElectricCall global-1 ~(ElectricCall local-1))
            `(ElectricCall global-1 ~@(ElectricCall local-1))))
