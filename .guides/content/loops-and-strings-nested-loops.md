###  Nested loops



Like conditional statements, loops can be nested one inside the other.
Nested loops allow you to iterate over two variables.
For example, we can generate a “multiplication table” like this:

```code
for (int x = 1; x <= 10; x++) {
    for (int y = 1; y <= 10; y++) {
        System.out.printf("%4d", x * y);
    }
    System.out.println();
}
```


Variables like `x` and `y` are called **loop variables**, because they control the execution of a loop.
In this example, the first loop (`for x`) is known as the “outer loop”, and the second loop (`for y`) is known as the “inner loop”.

Each loop repeats their corresponding statements 10 times.
The outer loop iterates from 1 to 10 only once, but the inner loop iterates from 1 to 10 each of those 10 times.
As a result, the `printf` method is invoked 100 times.


The format specifier `%4d` displays the value of `x * y` padded with spaces so it's four characters wide.
Doing so causes the output to align vertically, regardless of how many digits the numbers have:

```code
   1   2   3   4   5   6   7   8   9  10
   2   4   6   8  10  12  14  16  18  20
   3   6   9  12  15  18  21  24  27  30
   4   8  12  16  20  24  28  32  36  40
   5  10  15  20  25  30  35  40  45  50
   6  12  18  24  30  36  42  48  54  60
   7  14  21  28  35  42  49  56  63  70
   8  16  24  32  40  48  56  64  72  80
   9  18  27  36  45  54  63  72  81  90
  10  20  30  40  50  60  70  80  90 100
```

It's important to realize that the output is displayed row by row.
The inner loop displays a single row of output, followed by a newline.
The outer loop iterates over the rows themselves.
Another way to read nested loops, like the ones in this example, is “for each row `x`, and for each column `y`, \ldots”