Once you define a method, you can use it to build other methods.
For example, suppose someone gave you two points -- the center of a circle and a point on the perimeter -- and asked for the area of the circle.

Let's say the center point is stored in the variables `xc` and `yc`, and the perimeter point is in `xp` and `yp`.
The first step is to find the radius of the circle, which is the distance between the two points.
Fortunately, we have a method that does just that.

```code
double radius = distance(xc, yc, xp, yp);
```

The second step is to find the area of a circle with that radius.
We have a method for that computation too.

```code
double area = calculateArea(radius);
```

Putting everything together in a new method, we get:

```code
public static double circleArea
        (double xc, double yc, double xp, double yp) {
    double radius = distance(xc, yc, xp, yp);
    double area = calculateArea(radius);
    return area;
}
```

Temporary variables like `radius` and `area` are useful for development and debugging, but once the program is working we can make it more concise by composing the method calls:

```code
public static double circleArea
        (double xc, double yc, double xp, double yp) {
    return calculateArea(distance(xc, yc, xp, yp));
}
```


This example demonstrates a process known as **functional decomposition**.
We broke a complex computation into simple methods, tested the methods in isolation, and then composed the methods to perform the final computation.





**functional decomposition**

A process for breaking down a complex computation into simple methods, then composing the methods to perform the computation.