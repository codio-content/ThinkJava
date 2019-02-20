When you output a `double` using `print` or `println`, it displays up to 16 decimal places:

```code
System.out.print(4.0 / 3.0);
```

The result is:

```code
1.3333333333333333
```


That might be more than you want.
`System.out` provides another method, called `printf`, that gives you more control of the format.
The “f” in `printf` stands for “formatted”.
Here's an example:

```code
System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
```


The first value in the parentheses is a **format string** that specifies how the output should be displayed.
This format string contains ordinary text followed by a **format specifier**, which is a special sequence that starts with a percent sign.
The format specifier `%.3f` indicates that the following value should be displayed as floating-point, rounded to three decimal places.
The result is:

```code
Four thirds = 1.333
```

The format string can contain any number of format specifiers; here's an example with two of them:

```code
int inch = 100;
double cm = inch * CM_PER_INCH;
System.out.printf("%d in = %f cm\n", inch, cm);
```

The result is:

```code
100 in = 254.000000 cm
```

Like `print`, `printf` does not append a newline.
So format strings often end with a newline character.

The format specifier `%d` displays integer values (“d” stands for “decimal”, not double).
The values are matched up with the format specifiers in order, so `inch` is displayed using `%d`, and `cm` is displayed using `%f`.

Learning about format strings is like learning a sub-language within Java.
There are many options, and the details can be overwhelming.
Table 0.5 lists a few common uses, to give you an idea of how things work.

|`%d`|decimal integer|12345 |
|-|-|-|
|`%08d`|padded with zeros, at least 8 digits wide|00012345 |
|`%f`|floating-point|6.789000 |
|`%.2f`|rounded to 2 decimal places|6.79 |
|`%s`|string of characters|`"Hello"` |


For more details, refer to the documentation of `java.util.Formatter`.
The easiest way to find documentation for Java classes is to do a web search for “Java” and the name of the class.

In contrast to `print` and `println`, `printf` uses commas to separate each value.
The following line accidentally *concatenates* `inch` and `cm` to the format string, rather than substitute them:

```code
System.out.printf("%d in = %f cm\n" + inch + cm);  // error
```

Unfortunately the compiler won't catch this kind of bug, because it's within a legal Java statement.
However when you run the program, it will display:



```code
Exception in thread "main" java.util.MissingFormatArgumentException:
Format specifier '%d'
    at java.util.Formatter.format(Formatter.java:2519)
    at java.io.PrintStream.format(PrintStream.java:970)
    at java.io.PrintStream.printf(PrintStream.java:871)
    at Example.main(Example.java:10)
```


Error messages may seem cryptic, but it's important to read them carefully.
Starting from the top, this one says “missing format argument” and “format specifier %d”.
In order words, it doesn't know what value to substitute for the %d.
The bottom of the error indicates where to look: Example.java line 10.

It might be difficult to see what's wrong, given that `inch` and `cm` are at the end of the `printf` statement.
But if `inch` is 1 and `cm` is 2.54, the actual format string would be `"%d in = %f cm\n12.54"`.