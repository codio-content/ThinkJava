The code for this chapter is in the `ch04` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix 15.4, now might be a good time.
It describes an efficient way to test programs that take input from the user and display specific output.


**Exercise 5.1:**

The purpose of this exercise is to take code from a previous exercise and redesign it as a method that takes parameters.
You should start with a working solution to Exercise 2.2.



1.  Write a method called `printAmerican` that takes the day, date, month and year as parameters and that displays them in American format.

1.  Test your method by invoking it from `main` and passing appropriate arguments.
The output should look something like this (except that the date might be different):

```code
Saturday, July 22, 2015
```

1.  Once you have debugged `printAmerican`, write another method called `printEuropean` that displays the date in European format.





**Exercise 5.2:**

This exercise reviews the flow of execution through a program with multiple methods.
Read the following code and answer the questions.

```code
public static void main(String[] args) {
    zippo("rattle", 13);
}
```

```code
public static void baffle(String blimp) {
    System.out.println(blimp);
    zippo("ping", -5);
}
```

```code
public static void zippo(String quince, int flag) {
    if (flag < 0) {
        System.out.println(quince + " zoop");
    } else {
        System.out.println("ik");
        baffle(quince);
        System.out.println("boo-wa-ha-ha");
    }
}
```



1.  Write the number `1` next to the first line of code in this program that will execute.

1.  Write the number `2` next to the second line of code, and so on until the end of the program.
If a line is executed more than once, it might end up with more than one number next to it.

1.  What is the value of the parameter `blimp` when `baffle` gets invoked?

1.  What is the output of this program?





**Exercise 5.3:**

Answer the following questions without running the program on a computer.



1.  Draw a stack diagram that shows the state of the program the first time `ping` is invoked.

1.  What is output by the following program?
Be precise about where there are spaces and where there are newlines.


```code
public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}
```

```code
public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}
```

```code
public static void baffle() {
    System.out.print("wug");
    ping();
}
```

```code
public static void ping() {
    System.out.println(".");
}
```




**Exercise 5.4:**

If you have a question about whether something is legal, and what happens if it is not, a good way to find out is to ask the compiler.
Answer the following questions by trying them out.



1.  What happens if you invoke a value method and don't do anything with the result; that is, if you don't assign it to a variable or use it as part of a larger expression?

1.  What happens if you use a void method as part of an expression?
For example, try `System.out.println("boo!") + 7;`





**Exercise 5.5:**

Draw a stack diagram that shows the state of the program the *second* time `zoop` is invoked.
What is the complete output?

```code
public static void zoop(String fred, int bob) {
    System.out.println(fred);
    if (bob == 5) {
        ping("not ");
    } else {
        System.out.println("!");
    }
}
```

```code
public static void main(String[] args) {
    int bizz = 5;
    int buzz = 2;
    zoop("just for", bizz);
    clink(2 * buzz);
}
```

```code
public static void clink(int fork) {
    System.out.print("It's ");
    zoop("breakfast ", fork);
}
```

```code
public static void ping(String strangStrung) {
    System.out.println("any " + strangStrung + "more ");
}
```




**Exercise 5.6:**

Many computations can be expressed more concisely using the “multadd” operation, which takes three operands and computes `a * b + c`.
Some processors even provide a hardware implementation of this operation for floating-point numbers.



1.  Create a new program called `Multadd.java`.

1.  Write a method called `multadd` that takes three `doubles` as parameters and that returns `a * b + c`.

1.  Write a `main` method that tests `multadd` by invoking it with a few simple parameters, like `1.0, 2.0, 3.0`.

1.  Also in `main`, use `multadd` to compute the following values:
$$
\sin \frac{\pi}{4} + \frac{\cos \frac{\pi}{4}}{2} & <br/>
\log 10 + \log 20
$$

1.  Write a method called `expSum` that takes a double as a parameter and that uses `multadd` to calculate:
$$
x e^{-x} + \sqrt{1 - e^{-x}}
$$
*Hint:* The method for raising $e$ to a power is `Math.exp`.


In the last part of this exercise, you need to write a method that invokes another method you wrote.
Whenever you do that, it is a good idea to test the first method carefully before working on the second.
Otherwise, you might find yourself debugging two methods at the same time, which can be difficult.

One of the purposes of this exercise is to practice pattern-matching: the ability to recognize a specific problem as an instance of a general category of problems.