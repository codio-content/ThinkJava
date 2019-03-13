**Exercise 6.3:**

One way to evaluate $\exp(-x^2)$ is to use the infinite series expansion:
$ \exp(-x^2) = 1 - x^2 + x^4/2 - x^6/6 + \ldots $
The $i$th term in this series is $(-1)^i x^{2i} / i!$.
Write a method named `gauss` that takes `x` and `n` as arguments and returns the sum of the first `n` terms of the series.
You should not use `factorial` or `pow`.