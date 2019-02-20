This chapter introduces two main concepts: objects encapsulate other types of data, and they can be designed to be immutable.
Applying these concepts helps us to manage the complexity of programs as they become large.


Unfortunately, computer science has a lot of overloaded terms.
Another use of the term “encapsulation” applies to methods.
In this section, we present a **design process** called “encapsulation and generalization”.

One challenge of programming, especially for beginners, is figuring out how to divide up a program into methods.
The process of encapsulation and generalization allows you to design as you go along.
The steps are:



1.  Write a few lines of code in `main` or another method, and test them.
1.  When they are working, wrap them in a new method, and test again.
1.  If it's appropriate, replace literal values with variables and parameters.


Encapsulation and generalization is similar to “incremental development” (see Section 0.8), in the sense that you write a little code, test it, and repeat.
But you don't need to begin with an exact method definition and stub.


To demonstrate this process, we'll develop methods that display multiplication tables.
Here is a loop that displays the multiples of two, all on one line:

```code
int i = 1;
while (i <= 6) {
    System.out.printf("%4d", 2 * i);
    i = i + 1;
}
System.out.println();
```


The first line initializes a variable named `i`, which is going to act as the loop variable.
As the loop executes, the value of `i` increases from 1 to 6; when `i` is 7, the loop terminates.

Each time through the loop, we display the value `2 * i` padded with spaces so it's four characters wide.
Since we use `System.out.printf`, the output appears on a single line.

After the loop, we call `println` to print a newline and complete the line.
Remember that in some environments, none of the output is displayed until the line is complete.

The output of the code so far is:

```code
   2   4   6   8  10  12
```


The next step is to **encapsulate** or wrap this code in a method.
Here's what it looks like:

```code
public static void printRow() {
    int i = 1;
    while (i <= 6) {
        System.out.printf("%4d", 2 * i);
        i = i + 1;
    }
    System.out.println();
}
```


Next, we **generalize** the method by replacing the constant value, `2`, with a parameter, `n`.
This step is called “generalization” because it makes the method more general (less specific).

```code
public static void printRow(int n) {
    int i = 1;
    while (i <= 6) {
        System.out.printf("%4d", n * i);  // generalized n
        i = i + 1;
    }
    System.out.println();
}
```

Invoking this method with the argument 2 yields the same output as before.
With the argument 3, the output is:

```code
   3   6   9  12  15  18
```


By now you can probably guess how we are going to display a multiplication table: we'll invoke `printRow` repeatedly with different arguments.
In fact, we'll use another loop to iterate through the rows.

```code
int i = 1;
while (i <= 6) {
    printRow(i);
    i = i + 1;
}
```

And the output looks like this:

```code
   1   2   3   4   5   6
   2   4   6   8  10  12
   3   6   9  12  15  18
   4   8  12  16  20  24
   5  10  15  20  25  30
   6  12  18  24  30  36
```