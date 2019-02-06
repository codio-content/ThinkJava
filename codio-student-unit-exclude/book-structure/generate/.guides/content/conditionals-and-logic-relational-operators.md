###  Relational operators



Java has six **relational operators** that test the relationship between two values (e.g., whether they are equal, or whether one is greater than the other).
The following expressions show how they are used:

```code
x == y          // x is equal to y
x != y          // x is not equal to y
x > y           // x is greater than y
x < y           // x is less than y
x >= y          // x is greater than or equal to y
x <= y          // x is less than or equal to y
```


The result of a relational operator is one of two special values: `true` or `false`.
These values belong to the data type `boolean`, named after the mathematician George Boole.
He developed an algebraic way of representing logic.


You are probably familiar with these operators, but notice how Java is different from mathematical symbols like $=$, $\neq$, and $\geq$.
A common error is to use a single `=` instead of a double `==` when comparing values.
Remember that `=` is the *assignment* operator, and `==` is a *relational* operator.
In addition, the operators `=<` and `=>` do not exist.

The two sides of a relational operator have to be compatible.
For example, the expression `5 < "6"` is invalid because `5` is an `int` and `"6"` is a `String`.
When comparing values of different numeric types, Java applies the same conversion rules we saw previously with the assignment operator.
For example, when evaluating the expression `5 < 6.0`, Java automatically converts the `5` to `5.0`.