The code for this chapter is in the `ch10` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

At this point you know enough to read Appendix 17, which is about simple 2D graphics and animations.
During the next few chapters, you should take a detour to read this appendix and work through the exercises.


**Exercise 11.1:**

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




**Exercise 11.2:**

The point of this exercise is to make sure you understand the mechanism for returning new objects from methods.
The following code uses `findCenter` and `distance` as defined in this chapter.



1.  Draw a stack diagram showing the state of the program just before `findCenter` returns.
Include all variables and parameters, and show the objects those variables refer to.

1.  Draw a stack diagram showing the state of the program just before `distance` returns.
Show all variables, parameters, and objects.

1.  What is the output of this program?
(Can you tell without running it?)


```code
public static void main(String[] args) {
    Point blank = new Point(5, 8);

    Rectangle rect = new Rectangle(0, 2, 4, 4);
    Point center = findCenter(rect);

    double dist = distance(center, blank);
    System.out.println(dist);
}
```




**Exercise 11.3:**

This exercise is about aliasing.
Recall that aliases are two variables that refer to the same object.
The following code uses `findCenter` and `printPoint` as defined in this chapter.



1.  Draw a diagram that shows the state of the program just before the end of `main`.
Include all local variables and the objects they refer to.

1.  What is the output of the program?

1.  At the end of `main`, are `p1` and `p2` aliased?
Why or why not?


```code
public static void main(String[] args) {
    Rectangle box1 = new Rectangle(2, 4, 7, 9);
    Point p1 = findCenter(box1);
    printPoint(p1);

    box1.grow(1, 1);
    Point p2 = findCenter(box1);
    printPoint(p2);
}
```