In addition to the relational operators, Java also has three **logical operators**: `&&`, `||`, and `!`, which respectively stand for *and*, *or*, and *not*.
The results of these operators are similar to their meanings in English.

For example, `x > 0 && x < 10` is true when `x` is both greater than zero *and* less than 10.
The expression `evenFlag || n % 3 == 0` is true if either condition is true, that is, if `evenFlag` is true *or* the number `n` is divisible by 3.
Finally, the `!` operator inverts a boolean expression.
So `!evenFlag` is true if `evenFlag` is false.

In order for an expression with `&&` to be true, both sides of the `&&` operator must be true.
And in order for an expression with `||` to be false, both sides of the `||` operator must be false.

The `&&` operator can be used to simplify nested `if` statements.
For example, following code can be rewritten with a single condition.

```code
if (x == 0) {
    if (y == 0) {
        System.out.println("Both x and y are zero");
    }
}
```

```code
// combined
if (x == 0 && y == 0) {
    System.out.println("Both x and y are zero");
}
```

Likewise, the `||` operator can simplify chained `if` statements.
Since the branches are the same, there is no need to duplicate that code.

```code
if (x == 0) {
    System.out.println("Either x or y is zero");
} else if (y == 0) {
    System.out.println("Either x or y is zero");
}
```

```code
// combined
if (x == 0 || y == 0) {
    System.out.println("Either x or y is zero");
}
```

Of course if the statements in the branches were different, we could not combine them into one block.
But it's useful to explore different ways of representing the same logic, especially when it's complex.


Logical operators evaluate the second expression only when necessary.
For example, `true || anything` is always true, so Java does not need to evaluate the expression `anything`.
Likewise, `false && anything` is always false.

Ignoring the second operand, when possible, is called **short circuit** evaluation, by analogy with an electrical circuit.
Short circuit evaluation can save time, especially if `anything` takes a long time to evaluate.
It can also avoid unnecessary errors, if `anything` might fail.