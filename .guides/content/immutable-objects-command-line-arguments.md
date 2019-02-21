Now that you know about strings, arrays, and wrapper classes, we can *finally* explain the `args` parameter of the `main` method, which we have been ignoring since Chapter 1.
If you are unfamiliar with the command-line interface, please read Appendix 15.3.

Let's write a program to find the maximum value in a sequence of numbers.
Rather than read the numbers from `System.in` using a `Scanner`, we'll pass them as command-line arguments.
Here is a starting point:

```code
public class Max {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
```

You can run this program from the command line by typing:

```code
java Max
```


The output indicates that `args` is an **empty array**; that is, it has no elements:

```code
[]
```

If you provide additional values on the command line, they are passed as arguments to `main`.
For example, if you run the program like this:

```code
java Max 10 -3 55 0 14
```

The output is:

```code
[10, -3, 55, 0, 14]
```

It's not clear from the output, but the elements of `args` are strings.
So `args` is the array `\{"10", "-3", "55", "0", "14"\`}.
To find the maximum number, we have to convert the arguments to integers.

The following code uses an enhanced `for` loop to parse the arguments (using the `Integer` wrapper class) and find the largest value:

```code
int max = Integer.MIN_VALUE;
for (String arg : args) {
    int value = Integer.parseInt(arg);
    if (value > max) {
        max = value;
    }
}
System.out.println("The max is " + max);
```

We begin by initializing `max` to the smallest (most negative) number an `int` can represent.
That way, the first value we parse will replace `max`.
As we find larger values, they will replace `max` as well.

If `args` is empty, the result will be `MIN_VALUE`.
We can prevent this situation from happening by checking `args` at the beginning of the program:

```code
if (args.length == 0) {
    System.err.println("Usage: java Max <numbers>");
    return;
}
```

It's customary for programs that require command-line arguments to display a “usage” message when there are no arguments given.
For example, if you run `javac` or `java` from the command line without any arguments, you will get a very long message.