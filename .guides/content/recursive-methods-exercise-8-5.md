**Exercise 8.5:**

Write a recursive method called `power` that takes a double `x` and an integer `n` and returns $x^n$.

*Hint:* A recursive definition of this operation is $x^n = x \cdot x^{n-1}$.
Also, remember that anything raised to the zeroth power is 1.

Optional challenge: you can make this method more efficient, when `n` is even, using $x^n = \left( x^{n/2} \right)^2$.