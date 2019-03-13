**Exercise 10.1:**

The point of this exercise is to make sure you understand the mechanism for passing objects as parameters.



1.  For the following program, draw a stack diagram showing the local variables and parameters of `main` and `riddle` just before `riddle` returns.
Use arrows to show which objects each variable references.

1.  What is the output of the program?

1.  Is the `blank` object mutable or immutable?
How can you tell?


```code
public static int riddle(int x, Point p) {
    x = x + 7;
    return x + p.x + p.y;
}
```

```code
public static void main(String[] args) {
    int x = 5;
    Point blank = new Point(1, 2);

    System.out.println(riddle(x, blank));
    System.out.println(x);
    System.out.println(blank.x);
    System.out.println(blank.y);
}
```