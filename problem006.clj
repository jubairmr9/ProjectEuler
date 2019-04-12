(defn square
  "Takes a number and returns its square"
  [x]
  (* x x))

(defn addThnSq [r]
  (square (reduce + (range 1 (+ r 1)))))

(defn sqTill [n]
  (map square (range (+ n 1))))

(defn sumSq [r]
  (reduce + (sqTill r)))

(defn sqDiff [r]
  (- (addThnSq r) (sumSq r)))
