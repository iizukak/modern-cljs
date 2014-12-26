(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ AND CLJS source code path
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.6.0"],
                 [org.clojure/clojurescript "0.0-2173"],
                 [compojure "1.3.1"],
                 [domina "1.0.3"],
                 [hiccups "0.2.0"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "1.0.2"]]

  :ring {:handler modern-cljs.core/handler}

  :cljsbuild {:builds
              {:dev
               {;; clojurescript source code path
                :source-paths ["src/brepl" "src/cljs"] ; "src/brepl"

                ;; Google Closure Compiler options
                :compiler {;; the name of emitted JS script file
                           :output-to "resources/public/js/modern_dbg.js"

                           ;; minimum optimization
                           :optimizations :whitespace
                           ;; prettyfying emitted JS
                           :pretty-print true}}
               :pre-prod
               {;; clojurescript source code path
                :source-paths ["src/brepl" "src/cljs"] ; added "src/brepl"

                :compiler {;; different JS output name
                           :output-to "resources/public/js/modern_pre.js"

                           ;; simple optimization
                           :optimizations :simple

                           ;; no need prettyfication
                           :pretty-print false}}
               :prod
               {;; clojurescript source code path
                :source-paths ["src/cljs"] ;; no "src/brepl"

                :compiler {;; different JS output name
                           :output-to "resources/public/js/modern.js"

                           ;; advanced optimization
                           :optimizations :advanced

                           ;; no need prettyfication
                           :pretty-print false}}}})
