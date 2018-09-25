(ns training.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(foo "Yo")

(class 1)

(range 4)

(take 4 (range))

(cons 4 [1 2 3 4])

(conj [1 2 3 4] 5)

(conj '(1 2 3 4) 5)

(concat [1 2 3] '(4 5 6))

(map inc '(1 2 3))

(filter even? '(1 2 3))

(reduce + '(1 2 3 4))

(reduce conj [] '(3 2 1))

(fn [] "Last Statement")

((fn [] "Last Statement"))

(def y 1)

y

(def hello-world (fn [] "Hello World!"))

(hello-world)

(defn hello-world [] "Hello World!")

(hello-world)

(defn hello [name] 
  (str "Hello " name))

(hello "Master Izaak!")

(def hello2 #(str "Hello " %1))

(hello2 "Master Izaak!")

(defn hello3 
  ([] "Hello World!")
  ([name] (str "Hello " name)))

(hello3)
(hello3 "Master Izaak!")

(defn count-args [& args]
  (str "You passed " (count args) " args: " args))

(count-args 3 2 1 :vd 12 :sdfs)

(defn hello-count [name & args]
  (str "Hello " name ", you passed " (count args) " extra args"))

(hello-count "Master Izaak" 1 2 3 4)

(class {:a 1 :b 2 :c 3})

(class (hash-map :a 1 :b 2 :c 3))

(class :a)

(def stringmap {"a" 1, "b" 2, "c" 3})

stringmap

(def keymap {:a 1, :b 2, :c 3})

keymap

(stringmap "a")

(keymap :b)

(:c keymap)

(def newkeymap (assoc keymap :d 4))

newkeymap

keymap

(dissoc keymap :a :b)

(class #{1 2 3})

(set [1 2 3 1 2 3 1 2 3])

(conj #{1 2 3 4} 5)

(disj #{1 2 3} 1)

(#{1 2 3} 1)
(#{1 2 3} 4)

(if false "a" "b")
(if false "a")

(let [a 1 b 2]
  (> a b))

(do
  (print "Hello")
  "World")

(defn print-and-say-hello [name]
  (print "Saying hello to" name)
  (str "Hello " name))

(print-and-say-hello "Izaak")

(let [name "Urkel"]
  (print "Saying hello to " name)
  (str "Hello " name))

(->
  {:a 1 :b 2}
  (assoc :c 3)
  (dissoc :b))

(->>
  (range 10)
  (map inc)
  (filter odd?)
  (into []))

(as-> [1 2 3] input
  (map inc input)
  (nth input 2)
  (conj [4 5 6] input [8 9 10]))

(use 'clojure.set)

(intersection #{1 2 3} #{2 3 4})
(difference #{1 2 3} #{2 3 4})

(use '[clojure.set :only [intersection]])

(require 'clojure.string)

(clojure.string/blank? "")

(require '[clojure.string :as str])

(str/replace "This is a test." #"[a-o]" str/upper-case)

(ns test
  (:require 
    [clojure.string :as str]
    [clojure.set :as set]))

(import java.util.Date)

(ns test
  (:import java.util.Date
          java.util.Calendar))

(Date.)

(. (Date.) getTime)
(.getTime (Date.))

(System/currentTimeMillis)

(import java.util.Calendar)
(doto (Calendar/getInstance)
  (.set 2000 1 1 0 0 0)
  .getTime)

(def my-atom (atom {}))

(swap! my-atom assoc :a 1)
(swap! my-atom assoc :b 2)

my-atom
@my-atom

(def counter (atom 0))
(defn inc-counter []
  (swap! counter inc))

(inc-counter)

@counter




