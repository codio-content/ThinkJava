We have been using `System.out.println` for a while, but you might not have thought about what it means. `System` is a class that provides methods related to the “system” or environment where programs run. It also provides `System.out`, which is a special value that has additional methods (like `println`) for displaying output.

In fact, we can use `System.out.println` to display the value of `System.out`:

```code
System.out.println(System.out);
```

The result is:

```code
java.io.PrintStream@685d72cd
```

This output indicates that `System.out` is a `PrintStream`, which is defined in a package called `java.io`. A **package** is a collection of related classes; `java.io` contains classes for “I/O” which stands for input and output.

The numbers and letters after the `@` sign are the **address** of `System.out`, represented as a hexadecimal (base 16) number. The address of a value is its location in the computer's memory, which might be different on different computers. In this example the address is `685d72cd`, but if you run the same code you will likely get something else.

As shown in Figure 3.1, `System` is defined in a file called `System.java`, and `PrintStream` is defined in `PrintStream.java`. These files are part of the Java **library**, which is an extensive collection of classes that you can use in your programs. The source code for these classes is usually included with the compiler (see Section 10.6).

![Figure 4.1 `System.out.println` refers to the `out` variable of the `System` class, which is a `PrintStream` that provides a method called `println`.](figs/system.jpg)

**Figure 4.1 `System.out.println` refers to the `out` variable of the `System` class, which is a `PrintStream` that provides a method called `println`.**