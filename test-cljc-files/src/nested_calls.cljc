(ns nested-calls
  (:require
   [hyperfiddle.electric-dom3 :as dom]
   [hyperfiddle.electric3 :as e]))

(defn hosted-call [& args]
  (println "hosted-call" args)
  args)

(e/defn ElectricCall [& args]
  (let [PrintInfo (e/fn [x]
                    (dom/div (dom/text "ElectricCall " x))
                    (println "ElectricCall" x))]
    (PrintInfo args)
    (e/client (PrintInfo args))
    (e/server (PrintInfo args)))
  args)

(def global-1 42)

(e/defn Main* [local-1]
  (hosted-call global-1
               local-1
               (ElectricCall global-1
                             local-1)
               (e/server (ElectricCall global-1
                                       local-1)))
  (ElectricCall global-1
                local-1
                (hosted-call global-1
                             local-1)
                (e/server (ElectricCall global-1
                                        local-1)))
  (e/server (hosted-call global-1
                         (hosted-call global-1
                                      local-1
                                      (ElectricCall global-1
                                                    local-1))
                         (ElectricCall global-1
                                       local-1
                                       (hosted-call global-1
                                                    local-1))))
  (e/server (ElectricCall global-1
                          (hosted-call global-1
                                       local-1
                                       (ElectricCall global-1
                                                     local-1))
                          (ElectricCall global-1
                                        local-1
                                        (hosted-call global-1
                                                     local-1)))))

(e/defn Main []
  (Main* :x))
