**Exercise 6.1:**

Write a program named `Quadratic.java` that finds the roots of $ax^2 + bx + c = 0$ using the quadratic formula:
$$ x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a} $$
Prompt the user to input integers for $a$, $b$, and $c$.
Compute the two solutions for $x$, and display the results.

Your program should be able to handle inputs for which there is only one or no solution.
Specifically, it should not divide by zero or take the square root of a negative number.

Be sure to validate all inputs.
The user should never see an input mismatch exception.
Display specific error messages that include the invalid input.