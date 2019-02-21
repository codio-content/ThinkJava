You can pass objects as parameters in the usual way.
For example:

```code
public static void printPoint(Point p) {
    System.out.println("(" + p.x + ", " + p.y + ")");
}
```

This method takes a point as an argument and displays its attributes in parentheses.
If you invoke `printPoint(blank)`, it displays `(3, 4)`.

As another example, we can rewrite the `distance` method from Section 4.8 so that it takes two `Point`s as parameters instead of four `double`s.

```code
public static double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
}
```

Passing objects as parameters makes the source code more readable and less error-prone, because related values are bundled together.

You actually don't need to write a `distance` method, because `Point` objects have one built-in already.
To compute the distance between two points, we invoke `distance` on one and pass the other as an argument.

```code
Point p1 = new Point(0, 0);
Point p2 = new Point(3, 4);
double dist = p1.distance(p2);  // dist is 5.0
```

It turns out you don't need the `printPoint` method either.
If you invoke `System.out.println(blank)` you get even more information:

```code
java.awt.Point[x=3,y=4]
```


`Point` objects provide a method called `toString` that returns a string representation of a point.
When you call `println` with objects, it automatically calls `toString` and displays the result.
In this case, it shows the name of the type (`java.awt.Point`) and the names and values of the attributes.