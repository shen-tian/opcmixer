(defproject opcmixer "0.1.0-SNAPSHOT"
  :description "Mixer for Open Pixel Control"
  :url "https://github.com/shen-tian/opcmixer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-opc "0.1.1"]
                 [compojure "1.5.1"]
                 [aleph "0.4.1"]
                 [manifold "0.1.5"]
                 [gloss "0.2.5"]
                 [ring/ring-json "0.4.0"]
                 [ring-cors "0.1.9"]]
  :main opcmixer.mixer
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
