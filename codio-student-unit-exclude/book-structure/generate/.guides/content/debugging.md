##  Debugging



Although there are debugging suggestions throughout the book, we thought it would be useful to organize them in an appendix.
If you are having a hard time debugging, you might want to review this appendix from time to time.

The best debugging strategy depends on what kind of error you have:



*  **Compile-time errors** indicate that there is something wrong with the syntax of the program.
Example: omitting the semicolon at the end of a statement.


*  **Run-time errors** are produced if something goes wrong while the program is running.
Example: an infinite recursion eventually causes a `StackOverflowError`.


*  **Logic errors** cause the program to do the wrong thing.
Example: an expression may not be evaluated in the order you expect.


The following sections are organized by error type; some techniques are useful for more than one type.