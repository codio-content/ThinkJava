###  The do-while loop



The `while` and `for` statements are **pretest loops**; that is, they test the condition first and at the beginning of each pass through the loop.


Java also provides a **posttest loop**: the `do`-`while` statement.
This type of loop is useful when you need to run the body of the loop at least once.


For example, in Section **6.8** we used the `return` statement to avoid reading invalid input from the user.
We can use a `do`-`while` loop to keep reading input until it's valid:

```code
Scanner in = new Scanner(System.in);
boolean okay;
do {
    System.out.print("Enter a number: ");
    if (in.hasNextDouble()) {
        okay = true;
    } else {
        okay = false;
        String word = in.next();
        System.err.println(word + " is not a number");
    }
} while (!okay);
double x = in.nextDouble();
```

Although this code looks complicated, it is essentially only three steps:



1.  Display a prompt.
1.  Check the input; if invalid, display an error and start over.
1.  Read the input.



The code uses a flag variable, `okay`, to indicate whether we need to repeat the loop body.
If `hasNextDouble()` returns `false`, we consume the invalid input by calling `next()`.
We then display an error message via `System.err`.
The loop terminates when `hasNextDouble()` return `true`.




**pretest loop**

A loop that tests the condition before each iteration.



**posttest loop**

A loop that tests the condition after each iteration.