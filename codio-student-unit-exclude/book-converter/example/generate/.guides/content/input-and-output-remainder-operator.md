###  Remainder operator


Let's take the example one step further: suppose you have a measurement in inches and you want to convert to feet and inches.
The goal is divide by 12 (the number of inches in a foot) and keep the remainder.


We have already seen the division operation (`/`), which computes the quotient of two numbers.
If the numbers are integers, it performs integer division.
Java also provides the **modulo** operation (`%`), which divides two numbers and computes the remainder.

Using division and modulo, we can convert to feet and inches like this:

```code
feet = 76 / 12;    // quotient
inches = 76 % 12;  // remainder
```

The first line yields 6.
The second line, which is pronounced “76 mod 12”, yields 4.
So 76 inches is 6 feet, 4 inches.


Many people (and textbooks) incorrectly refer to `%` as the “modulus operator”.
In mathematics, however, **modulus** is the number you're dividing by.
In the previous example, the modulus is 12.
The Java language specification refers to  `%` as the “remainder operator”.

The remainder operator looks like a percent sign, but you might find it helpful to think of it as a division sign ($\div$) rotated to the left.



Modular arithmetic turns out to be surprisingly useful.
For example, you can check whether one number is divisible by another: if `x % y` is zero, then `x` is divisible by `y`.
You can use remainder to “extract” digits from a number: `x % 10` yields the rightmost digit of `x`, and `x % 100` yields the last two digits.
And many encryption algorithms use the remainder operator extensively.