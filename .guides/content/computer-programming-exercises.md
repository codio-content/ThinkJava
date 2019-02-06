###  Exercises


At the end of each chapter, we include exercises you can do with the things you've learned.
We encourage you to at least attempt every problem.
You can't learn to program only by reading about it; you have to practice.

Before you can compile and run Java programs, you might have to download and install a few tools.
There are many good options, but we recommend DrJava, which is an “integrated development environment” (IDE) well suited for beginners.
Instructions for getting started are in Appendix **16**.

The code for this chapter is in the `ch01` directory of `ThinkJavaCode2`.
See page in section **Using the code examples** for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 2.1:**

Computer scientists have the annoying habit of using common English words to mean something other than their common English meaning.
For example, in English, statements and comments are the same thing, but in programs they are different.



1.  In computer jargon, what's the difference between a statement and a comment?
1.  What does it mean to say that a program is portable?
1.  In common English, what does the word compile mean?
1.  What is an executable? Why is that word used as a noun?


The glossary at the end of each chapter is intended to highlight words and phrases that have special meanings in computer science.
When you see familiar words, don't assume that you know what they mean!




**Exercise 2.2:**

Before you do anything else, find out how to compile and run a Java program.
Some environments provide sample programs similar to the example in Section **2.3**.



1.  Type in the hello world program, then compile and run it.

1.  Add a print statement that displays a second message after the “Hello, World!”.
Say something witty like, “How are you?”
Compile and run the program again.

1.  Add a comment to the program (anywhere), recompile, and run it again.
The new comment should not affect the result.


This exercise may seem trivial, but it is the starting place for many of the programs we will work with.
To debug with confidence, you will need to have confidence in your programming environment.

In some environments, it is easy to lose track of which program is executing.
You might find yourself trying to debug one program while you are accidentally running another.
Adding (and changing) print statements is a simple way to be sure that the program you are looking at is the program you are running.




**Exercise 2.3:**

It is a good idea to commit as many errors as you can think of, so that you see what error messages the compiler produces.
Sometimes the compiler tells you exactly what is wrong, and all you have to do is fix it.
But sometimes the error messages are misleading.
Over time you will develop a sense for when you can trust the compiler and when you have to figure things out yourself.

Starting with the hello world program, try out each of the following errors.
After you make each change, compile the program, read the error message (if there is one), and then fix the error.



1.  Remove one of the open curly braces.
1.  Remove one of the close curly braces.
1.  Instead of `main`, write `mian`.
1.  Remove the word `static`.
1.  Remove the word `public`.
1.  Remove the word `System`.
1.  Replace `println` with `Println`.
1.  Replace `println` with `print`.
1.  Delete one of the parentheses.
1.  Add an extra parenthesis.