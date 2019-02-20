Using a `while` statement, we can repeat the same code multiple times:

```code
int n = 3;
while (n > 0) {
    System.out.println(n);
    n = n - 1;
}
System.out.println("Blastoff!");
```

Reading the code in English sounds like: “Start with `n` set to 3.
While `n` is greater than zero, print the value of `n`, and reduce the value of `n` by 1.
When you get to zero, print Blastoff!”
So the output is:

```code
3
2
1
Blastoff!
```

The flow of execution for a `while` statement is:



1.  Evaluate the condition in parentheses, yielding `true` or `false`.

1.  If the condition is `false`, skip the following statements in braces.

1.  If the condition is `true`, execute the statements and go back to step 1.



This type of flow is called a **loop**, because the last step “loops back around” to the first.
Figure 0.1 shows this idea using a flowchart.

![Figure 7.1 Flow of execution for a `while` loop.](figs/while.jpg)

**Figure 7.1 Flow of execution for a `while` loop.**


The **body** of the loop should change the value of one or more variables so that, eventually, the condition becomes `false` and the loop terminates.
Otherwise the loop will repeat forever, which is called an **infinite loop**.

```code
int n = 3;
while (n > 0) {
    System.out.println(n);
    // n never changes
}
```

This example will print the number `3` forever, or at least until you terminate the program.
An endless source of amusement for computer scientists is the observation that the directions on shampoo, “Lather, rinse, repeat,” are an infinite loop.

In the first example, we can prove that the loop terminates when `n` is positive.
But in general, it is not so easy to tell whether a loop terminates.
For example, this loop continues until `n` is 1 (which makes the condition `false`):

```code
while (n != 1) {
    System.out.println(n);
    if (n % 2 == 0) {         // n is even
        n = n / 2;
    } else {                  // n is odd
        n = 3 * n + 1;
    }
}
```

Each time through the loop, the program displays the value of `n` and then checks whether it is even or odd.
If it is even, the value of `n` is divided by two.
If it is odd, the value is replaced by $3n+1$.
For example, if the starting value is 3, the resulting sequence is 3, 10, 5, 16, 8, 4, 2, 1.

Since `n` sometimes increases and sometimes decreases, there is no obvious proof that `n` will ever reach 1 and that the program will ever terminate.
For some values of `n`, such as the powers of two, we can prove that it terminates.
The previous example ends with such a sequence, starting when `n` is 16 (or $2^4$).

The hard question is whether this program terminates for *all* values of n.
So far, no one has been able to prove it *or* disprove it!
For more information, see [https://en.wikipedia.org/wiki/Collatz_conjecture](https://en.wikipedia.org/wiki/Collatz_conjecture).