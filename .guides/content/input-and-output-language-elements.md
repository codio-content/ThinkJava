At this point, we have seen nearly all of the organizational units that make up Java programs.
Figure 3.2 shows how these “language elements” are related.

![Figure 4.2 Elements of the Java language, from largest to smallest.](figs/package.jpg)

**Figure 4.2 Elements of the Java language, from largest to smallest.**


Java applications are typically organized into packages (like `java.io` and `java.util`) that include multiple classes (like `PrintStream` and `Scanner`).
Each class defines its own methods (like `println` and `nextLine`), and each method is a sequence of statements.

Each statement performs one or more computations, depending on how many expressions it has, and each expression represents a single value to compute.
For example, the assignment statement `hours = minutes / 60.0;` contains a single expression: `minutes / 60.0`.

**Tokens** are the most basic elements of a program, including numbers, variable names, operators, keywords, parentheses, braces, and semicolons.
In the previous example, the tokens are `hours`, `=`, `minutes`, `/`, `60.0`, and `;` (spaces are ignored by the compiler).


Knowing this terminology is helpful, because error messages often say things like “not a statement” or “illegal start of expression” or “unexpected token”.
Comparing Java to English, statements are complete sentences, expressions are phrases, and tokens are individual words and punctuation marks.

Note there is a big difference between the Java *language*, which defines the elements in Figure 3.2, and the Java *library*, which provides the built-in classes that you can import.
For example, the keywords `public` and `class` are part of the Java language, but the names `PrintStream` and `Scanner` are not.

The standard edition of Java comes with *several thousand* classes you can use, which can be both exciting and intimidating.
You can browse this library at [http://docs.oracle.com/javase/8/docs/api/](http://docs.oracle.com/javase/8/docs/api/).
Interestingly, most of the Java library is written in Java.