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

x

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
  ([name] "Hello " name))

(hello3)
(hello3 "Master Izaak!")



