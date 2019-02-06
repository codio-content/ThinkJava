###  The for statement



The loops we have written so far have several elements in common.
They start by initializing a variable, they have a condition that depends on that variable, and inside the loop they do something to update that variable.


Running the same code multiple times is called **iteration**.
This type of loop is so common that there is another statement, the `for` loop, that expresses it more concisely.
For example, we can rewrite the 2-4-6-8 loop this way:

```code
for (int i = 2; i <= 8; i += 2) {
    System.out.print(i + ", ");
}
System.out.println("Who do we appreciate?");
```

`for` loops have three components in parentheses, separated by semicolons: the initializer, the condition, and the update.



1.  The *initializer* runs once at the very beginning of the loop.
(It is equivalent to the line before the `while` statement.)

1.  The *condition* is checked each time through the loop.
If it is `false`, the loop ends.
Otherwise, the body of the loop is executed (again).

1.  At the end of each iteration, the *update* runs, and we go back to step 2.


The `for` loop is often easier to read because it puts all the loop-related statements at the top of the loop.
Doing so allows you to focus on the statements in the loop body.
Figure **7.2** illustrates `for` loops with a flowchart.

![Figure 7.2 Flow of execution for a `for` loop.](figs/for.jpg)

**Figure 7.2 Flow of execution for a `for` loop.**

There is another difference between `for` loops and `while` loops: if you declare a variable in the initializer, it only exists *inside* the `for` loop.
For example:

```code
for (int n = 3; n > 0; n--) {
    System.out.println(n);
}
System.out.println("n is now " + n);  // compiler error
```

The last line tries to display `n` (for no reason other than demonstration) but it won't work.
If you need to use a loop variable outside the loop, you have to declare it *outside* the loop, like this:

```code
int n;
for (n = 3; n > 0; n--) {
    System.out.println(n);
}
System.out.println("n is now " + n);
```

Notice that the `for` statement does not say `int n = 3`.
Rather, it simply initializes the existing variable `n`.