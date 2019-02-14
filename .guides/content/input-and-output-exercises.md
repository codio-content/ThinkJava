###  Exercises


The code for this chapter is in the `ch03` directory of `ThinkJavaCode2`.
See page in section **Using the code examples** for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix **16.3**, now might be a good time.
It describes the command-line interface, which is a powerful and efficient way to interact with your computer.


**Exercise 4.1:**

When you use `printf`, the Java compiler does not check your format string.
See what happens if you try to display a value with type `int` using `%f`.
And what happens if you display a `double` using `%d`?
What if you use two format specifiers, but then only provide one value?





**Exercise 4.2:**

Write a program that converts a temperature from Celsius to Fahrenheit.
It should (1) prompt the user for input, (2) read a `double` value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place.
For example, it should display `"24.0 C = 75.2 F"`.

Here is the formula.
Be careful not to use integer division!
$ F = C \times \frac{9}{5} + 32 $




**Exercise 4.3:**

Write a program that converts a total number of seconds to hours, minutes, and seconds.
It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) use `printf` to display the output.
For example, `"5000 seconds = 1 hours, 23 minutes, and 20 seconds"`.

*Hint:* Use the remainder operator.




**Exercise 4.4:**

The goal of this exercise is to program a “Guess My Number” game.
When it's finished, it will work like this:

```code
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
```

To choose a random number, you can use the `Random` class in `java.util`.
Here's how it works:


```code
import java.util.Random;

public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
```


Like the `Scanner` class we saw in this chapter, `Random` has to be imported before we can use it.
And as we saw with `Scanner`, we have to use the `new` operator to create a `Random` (number generator).

Then we can use the method `nextInt` to generate a random number.
In this example, the result of `nextInt(100)` will be between 0 and 99, including both.
Adding 1 yields a number between 1 and 100, including both.



1.  The definition of `GuessStarter` is in a file called `GuessStarter.java`, in the directory called `ch03`, in the repository for this book.

1.  Compile and run this program.

1.  Modify the program to prompt the user, then use a `Scanner` to read a line of user input.
Compile and test the program.

1.  Read the user input as an integer and display the result.
Again, compile and test.

1.  Compute and display the difference between the user's guess and the number that was generated.