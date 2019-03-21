{:doc {:dependencies [[codox-md "0.2.0"]],
       :codox {:writer codox-md.writer/write-docs,
               :output-dir "doc/0.2/api",
               :src-dir-uri "https://github.com/pallet/chiba/blob/develop",
               :src-linenum-anchor-prefix "L"},
       :aliases {"marg" ["marg" "-d" "doc/0.2/annotated/"],
                 "codox" ["doc"],
                 "doc" ["do" "codox," "marg"]}}
 :dev {:plugins [[lein-pallet-release "RELEASE"]]}
 :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}
 :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
 :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
 :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
 :provided {:dependencies [[org.clojure/clojure "1.10.0"]]}}
