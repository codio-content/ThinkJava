###  Floating-point numbers



A more general solution is to use **floating-point** numbers, which can represent fractions as well as integers.
In Java, the default floating-point type is called `double`, which is short for double-precision.
You can create `double` variables and assign values to them the same way we did for the other types:

```code
double pi;
pi = 3.14159;
```

Java performs “floating-point division” when one or more operands are `double` values.
So we can solve the problem we saw in the previous section:

```code
double minute = 59.0;
System.out.print("Fraction of the hour that has passed: ");
System.out.println(minute / 60.0);
```

The output is:

```code
Fraction of the hour that has passed: 0.9833333333333333
```

Although floating-point numbers are useful, they can be a source of confusion.
For example, Java distinguishes the integer value `1` from the floating-point value `1.0`, even though they seem to be the same number.
They belong to different data types, and strictly speaking, you are not allowed to make assignments between types.

The following is illegal because the variable on the left is an `int` and the value on the right is a `double`:

```code
int x = 1.1;  // compiler error
```

It is easy to forget this rule, because in many cases Java *automatically* converts from one type to another:

```code
double y = 1;  // legal, but bad style
```

The preceding example should be illegal, but Java allows it by converting the `int` value `1` to the `double` value `1.0` automatically.
This leniency is convenient, but it often causes problems for beginners.
For example:

```code
double y = 1 / 3;  // common mistake
```


You might expect the variable `y` to get the value `0.333333`, which is a legal floating-point value.
But instead it gets the value `0.0`.
The expression on the right divides two integers, so Java does integer division, which yields the `int` value `0`.
Converted to `double`, the value assigned to `y` is `0.0`.

One way to solve this problem (once you figure out the bug) is to make the right-hand side a floating-point expression.
The following sets `y` to `0.333333`, as expected:

```code
double y = 1.0 / 3.0;  // correct
```

As a matter of style, you should always assign floating-point values to floating-point variables.
The compiler won't make you do it, but you never know when a simple mistake will come back and haunt you.