###  Compiling Java programs



The programming language you will learn in this book is Java, which is a **high-level language**.
Other high-level languages you may have heard of include Python, C and C++, PHP, Ruby, and JavaScript.


Before they can run, programs in high-level languages have to be translated into a **low-level language**, also called “machine language”.
This translation takes some time, which is a small disadvantage of high-level languages.
But high-level languages have two major advantages:



*  It is *much* easier to program in a high-level language.
Programs take less time to write, they are shorter and easier to read, and they are more likely to be correct.


*  High-level languages are **portable**, meaning they can run on different kinds of computers with few or no modifications.
Low-level programs can only run on one kind of computer, and have to be rewritten to run on another.



Two kinds of programs translate high-level languages into low-level languages: interpreters and compilers.
An **interpreter** reads a high-level program and executes it, meaning that it does what the program says.
It processes the program a little at a time, alternately reading lines and performing computations.
Figure **2.2** shows the structure of an interpreter.

![Figure 2.2 How interpreted languages are executed.](figs/interpreter.jpg)

**Figure 2.2 How interpreted languages are executed.**


In contrast, a **compiler** reads the entire program and translates it completely before the program starts running.
In this context, the high-level program is called the **source code**, and the translated program is called the **object code** or the **executable**.
Once a program is compiled, you can execute it repeatedly without further translation.
As a result, compiled programs often run faster than interpreted programs.


Java is *both* compiled and interpreted.
Instead of translating programs directly into machine language, the Java compiler generates **byte code**.
Similar to object code, byte code is easy and fast to interpret.
But it is also portable, so it is possible to compile a Java program on one machine, transfer the byte code to another machine, and run the byte code on the other machine.
This ability is an advantage of Java over some other high-level languages.


Figure **2.3** shows the steps of the development process.
The Java compiler is a program named `javac`.
It translates `.java` files into `.class` files that store the resulting byte code.
The Java interpreter is a program named `java`, which is short for “Java Virtual Machine” (JVM).

![Figure 2.3 The process of compiling and running a Java program.](figs/compiler.jpg)

**Figure 2.3 The process of compiling and running a Java program.**

The programmer writes source code in the file `Hello.java` and uses `javac` to compile it.
If there are no errors, the compiler saves the byte code in the file `Hello.class`.
To run the program, the programmer uses `java` to interpret the byte code.
The result of the program is then displayed on the screen.

Although it might seem complicated, these steps are automated for you in most program development environments.
Usually you only have to press a button or type a single command to compile and run your program.
On the other hand, it is important to know what steps are happening in the background, so if something goes wrong you can figure out what it is.