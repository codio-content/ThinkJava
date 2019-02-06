###  Displaying two messages


You can put as many statements as you like in the `main` method.
For example, to display more than one line of output:

```code
public class Hello2 {

    public static void main(String[] args) {
        // generate some simple output
        System.out.println("Hello, World!");  // first line
        System.out.println("How are you?");   // another line
    }
}
```

As this example shows, you can put comments at the end of a line as well as on lines all by themselves.


Phrases that appear in quotation marks are called **strings**, because they contain a sequence of characters strung together in memory.
Characters can be letters, numbers, punctuation marks, symbols, spaces, tabs, etc.


`System.out.println` appends a special character, called a **newline**, that moves to the beginning of the next line.
If you don't want a newline at the end, you can use `print` instead of `println`:


```code
public class Goodbye {

    public static void main(String[] args) {
        System.out.print("Goodbye, ");
        System.out.println("cruel world");
    }
}
```


In this example, the first statement does not add a newline, so the output appears on a single line as `Goodbye, cruel world`.
Notice that there is a space at the end of the first string, which appears in the output just before the word cruel.