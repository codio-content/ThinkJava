Consider the following example:

```code
public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}
```

{Run!}(sh .guides/bg.sh javac code/Countdown.java java -cp code/ Countdown )


The name of the method is `countdown`; it takes a single integer as a parameter. If the parameter is zero, it displays the word “Blastoff”. Otherwise, it displays the number and then invokes itself, passing `n - 1` as the argument.

What happens if we invoke `countdown(3)` from `main`?



> The execution of `countdown` begins with `n == 3`, and since `n` is not zero, it displays the value 3, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 2`, and since `n` is not zero, it displays the value 2, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 1`, and since `n` is not zero, it displays the value 1, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 0`, and since `n` is zero, it displays the word “Blastoff!” and then returns.

The `countdown` that got `n == 1` returns. \end{quote} The `countdown` that got `n == 2` returns. \end{quote} The `countdown` that got `n == 3` returns. \end{quote}

And then you're back in `main`. So the total output looks like:

```code
3
2
1
Blastoff!
```

As a second example, we'll rewrite the methods `newLine` and `threeLine` from Section 4.3. Here they are again:

```code
public static void newLine() {
    System.out.println();
}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}
```


Although these methods work, they would not help if we wanted to display two newlines, or maybe 100. A more general alternative would be:

```code
public static void nLines(int n) {
    if (n > 0) {
        System.out.println();
        nLines(n - 1);
    }
}
```

This method takes an integer, `n`, as a parameter and displays `n` newlines. The structure is similar to `countdown`. As long as $n$ is greater than zero, it displays a newline and then invokes itself to display $(n-1)$ additional newlines. The total number of newlines is $1 + (n - 1)$, which is just what we wanted: $n$.