###  Composition



You have probably learned to evaluate simple expressions like $\sin(\pi/2)$ and $\log(1/x)$.
First, you evaluate the expression in parentheses, which is called the **argument** of the function.
Then you can evaluate the function itself, either by hand or by punching it into a calculator.

This process can be applied repeatedly to evaluate more complex expressions like $\log(1/\sin(\pi/2))$.
First we evaluate the argument of the innermost function ($\pi/2 = 1.57$), then evaluate the function itself ($\sin(1.57) = 1.0$), and so on.


Just as with mathematical functions, Java methods can be **composed** to solve complex problems.
That means you can use one method as part of another.
In fact, you can use any expression as an argument to a method, as long as the resulting value has the correct type:

```code
double x = Math.cos(angle + Math.PI / 2.0);
```

This statement divides `Math.PI` by two, adds the result to `angle`, and computes the cosine of the sum.
You can also take the result of one method and pass it as an argument to another:

```code
double x = Math.exp(Math.log(10.0));
```

In Java, the `log` method always uses base $e$.
So this statement finds the log base $e$ of 10, and then raises $e$ to that power.
The result gets assigned to `x`.

Some math methods take more than one argument.
For example, `Math.pow` takes two arguments and raises the first to the power of the second.
This line computes $2^{10}$ and assigns the value `1024.0` to the variable `x`:

```code
double x = Math.pow(2.0, 10.0);
```

When using `Math` methods, beginners often forget the word `Math`.
For example, if you just write `x = pow(2.0, 10.0)`, you will get a compiler error:

```code
File: Test.java  [line: 5]
Error: cannot find symbol
  symbol:   method pow(double,double)
  location: class Test
```

The message “cannot find symbol” is confusing, but the last two lines provide a useful hint.
The compiler is looking for a method named `pow` in the file `Test.java` (the file for this example).
If you don't specify a class name when referring to a method, the compiler looks in the current class by default.