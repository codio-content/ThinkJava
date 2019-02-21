The code for this chapter is in the `ch05` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix 15.5, now might be a good time.
It describes Checkstyle, a tool that analyzes many aspects of your source code.


**Exercise 6.1:**

Using the following variables, evaluate the logic expressions in the table below.
Write your answers as true, false, or error.

```code
boolean yes = true;
boolean no = false;
int loVal = -999;
int hiVal = 999;
double grade = 87.5;
double amount = 50.0;
String hello = "world";
```


|Expression|Result |
|-|-|
|`yes == no &#124;&#124; grade > amount`|\hspace{5em} |
|`amount == 40.0 &#124;&#124; 50.0`| |
|`hiVal != loVal &#124;&#124; loVal < 0`| |
|`True &#124;&#124; hello.length() > 0`| |
|`hello.isEmpty() && yes`| |
|`grade <= 100 && !false`| |
|`!yes &#124;&#124; no`| |
|`grade > 75 > amount`| |
|`amount <= hiVal && amount >= loVal`| |
|`no && !no &#124;&#124; yes && !yes`| |





**Exercise 6.2:**

What is the output of the following program?
Determine the answer without using a computer.

```code
public static void main(String[] args) {
    boolean flag1 = isHoopy(202);
    boolean flag2 = isFrabjuous(202);
    System.out.println(flag1);
    System.out.println(flag2);
    if (flag1 && flag2) {
        System.out.println("ping!");
    }
    if (flag1 || flag2) {
        System.out.println("pong!");
    }
}
```

```code
public static boolean isHoopy(int x) {
    boolean hoopyFlag;
    if (x % 2 == 0) {
        hoopyFlag = true;
    } else {
        hoopyFlag = false;
    }
    return hoopyFlag;
}
```

```code
public static boolean isFrabjuous(int x) {
    boolean frabjuousFlag;
    if (x > 0) {
        frabjuousFlag = true;
    } else {
        frabjuousFlag = false;
    }
    return frabjuousFlag;
}
```

The purpose of this exercise is to make sure you understand logical operators and the flow of execution through methods.




**Exercise 6.3:**

Rewrite the following code using a single `if` statement.

```code
if (x > 0) {
    if (x < 10) {
        System.out.println("positive single digit number.");
    }
}
```




**Exercise 6.4:**

Fermat's Last Theorem says that there are no integers $a$, $b$, and $c$ such that $a^n + b^n = c^n$, except when $n \leq 2$.

Write a program named `Fermat.java` that inputs four integers (`a`, `b`, `c`, and `n`) and checks to see if Fermat's theorem holds.
If $n$ is greater than 2 and $a^n + b^n = c^n$, the program should display “Holy smokes, Fermat was wrong!”
Otherwise the program should display “No, that doesn't work.”

*Hint:* You may want to use `Math.pow`.




**Exercise 6.5:**

Now that we have conditional statements, we can get back to the “Guess My Number” game from Exercise 3.4.

You should already have a program that chooses a random number, prompts the user to guess it, and displays the difference between the guess and the chosen number.

Adding a small amount of code at a time, and testing as you go, modify the program so it tells the user whether the guess is too high or too low, and then prompts the user for another guess.

The program should continue until the user gets it right or guesses incorrectly three times.
If the user guesses the correct number, display a message and terminate the program.




**Exercise 6.6:**

Write a program named `Quadratic.java` that finds the roots of $ax^2 + bx + c = 0$ using the quadratic formula:
$$ x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a} $$
Prompt the user to input integers for $a$, $b$, and $c$.
Compute the two solutions for $x$, and display the results.

Your program should be able to handle inputs for which there is only one or no solution.
Specifically, it should not divide by zero or take the square root of a negative number.

Be sure to validate all inputs.
The user should never see an input mismatch exception.
Display specific error messages that include the invalid input.




**Exercise 6.7:**

If you are given three sticks, you may or may not be able to arrange them in a triangle.
For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle.
For any three lengths, there is a simple test to see if it is possible to form a triangle:



> If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.


Write a program named `Triangle.java` that inputs three integers, and then outputs whether you can (or cannot) form a triangle from the given lengths.
Reuse your code from the previous exercise to validate the inputs.
Display an error if any of the lengths are negative or zero.