###  More generalization


The previous result is similar to the “nested loops” approach in Section 7.4.
However, the inner loop is now encapsulated in the `printRow` method.
We can encapsulate the outer loop in a method too:

```code
public static void printTable() {
    int i = 1;
    while (i <= 6) {
        printRow(i);
        i = i + 1;
    }
}
```

The initial version of `printTable` always displays six rows.
We can generalize it by replacing the literal `6` with a parameter:

```code
public static void printTable(int rows) {
    int i = 1;
    while (i <= rows) {  // generalized rows
        printRow(i);
        i = i + 1;
    }
}
```

Here is the output of `printTable(7)`:

```code
   1   2   3   4   5   6
   2   4   6   8  10  12
   3   6   9  12  15  18
   4   8  12  16  20  24
   5  10  15  20  25  30
   6  12  18  24  30  36
   7  14  21  28  35  42
```

That's better, but it still has a problem: it always displays the same number of columns.
We can generalize more by adding a parameter to `printRow`:

```code
public static void printRow(int n, int cols) {
    int i = 1;
    while (i <= cols) {  // generalized cols
        System.out.printf("%4d", n * i);
        i = i + 1;
    }
    System.out.println();
}
```

Now `printRow` takes two parameters: `n` is the value whose multiples should be displayed, and `cols` is the number of columns.
Since we added a parameter to `printRow`, we also have to change the line in `printTable` where it is invoked:

```code
public static void printTable(int rows) {
    int i = 1;
    while (i <= rows) {
        printRow(i, rows);  // added rows argument
        i = i + 1;
    }
}
```

When this line executes, it evaluates `rows` and passes the value, which is 7 in this example, as an argument.
In `printRow`, this value is assigned to `cols`.
As a result, the number of columns equals the number of rows, so we get a square 7x7 table (instead of the previous 7x6 table):


When you generalize a method appropriately, you often find that it has capabilities you did not plan.
For example, you might notice that the multiplication table is symmetric.
Since $ab = ba$, all the entries in the table appear twice.
You could save ink by printing half of the table, and you would only have to change *one line* of `printTable`:

```code
printRow(i, i);  // using i for both n and cols
```

In English, the length of each row is the same as its row number.
The result is a triangular multiplication table.

```code
   1
   2   4
   3   6   9
   4   8  12  16
   5  10  15  20  25
   6  12  18  24  30  36
   7  14  21  28  35  42  49
```

Generalization makes code more versatile, more likely to be reused, and sometimes easier to write.
In this example, we started with a simple idea and ended with two general-purpose methods.