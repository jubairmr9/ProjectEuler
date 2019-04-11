(defn inMT [x]
  (zero? (mod (int x) 3)))

(defn inMF [x]
  (zero? (mod (int x) 5)))

(defn sumTF [r]
  (reduce + (filter 
              (fn [x] 
                (or 
                    (inMT x) 
                    (inMF x))) 
              (range r))))
