(ns guesser.core)

(def smallest 0)

(def biggest 1001)

(defn guess []
(quot (+ smallest biggest) 2))

(defn bigger []
  (def smallest (guess))
  (guess))

(defn smaller []
  (def biggest (guess))
  (guess))

(defn new-game []
  (println "Think of a number between 1 and 1000.")
  (def smallest 0)
  (def biggest 1001)
  (guess))
