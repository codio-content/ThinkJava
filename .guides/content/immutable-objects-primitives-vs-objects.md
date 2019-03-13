Not everything in Java is an object: `int`, `double`, `char`, and `boolean` are examples of **primitive** types. When you declare a variable with a primitive type, Java reserves a small amount of memory to store its value. Figure 9.1 shows how the following values are stored memory.

```code
int number = -2;
char symbol = '!';
```

![Figure 9.1 Memory diagram of two primitive variables.](figs/mem1.jpg)

**Figure 9.1 Memory diagram of two primitive variables.**


As we learned in Section 7.2, an array variable stores a *reference* to an array. That's because the array itself is too large to fit in the variable's memory. For example, `char[] array = \{'c', 'a', 't'\`;} contains three characters.

![Figure 9.2 Memory diagram of an array of characters.](figs/mem2.jpg)

**Figure 9.2 Memory diagram of an array of characters.**

When drawing memory diagrams, we use an arrow to represent the location of the array, as in Figure 9.2. The actual memory location (the *value* of the array variable) is an integer chosen by Java at run-time.

Objects work in a similar way. When you declare an object variable, it will store a reference to an object. In contrast to arrays, which store multiple elements of the same data type, objects can be used to **encapsulate** any type of data.

For example, a `String` object encapsulates a character array. Figure 9.3 illustrates how strings are stored in memory.

![Figure 9.3 Memory diagram of a `String` object.](figs/mem3.jpg)

**Figure 9.3 Memory diagram of a `String` object.**

Behind the scenes, the code `String word = "dog";` creates an array of the characters `'d'`, `'o'`, and `'g'`, and stores the reference to that array in a `String` object. The variable `word` contains a reference to the `String` object.


To test whether two integers (or other primitive types) are equal, you simply use the `==` operator. But as we learned in Section 6.8, you need to use the `equals` method to compare strings. The `equals` method traverses the arrays and tests whether they contain the same characters.

On the other hand, two `String` objects with the same characters would not be considered equal in the `==` sense. The `==` operator, when applied to string variables, only tests whether they refer to the *same* object.




In Java, the keyword `null` is a special value that means “no object”. You can initialize object and array variables this way:

```code
String name = null;
int[] combo = null;
```

The value `null` is represented in memory diagrams by a small box with no arrow, as in Figure 9.4. In other words, the variables do not reference anything.

![Figure 9.4 Memory diagram showing variables that are `null`.](figs/mem4.jpg)

**Figure 9.4 Memory diagram showing variables that are `null`.**


If you try to use a variable that is `null` by invoking a method or accessing an element, Java throws a `NullPointerException`.

```code
System.out.println(name.length());  // NullPointerException
System.out.println(combo[0]);       // NullPointerException
```

On the other hand, it is perfectly fine to pass a `null` reference as an argument to a method, or to receive one as a return value. In these situations, `null` is often used to represent a special condition or indicate an error.