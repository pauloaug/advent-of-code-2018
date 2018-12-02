(ns advent-day1.core
  (:require 
   [clojure.string :as string]))

(apply + (map #(Integer/parseInt %)
              (string/split (slurp "input.txt") #"\n")))
