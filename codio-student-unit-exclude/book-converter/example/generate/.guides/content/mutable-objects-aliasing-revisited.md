###  Aliasing revisited



Remember that when you assign an object to a variable, you are assigning a *reference* to an object.
It is possible to have multiple variables that refer to the same object.
The memory diagram in Figure **11.5** shows the result.

```code
Rectangle box1 = new Rectangle(0, 0, 100, 200);
Rectangle box2 = box1;
```

![Figure 11.5 Memory diagram showing two variables that refer to the same `Rectangle` object.](figs/aliasing.jpg)

**Figure 11.5 Memory diagram showing two variables that refer to the same `Rectangle` object.**



The following example adds 50 to all four sides of the rectangle.
It moves the corner up and to the left by 50, and it increases the height and width by 100:

```code
System.out.println(box2.width);   // box2.width is 100
box1.grow(50, 50);                // grow box1 (alias)
System.out.println(box2.width);   // box2.width is 200
```

The first line displays `100`, which is the width of the `Rectangle` referred to by `box2`.
The second line invokes the `grow` method on `box1`, which stretches the `Rectangle` horizontally and vertically.
The effect is shown in Figure **11.6**.

![Figure 11.6 Memory diagram showing the effect of invoking `grow`.](figs/aliasing2.jpg)

**Figure 11.6 Memory diagram showing the effect of invoking `grow`.**

When we make a change using `box1`, we see the change using `box2`.
Thus, the value displayed by the third line is `200`, the width of the expanded rectangle.