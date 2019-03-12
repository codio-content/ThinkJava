In Java source code, some spaces are required.
For example, you need at least one space between words, so this program is not legal:

```code
publicclassGoodbye{

    publicstaticvoidmain(String[] args) {
        System.out.print("Goodbye, ");
        System.out.println("cruel world");
    }
}
```

But most other spaces are optional.
For example, the program in the top-left pane, `Goodbye.java` *is* legal.
To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/1/Goodbye.java java -cp code/1/ Goodbye )




The newlines are optional, too.
For example, we could write the same program like the example `Goodbye.java` in the bottom-left pane.
To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/2/Goodbye.java java -cp code/2/ Goodbye )




It still works, but the program is getting harder and harder to read.
Newlines and spaces are important for organizing your program visually, making it easier to understand the program and find errors when they occur.

Many editors will automatically format source code with consistent indenting and line breaks.
For example, in DrJava (see Appendix 15.1) you can indent your code by selecting all text (**Ctrl+A**) and pressing the **Tab** key.






Organizations that do a lot of software development usually have strict guidelines on how to format source code.
For example, Google publishes its Java coding standards for use in open-source projects: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html).

You probably won't understand these guidelines now, because they refer to language features we haven't yet seen.
But you might want to refer back to them periodically as you read this book.