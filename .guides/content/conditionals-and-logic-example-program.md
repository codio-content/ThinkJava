###  Example program


In this chapter we have seen relational and logical operators, `if` statements, the `Math` class, and validating input.
The following program shows how the individual code examples in the last section fit together.


```code
import java.util.Scanner;

/**
 * Demonstrates input validation using if statements.
 */
public class Logarithm {

    public static void main(String[] args) {

        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // check the format
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }

        // check the range
        double x = in.nextDouble();
        if (x >= 0) {
            double y = Math.log(x);
            System.out.println("The log is " + y);
        } else {
            System.out.println("The log is undefined");
        }
    }
}
```

What started as five lines of code at the beginning of Section **6.8** is now a 30-line program.
Making programs robust (and secure) often requires a lot of additional checking, as shown in this example.


It's important to write comments every few lines to make your code easier to understand.
Comments not only help other people read your code, they also help you document what you're trying to do.
If there's a mistake the code, it's a lot easier to find when there are good comments.