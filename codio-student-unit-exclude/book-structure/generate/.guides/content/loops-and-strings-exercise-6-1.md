**Exercise 6.1:**

Consider the following methods:

```code
public static void main(String[] args) {
    loop(10);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
}
```



1.  Draw a table that shows the value of the variables `i` and `n` during the execution of `loop`.
The table should contain one column for each variable and one line for each iteration.

1.  What is the output of this program?

1.  Can you prove that this loop terminates for any positive value of `n`?