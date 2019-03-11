We can write a recursive method to convert decimal to binary.
Doing so will demonstrate how to compute results in reverse order.

At the start of the chapter, the `countdown` example had three parts: (1) it checked the base case, (2) displayed something, and (3) made a recursive call.
What do you think happens if you reverse steps 2 and 3, making the recursive call *before* displaying?

```code
public static void countup(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        countup(n - 1);
        System.out.println(n);
    }
}
```

The stack diagram is the same as before, and the method is still called $n$ times.
But now the `System.out.println` happens just before each recursive call returns.
As a result, it counts *up* instead of down:

```code
Blastoff!
1
2
3
```

We can apply this idea to solve our binary conversion problem.
Here is a recursive method that displays the binary value of any positive integer:

```code
public static void displayBinary(int value) {
    if (value > 0) {
        displayBinary(value / 2);
        System.out.print(value % 2);
    }
}
```

{Run!}(sh .guides/bg.sh javac code/DisplayBinary.java java -cp code/ DisplayBinary )


If `value` is zero, `displayBinary` does nothing (that's the base case).
If the argument is positive, the method divides it by two and calls `displayBinary` recursively.
When the recursive call returns, the method displays one digit of the result and returns (again).
Figure 8.3 illustrates this process.


![Figure 9.3 Stack diagram for the `displayBinary` method.](figs/stack4.jpg)

**Figure 9.3 Stack diagram for the `displayBinary` method.**

The leftmost digit is near the bottom of the stack, so it gets displayed first.
The rightmost digit, near the top of the stack, gets displayed last.
After invoking `displayBinary`, we use `println` to complete the output.

```code
displayBinary(23);
System.out.println();
// output is 10111
```