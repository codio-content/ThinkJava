`printTime` has two parameters, named `hour` and `minute`. And `main` has two variables, also named `hour` and `minute`. Although they have the same names, these variables are not the same. The `hour` in `printTime` and the `hour` in `main` refer to different memory locations, and they can have different values. For example, you could invoke `printTime` like this:

```code
int hour = 11;
int minute = 59;
printTime(hour + 1, 0);
```

Before the method is invoked, Java evaluates the arguments; in this example, the results are `12` and `0`. Then it assigns those values to the parameters. Inside `printTime`, the value of `hour` is `12`, not `11`, and the value of `minute` is `0`, not `59`. Furthermore, if `printTime` modifies one of its parameters, that change has no effect on the variables in `main`.


One way to keep track of everything is to draw a **stack diagram**, which is a memory diagram (see Section 2.3) that shows currently running methods. For each method there is a box called a **frame** that contains the method's parameters and local variables. The name of the method appears outside the frame; the variables and parameters appear inside.

![Figure 4.1 Stack diagram for `printTime(hour + 1, 0)`.](figs/stack1.jpg)

**Figure 4.1 Stack diagram for `printTime(hour + 1, 0)`.**

As with memory diagrams, stack diagrams show variables and methods at a particular point in time. Figure 4.1 is a stack diagram at the beginning of the `printTime` method. Notice that `main` is on top, because it executed first.




Stack diagrams are a good mental model for how variables and methods work at run-time. Learning to trace the execution of a program on paper (or on a whiteboard) is a useful skill for communicating with other programmers.

There are educational tools that automatically draw stack diagrams for you. For example, Java Tutor ([http://pythontutor.com/java.html](http://pythontutor.com/java.html)) allows you to step through an entire program, both forwards and backwards, and see the stack frames and variables at each step. If you haven't already, you should check out the Java examples on that website.