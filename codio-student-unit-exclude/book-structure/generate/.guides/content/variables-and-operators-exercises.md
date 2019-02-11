###  Exercises


The code for this chapter is in the `ch02` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix 16.2, now might be a good time.
It describes the DrJava Interactions Pane, which is a useful way to develop and test short fragments of code without writing a complete class definition.


**Exercise 3.1:**

If you are using this book in a class, you might enjoy this exercise.
Find a partner and play “Stump the Chump”:

Start with a program that compiles and runs correctly.
One player looks away while the other player adds an error to the program.
Then the first player tries to find and fix the error.
You get two points if you find the error without compiling the program, one point if you find it using the compiler, and your opponent gets a point if you don't find it.




**Exercise 3.2:**

The point of this exercise is (1) to use string concatenation to display values with different types (`int` and `String`), and (2) to practice developing programs gradually by adding a few statements at a time.



1.  Create a new program named `Date.java`.
Copy or type in something like the hello world program and make sure you can compile and run it.

1.  Following the example in Section 3.4, write a program that creates variables named `day`, `date`, `month`, and `year`.
The variable `day` will contain the day of the week (like Friday), and `date` will contain the day of the month (like the 13th).
Assign values to those variables that represent today's date.

1.  Display the value of each variable on a line by itself.
This is an intermediate step that is useful for checking that everything is working so far.
Compile and run your program before moving on.

1.  Modify the program so that it displays the date in standard American format, for example: `Thursday, July 16, 2015`.

1.  Modify the program so it also displays the date in European format.
The final output should be:

```code
American format:
Thursday, July 16, 2015
European format:
Thursday 16 July 2015
```





**Exercise 3.3:**

The point of this exercise is to (1) use some of the arithmetic operators, and (2) start thinking about compound entities (like time of day) that are represented with multiple values.



1.  Create a new program called `Time.java`.
From now on, we won't remind you to start with a small, working program, but you should.

1.  Following the example program in Section 3.4, create variables named `hour`, `minute`, and `second`.
Assign values that are roughly the current time.
Use a 24-hour clock so that at 2pm the value of `hour` is 14.

1.  Make the program calculate and display the number of seconds since midnight.

1.  Calculate and display the number of seconds remaining in the day.

1.  Calculate and display the percentage of the day that has passed.
You might run into problems when computing percentages with integers, so consider using floating-point.

1.  Change the values of `hour`, `minute`, and `second` to reflect the current time.
Then write code to compute the elapsed time since you started working on this exercise.


*Hint:* You might want to use additional variables to hold values during the computation.
Variables that are used in a computation but never displayed are sometimes called “intermediate” or “temporary” variables.