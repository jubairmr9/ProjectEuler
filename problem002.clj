(defn find-fib [r]
  (reduce 
    (fn [a b] 
      (conj 
        a 
        (+' 
          (last a) 
          (last (butlast a))))) 
    [0 1] 
    (range r)))

(defn even-fib [r]
  (filter even? (find-fib r)))

(defn sum-even-fib [r]
  (reduce + (even-fib r)))

(defn is-prime [n] 
    (nil? 
        (some #(= (mod n %) 0) 
            (range 2 (inc (java.lang.Math/sqrt n))))))

(defn prime-fib [r]
  (filter is-prime (find-fib r)))
