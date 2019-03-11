One of the most important tasks in any computer program is to **validate** input from the user.
People often make mistakes while typing, especially on smartphones, and incorrect inputs may cause your program to fail.

Even worse, someone (i.e., a **hacker**) may intentionally try to break into your system by entering unexpected inputs.
You should never assume that users will input the right kind of data.

Consider this simple program that prompts the user for a number and computes its logarithm:

```code
Scanner in = new Scanner(System.in);
System.out.print("Enter a number: ");
double x = in.nextDouble();
double y = Math.log(x);
System.out.println("The log is " + y);
```

In mathematics, the natural logarithm (base $e$) is undefined when $x < 0$.
If you ask for `Math.log(-1)`, it will return **NaN** which stands for “not a number”.

Try it out by clicking the button below:
{Run! | terminal}(javac code/ValidInput.java && java -cp code/ ValidInput)

Many users are confused when they see NaN; it often looks like a bug.
We can use an `if` statement to make the output more user friendly.

```code
if (x >= 0) {
    double y = Math.log(x);
    System.out.println("The log is " + y);
} else {
    System.out.println("The log is undefined");
}
```

The output is better now, but there is another problem.
What if the user doesn't enter a number at all?
What would happen if they typed the word “hello”, either on accident or on purpose?

{Run! | terminal}(javac code/ValidInput.java && java -cp code/ ValidInput)




```code
Exception in thread "main" java.util.InputMismatchException
    at java.util.Scanner.throwFor(Scanner.java:864)
    at java.util.Scanner.next(Scanner.java:1485)
    at java.util.Scanner.nextDouble(Scanner.java:2413)
    at Logarithm.main(Logarithm.java:8)
```



If the user inputs a `String` when we expect a `double`, Java reports an “input mismatch” exception.
We can prevent this run-time error from happening by testing the input first.

The `Scanner` class provides `hasNextDouble`, which checks whether the next input can be interpreted as a `double`.
If not, we can display an error message.

```code
if (!in.hasNextDouble()) {
    String word = in.next();
    System.err.println(word + "is not a number");
    return;
}
```

{Run! | terminal}(javac code/ValidInput.java && java -cp code/ ValidInput)



In contrast to `in.nextLine`, which returns an entire line of input, the `in.next` method returns only the next token of input.
We can use `in.next` to show the user exactly which word they typed was not a number.


This example also uses `System.err`, which is an `OutputStream` for error messages and warnings.
Some development environments display output to `System.err` with a different color or in a separate window.


The `return` statement allows you to exit a method before you reach the end of it.
Returning from `main` terminates the program.

Notice the use of the `!` operator before `in.hasNextDouble()`, instead of testing the condition `in.hasNextDouble() == false`.
Since `hasNextDouble` returns a boolean, it is already a condition.