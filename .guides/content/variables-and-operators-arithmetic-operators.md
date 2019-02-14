###  Arithmetic operators




**Operators** are symbols that represent simple computations.
For example, the addition operator is `+`, subtraction is `-`, multiplication is `*`, and division is `/`.

The following program converts a time of day to minutes:

```code
int hour = 11;
int minute = 59;
System.out.print("Number of minutes since midnight: ");
System.out.println(hour * 60 + minute);
```

The output is:

```code
Number of minutes since midnight: 719
```


In this program, `hour * 60 + minute` is an **expression**, which represents a single value to be computed (`719`).
When the program runs, each variable is replaced by its current value, and then the operators are applied.
The values that operators work with are called **operands**.

Expressions are generally a combination of numbers, variables, and operators.
When compiled and executed, they become a single value.
For example, the expression `1 + 1` has the value `2`.
In the expression `hour - 1`, Java replaces the variable with its value, yielding `11 - 1`, which has the value `10`.

In the expression `hour * 60 + minute`, both variables get replaced, yielding `11 * 60 + 59`.
The multiplication happens first, yielding `660 + 59`.
Then the addition yields `719`.

Addition, subtraction, and multiplication all do what you expect, but you might be surprised by division.
For example, the following fragment tries to compute the fraction of an hour that has elapsed:

```code
System.out.print("Fraction of the hour that has passed: ");
System.out.println(minute / 60);
```

The output is:

```code
Fraction of the hour that has passed: 0
```


This result often confuses people.
The value of `minute` is 59, and 59 divided by 60 should be 0.98333, not 0.
The problem is that Java performs “integer division” when the operands are integers.
By design, integer division always rounds toward zero, even in cases like this one where the next integer is close.

As an alternative, we can calculate a percentage rather than a fraction:

```code
System.out.print("Percent of the hour that has passed: ");
System.out.println(minute * 100 / 60);
```

The new output is:

```code
Percent of the hour that has passed: 98
```

Again the result is rounded down, but at least now it's approximately correct.