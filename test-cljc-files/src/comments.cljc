(ns comments
  (:require
   [hyperfiddle.electric3 :as e]))

(e/defn ElectricCall [& _])

(def global-1 42)

(e/defn Foo []
  ;; Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  (e/server
   (let [a 1 ; Nam dignissim elit.
         ;; Suspendisse euismod quam tortor.
         #_foo
         #_#_foo bar
         b (do a #_34)
         c (do a #_#_34)]
     (ElectricCall global-1 a b c #_#_a)))

  (let [a b
        ;; Lorem ipsum dolor sit amet.
        ]
    a)

  (let [a b
        #_fred
        ]
    a))
