(ns app.core
  (:require [reagent.core :as r]
            [app.theme :refer [cheffy-theme]]
            ["@smooth-ui/core-sc" :refer [Normalize ThemeProvider Button]]))

(defn app
  []
  [:<>
   [:> Normalize]
   [:> ThemeProvider {:theme cheffy-theme}
    [:> Button "hello"]]])

(defn ^:dev/after-load start
  []
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
