If you are given three sticks, you may or may not be able to arrange them in a triangle.
For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle.
For any three lengths, there is a simple test to see if it is possible to form a triangle:

> If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.

Write a program named `Triangle.java` that inputs three integers, and then outputs whether you can (or cannot) form a triangle from the given lengths (outputting either "Yes" or "No"). Reuse your code from the previous exercise to validate the inputs. Display an error if any of the lengths are negative or zero.

{Run! | terminal}(javac code/Triangle.java && java -cp code/ Triangle)

{Check It!|assessment}(code-output-compare-4068291909)
