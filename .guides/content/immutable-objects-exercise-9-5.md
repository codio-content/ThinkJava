**Exercise 9.5:**


One way to calculate $e^x$ is to use the following infinite series expansion.
The $i$th term in the series is $x^i / i!$.
$ e^x = 1 + x + x^2 / 2! + x^3 / 3! + x^4 / 4! + \ldots $


1.  Write a method called `myexp` that takes `x` and `n` as parameters and estimates $e^x$ by adding the first `n` terms of this series.
You can use the `factorial` method from Section 8.3 or your iterative version from the previous exercise.


1.  You can make this method more efficient by observing that the numerator of each term is the same as its predecessor multiplied by `x`, and the denominator is the same as its predecessor multiplied by `i`.

Use this observation to eliminate the use of `Math.pow` and `factorial`, and check that you get the same result.

1.  Write a method called `check` that takes a parameter, `x`, and displays `x`, `myexp(x)`, and `Math.exp(x)`.
The output should look something like:

```code
1.0     2.708333333333333     2.718281828459045
```

You can use the escape sequence `"<br/>t"` to put a tab character between columns of a table.

1.  Vary the number of terms in the series (the second argument that `check` sends to `myexp`) and see the effect on the accuracy of the result. Adjust this value until the estimated value agrees with the correct answer when `x` is 1.

1.  Write a loop in `main` that invokes `check` with the values 0.1, 1.0, 10.0, and 100.0. How does the accuracy of the result vary as `x` varies? Compare the number of digits of agreement rather than the difference between the actual and estimated values.

1.  Add a loop in `main` that checks `myexp` with the values -0.1, -1.0, -10.0, and -100.0. Comment on the accuracy.