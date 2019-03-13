**Exercise 11.1:**

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