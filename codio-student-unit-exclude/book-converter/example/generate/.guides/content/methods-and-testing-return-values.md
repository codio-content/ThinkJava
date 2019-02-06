###  Return values



When you invoke a `void` method, the invocation is usually on a line all by itself.
For example:

```code
printTime(hour + 1, 0);
```

On the other hand, when you invoke a value-returning method, you have to do something with the return value.
We usually assign it to a variable or use it as part of an expression, like this:

```code
double error = Math.abs(expect - actual);
double height = radius * Math.sin(angle);
```


Compared to `void` methods, value-returning methods differ in two ways:




*  They declare the type of the return value (the **return type**);

*  They use at least one `return` statement to provide a **return value**.


Here's an example from a program named `Circle.java`.
The `calculateArea` method takes a `double` as a parameter and returns the area of a circle with that radius (i.e., $\pi r^2$).

```code
public static double calculateArea(double radius) {
    double result = Math.PI * radius * radius;
    return result;
}
```

As usual, this method is `public` and `static`.
But in the place where we are used to seeing `void`, we see `double`, which means that the return value from this method is a `double`.


The last line is a new form of the `return` statement that means, “return immediately from this method, and use the following expression as the return value.”
The expression you provide can be arbitrarily complex, so we could have written this method more concisely:

```code
public static double calculateArea(double radius) {
    return Math.PI * radius * radius;
}
```


On the other hand, **temporary variables** like `result` often make debugging easier, especially when you are stepping through code using an interactive debugger (see Appendix **16.6**).

Figure **5.2** illustrates how data values flows through the program.
When the `main` method invokes `calculateArea`, the value `5.0` is assigned to the parameter `radius`.
`calculateArea` then returns the value `78.54`, which is assigned to the variable `area`.

![Figure 5.2 Passing a parameter and saving the return value.](figs/param.jpg)

**Figure 5.2 Passing a parameter and saving the return value.**

The type of the expression in the `return` statement must match the return type of the method itself.
When you declare that the return type is `double`, you are making a promise that this method will eventually produce a `double` value.
If you try to `return` with no expression, or `return` an expression with the wrong type, the compiler will give an error.