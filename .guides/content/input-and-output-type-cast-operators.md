Now suppose we have a measurement in centimeters, and we want to round it off to the nearest inch.
It is tempting to write:

```code
inch = cm / CM_PER_INCH;  // syntax error
```

But the result is an error -- you get something like, “incompatible types: possible lossy conversion from double to int.”
The problem is that the value on the right is floating-point, and the variable on the left is an integer.

Java converts an `int` to a `double` automatically, since no information is lost in the process.
On the other hand, going from `double` to `int` would lose the decimal places.
Java doesn't perform this operation automatically in order to ensure that you are aware of the loss of the fractional part of the number.


The simplest way to convert a floating-point value to an integer is to use a **type cast**, so called because it molds or “casts” a value from one type to another.
The syntax for type casting is to put the name of the type in parentheses and use it as an operator.


Try it out in the left panel.
To compile and run the code, press the "Run!"
{Run!}(javac code/Casting.java && java code/Casting)

```code
double pi = 3.14159;
int x = (int) pi;
```

The `(int)` operator has the effect of converting what follows into an integer.
In this example, `x` gets the value `3`.
Like integer division, casting to an integer always rounds toward zero, even if the fraction part is `0.999999` (or `-0.999999`).
In other words, it simply throws away the fractional part.

In order to use a cast operator, the types must be compatible.
For example, you can't cast a `String` to an `int` because a string is not a number.

```code
String str = "3";
int x = (int) str;  // error: incompatible types
```

Type casting takes precedence over arithmetic operations.
In the following example, the value of `pi` gets converted to an integer before the multiplication.

```code
double pi = 3.14159;
double x = (int) pi * 20.0;  // result is 60.0, not 62.0
```


Try it out in the left panel.
{Run!}(javac code/Casting.java && java code/Casting)


Keeping that in mind, here's how we can convert centimeters to inches:

```code
inch = (int) (cm / CM_PER_INCH);
System.out.printf("%f cm = %d in\n", cent, inch);
```


Try it out in the left panel.
{Run!}(javac code/Casting.java && java code/Casting)

The parentheses after the cast operator require the division to happen before the type cast.
And the result is rounded toward zero.
We will see in the next chapter how to round floating-point numbers to the closest integer.