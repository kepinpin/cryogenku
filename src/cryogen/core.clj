(ns cryogen.core
  (:require [cryogen-core.compiler :refer [compile-assets-timed]]
            [cryogen-core.plugins :refer [load-plugins]]
            [cryogen-core.markup :refer [markup-registry]]

            [cryogen.util :as u]
            ))

(defn -main []
  (swap! markup-registry conj (u/asciidoc))
  (load-plugins)
  (compile-assets-timed)
  (System/exit 0))
