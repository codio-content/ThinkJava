###  Other types of errors



The second type of error is a **run-time error**, so-called because it does not appear until after the program has started running.
In Java, these errors occur while the interpreter is executing byte code and something goes wrong.
These errors are also called “exceptions” because they usually indicate that something unexpected has happened.

Run-time errors are rare in the simple programs you will see in the first few chapters, so it might be a while before you encounter one.
When a run-time error occurs, the interpreter displays an error message that explains what happened and where.
For example, if you accidentally divide by zero you will get a message like:


```code
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Hello.main(Hello.java:5)
```



Error messages are very useful for debugging.
The first line includes the name of the exception, `java.lang.ArithmeticException`, and a message that indicates more specifically what happened, `/ by zero`.
The next line shows the method where the error occurred; `Hello.main` indicates the method `main` in the class `Hello`.
It also reports the file where the method is defined, `Hello.java`, and the line number where the error occurred, `5`.

Sometimes error messages contain additional information that doesn't make sense.
It can be a challenge to figure out where to find the useful parts without being overwhelmed by extraneous information.
Keep in mind that the line where the program crashed may not be the line that needs to be corrected.



The third type of error is a **logic error**.
If your program has a logic error, it will compile and run without generating error messages, but it will not do the right thing.
Instead, it will do exactly what you told it to do.
For example, here is a version of the hello world program with a logic error:


```code
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, ");
        System.out.println("World!");
    }
}
```

This program compiles and runs just fine, but the output is:

```code
Hello,
World!
```

Assuming that we wanted the output on one line, this is not correct.
The problem is that the first line uses `println`, when we probably meant to use `print` (see the “goodbye world” example of Section **goodbye**).

Identifying logic errors can be hard because you have to work backwards, looking at the output of the program, trying to figure out why it is doing the wrong thing, and how to make it do the right thing.
Usually the compiler and the interpreter can't help you, since they don't know what the right thing is.