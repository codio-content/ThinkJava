The point of this exercise is to (1) use some of the arithmetic operators, and (2) start thinking about compound entities (like time of day) that are represented with multiple values.


1.  Use the IDE on the left to write the answer to this exercise. From now on, we won't remind you to start with a small, working program, but you should.

    {Run!}(sh .guides/bg.sh javac code/Exercise_2_3.java java -cp code/ Exercise_2_3 )

1.  Following the example program in Section 2.4, create variables named `hour`, `minute`, and `second`.
    Assign values that are roughly the current time.
    Use a 24-hour clock so that at 2pm the value of `hour` is 14.

1.  Make the program calculate and display the number of seconds since midnight.

1.  Calculate and display the number of seconds remaining in the day.

1.  Calculate and display the percentage of the day that has passed.
    You might run into problems when computing percentages with integers, so consider using floating-point.

1.  Change the values of `hour`, `minute`, and `second` to reflect the current time.
    Then write code to compute the elapsed time since you started working on this exercise.


*Hint:* You might want to use additional variables to hold values during the computation. Variables that are used in a computation but never displayed are sometimes called “intermediate” or “temporary” variables.
