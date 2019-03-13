**Exercise 4.6:**

Many computations can be expressed more concisely using the “multadd” operation, which takes three operands and computes `a * b + c`.
Some processors even provide a hardware implementation of this operation for floating-point numbers.



1.  Create a new program called `Multadd.java`.

1.  Write a method called `multadd` that takes three `doubles` as parameters and that returns `a * b + c`.

1.  Write a `main` method that tests `multadd` by invoking it with a few simple parameters, like `1.0, 2.0, 3.0`.

1.  Also in `main`, use `multadd` to compute the following values:
$$
\sin \frac{\pi}{4} + \frac{\cos \frac{\pi}{4}}{2} & <br/>
\log 10 + \log 20
$$

1.  Write a method called `expSum` that takes a double as a parameter and that uses `multadd` to calculate:
$$
x e^{-x} + \sqrt{1 - e^{-x}}
$$
*Hint:* The method for raising $e$ to a power is `Math.exp`.


In the last part of this exercise, you need to write a method that invokes another method you wrote. Whenever you do that, it is a good idea to test the first method carefully before working on the second. Otherwise, you might find yourself debugging two methods at the same time, which can be difficult.

One of the purposes of this exercise is to practice pattern-matching: the ability to recognize a specific problem as an instance of a general category of problems.