Three kinds of errors can occur in a program: compile-time errors, run-time errors, and logic errors.
It is useful to distinguish among them in order to track them down more quickly.


**Compile-time** errors occur when you violate the rules of the Java language.
For example, parentheses and braces have to come in matching pairs.
So `(1 + 2)` is legal, but `8)` is not.
In the latter case, the program cannot be compiled, and the compiler displays an error.


Error messages from the compiler usually indicate where in the program the error occurred, and sometimes they can tell you exactly what the error is.
As an example, let's get back to the hello world program from Section 1.3.




If you forget the semicolon at the end of the print statement, you might get an error message like this:

```code
File: Hello.java  [line: 5]
Error: ';' expected
```

That's pretty good: the location of the error is correct, and the error message tells you what's wrong.
But error messages are not always easy to understand.
Sometimes the compiler reports the place in the program where the error was *detected*, not where it actually occurred.
And sometimes the description of the problem is more confusing than helpful.

For example, if you forget the closing brace at the end of `main` (line 6), you might get a message like this:

```code
File: Hello.java  [line: 7]
Error: reached end of file while parsing
```


There are two problems here.
First, the error message is written from the compiler's point of view, not yours.
**Parsing** is the process of reading a program before translating; if the compiler gets to the end of the file while still parsing, that means something was omitted.
But the compiler doesn't know what.
It also doesn't know where.
The compiler discovers the error at the end of the program (line 7), but the missing brace should be on the previous line.

Error messages contain useful information, so you should make an effort to read and understand them.
But don't take them too literally.
During the first few weeks of your programming career, you will probably spend a lot of time tracking down compile-time errors.
As you gain experience, you will make fewer mistakes and find them more quickly.