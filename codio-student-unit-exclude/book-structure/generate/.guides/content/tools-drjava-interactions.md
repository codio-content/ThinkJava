###  DrJava interactions


One of the most useful features of DrJava is the “Interactions Pane” at the bottom of the window.
It provides the ability to try out code quickly, without having to write a class definition and save/compile/run the program.
Figure 16.2 shows an example.


![Figure 16.2 Screenshot of the Interactions Pane in DrJava.](figs/drjava-logic.png)

**Figure 16.2 Screenshot of the Interactions Pane in DrJava.**

There is one subtle detail to note when using the Interactions feature.
If you don't end an expression (or statement) with a semicolon, DrJava automatically displays its value.
Notice in Figure 16.2 how the variable declarations end with semicolons, but the logic expressions in the following lines do not.
This feature saves you from having to type `System.out.println` every time.

What's nice about this feature is that you don't have to create a new class, declare a `main` method, write arbitrary expressions inside `System.out.println` statements, save the source file, and get all of your code to compile in advance.
Also, you can press the up/down arrows on the keyboard to repeat previous commands and experiment with incremental differences.