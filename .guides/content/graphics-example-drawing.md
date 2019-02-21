Suppose we want to draw a “Hidden Mickey”, which is an icon that represents Mickey Mouse (see [https://en.wikipedia.org/wiki/Hidden_Mickey](https://en.wikipedia.org/wiki/Hidden_Mickey)).
We can use the oval we just drew as the face, and then add two ears.
To make the code more readable, let's use `Rectangle` objects to represent bounding boxes.

Here's a method that takes a `Rectangle` and invokes `fillOval`:

```code
public void boxOval(Graphics g, Rectangle bb) {
    g.fillOval(bb.x, bb.y, bb.width, bb.height);
}
```

And here's a method that draws Mickey Mouse:

```code
public void mickey(Graphics g, Rectangle bb) {
    boxOval(g, bb);

    int dx = bb.width / 2;
    int dy = bb.height / 2;
    Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

    half.translate(-dx / 2, -dy / 2);
    boxOval(g, half);

    half.translate(dx * 2, 0);
    boxOval(g, half);
}
```

The first line draws the face.
The next three lines create a smaller rectangle for the ears.
We `translate` the rectangle up and left for the first ear, then to the right for the second ear.
The result is shown in Figure 17.3.

![Figure 18.3 A “Hidden Mickey” drawn using Java graphics.](figs/mickey.png)

**Figure 18.3 A “Hidden Mickey” drawn using Java graphics.**

You can read more about `Rectangle` and `translate` in Chapter 10.
See the exercises at the end of this appendix for more example drawings.