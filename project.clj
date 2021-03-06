(defproject onelinejson "0.1.0-SNAPSHOT"
  :description "One line json logging"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/test.check "0.7.0"]
                 [midje "1.6.3"]
                 ]
  :plugins [[lein-midje "3.0.0"]])
