###  Chaining and nesting



Sometimes you want to check related conditions and choose one of several actions.
One way to do this is by **chaining** a series of `if` and `else` blocks:

```code
if (x > 0) {
    System.out.println("x is positive");
} else if (x < 0) {
    System.out.println("x is negative");
} else {
    System.out.println("x is zero");
}
```

These chains can be as long as you want, although they can be difficult to read if they get out of hand.
One way to make them easier to read is to use standard indentation, as demonstrated in these examples.
If you keep all the statements and braces lined up, you are less likely to make syntax errors.

Notice that the last branch is simply `else`, not `else if (x == 0)`.
At this point in the chain, we know that `x` is not positive and `x` is not negative.
There is no need to test whether `x` is zero, because there is no other possibility.


In addition to chaining, you can also make complex decisions by **nesting** one conditional statement inside another.
We could have written the previous example as:

```code
if (x > 0) {
    System.out.println("x is positive");
} else {
    if (x < 0) {
        System.out.println("x is negative");
    } else {
        System.out.println("x is zero");
    }
}
```

The outer conditional has two branches.
The first branch contains a `print` statement, and the second branch contains another conditional statement, which has two branches of its own.
These two branches are also `print` statements, but they could have been conditional statements as well.


These kinds of nested structures are common, but they can become difficult to read very quickly.
Good indentation is essential to make the structure (or intended structure) apparent to the reader.