(ns status-im.chat.styles.datemark
  (:require [status-im.components.styles :as st]))

(def datemark-wrapper
  {:flex        1
   :align-items :center})

(def datemark
  {:opacity          0.5
   :padding-left     12
   :padding-right    12
   :margin-top       8
   :margin-bottom    8
   :border-radius    12
   :height           24})

(def datemark-text
  {:color     st/color-gray4
   :top       4
   :font-size 15})
