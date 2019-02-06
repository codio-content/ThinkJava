###  Increment and decrement


Here is another `while` loop example; this one displays the numbers 1 to 5.

```code
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // add 1 to i
}
```


Assignments like `i = i + 1` don't often appear in loops, because Java provides a more concise way to add and subtract by one.
Specifically, `++` is the **increment** operator; it has the same effect as `i = i + 1`.
And `--` is the **decrement** operator; it has the same effect as `i = i - 1`.


If you want to increment or decrement a variable by an amount other than `1`, you can use `+=` and `-=`.
For example, `i += 2` increments `i` by `2`.

```code
int i = 2;
while (i <= 8) {
    System.out.print(i + ", ");
    i += 2;  // add 2 to i
}
System.out.println("Who do we appreciate?");
```

And the output is:

```code
2, 4, 6, 8, Who do we appreciate?
```