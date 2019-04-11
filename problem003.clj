(defn isPrime? [n] 
  (nil? 
    (some #(= (mod n %) 0) 
      (range 2N (inc (java.lang.Math/sqrt n))))))

(defn factors [n]
  (filter #(zero? (rem n %)) (range 1N (inc n))))

(defn prime-factors [n]
  (filter isPrime? (factors n)))

(defn lpFactor [n]
  (apply max (prime-factors n)))

(def bigI (biginteger 600851475143))
