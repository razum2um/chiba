(defproject dda/chiba "0.2.3-SNAPSHOT"
  :description "A library for plugins based on namespace discovery"
  :url "http://palletops.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[razum2um/bultitude "0.3.0"]]
  :exclusions [org.clojure/clojure]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]]
  :aliases {"test-all" ["with-profile" "-user,+1.10:-user,+1.9:-user,+1.8:-user,+1.7" "test"]
            "test-latest" ["with-profile" "-user,+1.10" "test"]})
