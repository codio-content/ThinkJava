One of the most powerful features of a programming language is the ability to define and manipulate **variables**.
A variable is a named location in memory that stores a **value**.
Values may be numbers, text, images, sounds, and other types of data.
To store a value, you first have to declare a variable.

```code
String message;
```


This statement is called a **declaration**, because it declares that the variable named `message` has the type `String`.
Each variable has a **type** that determines what kind of values it can store.
For example, the `int` type can store integers, and the `char` type can store characters.

Some types begin with a capital letter and some with lowercase.
We will learn the significance of this distinction later, but for now you should take care to get it right.
There is no such type as `Int` or `string`.

To declare an integer variable named `x`, you simply type:

```code
int x;
```

Note that `x` is an arbitrary name for the variable.
In general, you should use names that indicate what the variables mean.

```code
String firstName;
String lastName;
int hour, minute;
```

This example declares two variables with type `String` and two with type `int`.
The last line shows how to declare multiple variables with the same type: `hour` and `minute` are both integers.
Note that each declaration statement ends with a semicolon (`;`).


Variable names usually begin with a lowercase letter, in contrast to class names (like `Hello`) that start with a capital letter.
When a variable name contains more than one word (like `firstName`), it is conventional to capitalize the first letter of each subsequent word.
Variable names are case-sensitive, so `firstName` is not the same as `firstname` or `FirstName`.


You can use any name you want for a variable.
But there are about 50 reserved words, called **keywords**, that you are not allowed to use as variable names.
These words include `public`, `class`, `static`, `void`, and `int`, which are used by the compiler to analyze the structure of the program.

You can find the complete list of keywords at [http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html), but you don't have to memorize them.
Most programming editors provide “syntax highlighting”, which makes different parts of the program appear in different colors.