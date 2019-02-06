###  Overloading methods


You might have noticed that `circleArea` and `calculateArea` perform similar functions.
They both find the area of a circle, but they take different parameters.
For `calculateArea`, we have to provide the radius; for `circleArea` we provide two points.


If two methods do the same thing, it is natural to give them the same name.
Having more than one method with the same name is called **overloading**, and it is legal in Java as long as each version of the method takes different parameters.
So we could rename `circleArea` to `calculateArea`:

```code
public static double calculateArea
        (double xc, double yc, double xp, double yp) {
    return calculateArea(distance(xc, yc, xp, yp));
}
```

When you invoke an overloaded method, Java knows which version you want by looking at the arguments that you provide.



*  For `calculateArea(3.0)`, Java uses the original `calculateArea` method that takes a `double` as an argument and interprets it as the radius.

*  For `calculateArea(1.0, 2.0, 4.0, 6.0)`, Java uses the new version of `calculateArea` (renamed from `circleArea`), which interprets the arguments as two points.


In fact, the second version of `calculateArea` invokes the first version (after invoking the `distance` method).

Many Java library methods are overloaded, meaning that there are different versions that accept different numbers or types of parameters.
For example, there are variants of `print` and `println` that accept a single parameter of any data type.
In the `Math` class, there is a version of `abs` that works on `double`s, and there is also a version for `int`s.

Although overloading is a useful feature, it should be used with caution.
You might get yourself nicely confused if you are trying to debug one version of a method while accidentally invoking a different one.




**overload**

To define more than one method with the same name but with different parameters.