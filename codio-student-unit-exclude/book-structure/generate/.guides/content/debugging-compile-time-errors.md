The best kind of debugging is the kind you don't have to do because you avoid making errors in the first place.
Incremental development, which we presented in Section 4.8, can help.
The key is to start with a working program and add small amounts of code at a time.
When there is an error, you will have a pretty good idea where it is.

Nevertheless, you might find yourself in one of the following situations.
For each situation, we have some suggestions about how to proceed.


####  The compiler is spewing error messages.



If the compiler reports 100 error messages, that doesn't mean there are 100 errors in your program.
When the compiler encounters an error, it often gets thrown off track for a while.
It tries to recover and pick up again after the first error, but sometimes it reports spurious errors.

Only the first error message is truly reliable.
We suggest that you only fix one error at a time, and then recompile the program.
You may find that one semicolon or brace “fixes” 100 errors.


####  I'm getting a weird compiler message, and it won't go away.


First of all, read the error message carefully.
It may be written in terse jargon, but often there is a carefully hidden kernel of information.

If nothing else, the message will tell you where in the program the problem occurred.
Actually, it tells you where the compiler was when it noticed a problem, which is not necessarily where the error is.
Use the information the compiler gives you as a guideline, but if you don't see an error where the compiler is pointing, broaden the search.

Generally the error will be prior to the location of the error message, but there are cases where it will be somewhere else entirely.
For example, if you get an error message at a method invocation, the actual error may be in the method definition itself.

If you don't find the error quickly, take a breath and look more broadly at the entire program.
Make sure the program is indented properly; that makes it easier to spot syntax errors.

Now, start looking for common syntax errors:




1.  Check that all parentheses and brackets are balanced and properly nested.
All method definitions should be nested within a class definition.
All program statements should be within a method definition.

1.  Remember that uppercase letters are not the same as lowercase letters.

1.  Check for semicolons at the end of statements (and no semicolons after curly braces).


1.  Make sure that any strings in the code have matching quotation marks.
Make sure that you use double quotes for strings and single quotes for characters.

1.  For each assignment statement, make sure that the type on the left is the same as the type on the right.
Make sure that the expression on the left is a variable name or something else that you can assign a value to (like an element of an array).

1.  For each method invocation, make sure that the arguments you provide are in the right order and have the right type, and that the object you are invoking the method on is the right type.

1.  If you are invoking a value method, make sure you are doing something with the result.
If you are invoking a void method, make sure you are *not* trying to do something with the result.

1.  If you are invoking an instance method, make sure you are invoking it on an object with the right type.
If you are invoking a static method from outside the class where it is defined, make sure you specify the class name (using dot notation).

1.  Inside an instance method you can refer to the instance variables without specifying an object.
If you try that in a static method -- with or without `this` -- you get a message like “non-static variable x cannot be referenced from a static context.”


If nothing works, move on to the next section...


####  I can't get my program to compile no matter what I do.


If the compiler says there is an error and you don't see it, that might be because you and the compiler are not looking at the same code.
Check your development environment to make sure the program you are editing is the program the compiler is compiling.

This situation is often the result of having multiple copies of the same program.
You might be editing one version of the file, but compiling a different version.

If you are not sure, try putting an obvious and deliberate syntax error right at the beginning of the program.
Now compile again.
If the compiler doesn't find the new error, there is probably something wrong with the way you set up the development environment.


If you have examined the code thoroughly, and you are sure the compiler is compiling the right source file, it is time for desperate measures: **debugging by bisection**.



*  Make a backup of the file you are working on.
If you are working on `Bob.java`, make a copy called `Bob.java.old`.

*  Delete about half the code from `Bob.java`.
Try compiling again.

\begin{itemize}

*  If the program compiles now, you know the error is in the code you deleted.
Bring back about half of what you deleted and repeat.

*  If the program still doesn't compile, the error must be in the code that remains.
Delete about half of the remaining code and repeat.


\item Once you have found and fixed the error, start bringing back the code you deleted, a little bit at a time.

\end{itemize}

This process is ugly, but it goes faster than you might think, and it is very reliable.
It works for other programming languages too!


####  I did what the compiler told me to do, but it still doesn't work.


Some error messages come with tidbits of advice, like “class Golfer must be declared abstract.
It does not define int compareTo(java.lang.Object) from interface java.lang.Comparable.”
It sounds like the compiler is telling you to declare `Golfer` as an `abstract` class, and if you are reading this book, you probably don't know what that is or how to do it.

Fortunately, the compiler is wrong.
The solution in this case is to make sure `Golfer` has a method called `compareTo` that takes an `Object` as a parameter.

Don't let the compiler lead you by the nose.
Error messages give you evidence that something is wrong, but the remedies they suggest are unreliable.