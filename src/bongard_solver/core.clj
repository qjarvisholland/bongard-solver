(ns bongard-solver.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))




(def decompose
{:image {:left {:1 [] :2 []
                :3 [] :4 []
                :5 [] :6 []}
         :right {:1 [] :2 []
                 :3 [] :4 []
                 :5 [] :6 []}}})


(comment
  


#### Todo:
- Ingest images
- separate left from right
- seperate boxes from background
- produce data structure - DONE
- ingest data from 97x97 pixel areas that correlate to BP boxes
- hard code box locations

Test:
spit out .gif files that contain only the boxes from left, only boxes from right


(let [image-path (clojure.java.io/resource "images/p001.bmp")]
    (if image-path
      (slurp image-path)
      (println "Image file not found!")))
)
