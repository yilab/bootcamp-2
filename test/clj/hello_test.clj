(ns hello-test
  (:require [midje.sweet :refer :all]
            [hello :as h]))

(fact
  (h/hello-world "foo") => "Hello, foo!"
  (h/hello-world "bar") => "Hello, bar!")


