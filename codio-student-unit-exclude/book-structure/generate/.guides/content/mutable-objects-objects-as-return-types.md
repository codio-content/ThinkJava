The `java.awt` package also provides a class named `Rectangle`. To use it, you have to import it:

```code
import java.awt.Rectangle;
```

`Rectangle` objects are similar to points, but they have four attributes: `x`, `y`, `width`, and `height`. The following example creates a `Rectangle` object and makes the variable `box` refer to it:

```code
Rectangle box = new Rectangle(0, 0, 100, 200);
```
Try it out in the pane to the left. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ReturnObjs.java java -cp code/ ReturnObjs )


Figure 10.2 shows the effect of this assignment.

![Figure 10.2 Memory diagram showing a `Rectangle` object.](figs/rectangle.jpg)

**Figure 10.2 Memory diagram showing a `Rectangle` object.**

If you run `System.out.println(box)`, you get:

```code
java.awt.Rectangle[x=0,y=0,width=100,height=200]
```

Again, `println` uses the `toString` method provided by `Rectangle`, which knows how to convert `Rectangle` objects into strings.


You can write methods that return new objects. For example, `findCenter` takes a `Rectangle` as an argument and returns a `Point` with the coordinates of the center of the rectangle:

```code
public static Point findCenter(Rectangle box) {
    int x = box.x + box.width / 2;
    int y = box.y + box.height / 2;
    return new Point(x, y);
}
```
{Run!}(sh .guides/bg.sh javac code/ReturnObjs.java java -cp code/ ReturnObjs 2 )


The return type of this method is `Point`. The last line creates a new `Point` object and returns a reference to it.


You are probably used to Cartesian **coordinates**, where $x$ and $y$ values can be positive or negative. In contrast, Java uses a coordinate system where the origin is in the upper-left corner. That way, $x$ and $y$ are always positive integers. Figure 10.3 shows these coordinate systems side-by-side.

![Figure 10.3 Diagram of the difference between Cartesian coordinates and Java graphical coordinates.](figs/coordinates.jpg)

**Figure 10.3 Diagram of the difference between Cartesian coordinates and Java graphical coordinates.**


Graphical coordinates are measured in **pixels**; each pixel corresponds to a dot on the screen. You can learn more about Java 2D graphics in Appendix 17.

The `Rectangle` we created using the arguments `(0, 0, 100, 200)` has its upper-left corner in the origin. The center of this rectangle is `(50, 100)`, which is 50 pixels to the right and 100 pixels down from the origin.