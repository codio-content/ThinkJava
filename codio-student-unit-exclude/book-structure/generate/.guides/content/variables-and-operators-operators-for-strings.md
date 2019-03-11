In general, you cannot perform mathematical operations on strings, even if the strings look like numbers.
The following expressions are illegal:

```code
"Hello" - 1     "World" / 123     "Hello" * "World"
```


The `+` operator works with strings, but it might not do what you expect.
For strings, the `+` operator performs **concatenation**, which means joining end-to-end.
So `"Hello, " + "World!"` yields the string `"Hello, World!"`.

Likewise if you have a variable called `name` that has type `String`, the expression `"Hello, " + name` appends the value of `name` to the hello string, which creates a personalized greeting.

Since addition is defined for both numbers and strings, Java performs automatic conversions you may not expect:

```code
System.out.println(1 + 2 + "Hello");
// the output is 3Hello

System.out.println("Hello" + 1 + 2);
// the output is Hello12
```
See the example java code in the left panel.
To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/StringOps.java java -cp code/ StringOps )


Java executes these operations from left to right.
In the first line, `1 + 2` is `3`, and `3 + "Hello"` is `"3Hello"`.
But in the second line, `"Hello" + 1` is `"Hello1"`, and `"Hello1" + 2` is `"Hello12"`.




When more than one operator appears in an expression, they are evaluated according to the **order of operations**.
Generally speaking, Java evaluates operators from left to right (as we saw in the previous section).
But for numeric operators, Java follows mathematical conventions:



*  Multiplication and division take “precedence” over addition and subtraction, which means they happen first.
So `1 + 2 * 3` yields 7, not 9, and `2 + 4 / 2` yields 4, not 3.

*  If the operators have the same precedence, they are evaluated from left to right.
So in the expression `minute * 100 / 60`, the multiplication happens first; if the value of `minute` is 59, we get `5900 / 60`, which yields `98`.
If these same operations had gone from right to left, the result would have been `59 * 1`, which is incorrect.


*  Any time you want to override the order of operations (or you are not sure what it is) you can use parentheses.
Expressions in parentheses are evaluated first, so `(1 + 2) * 3` is 9.
You can also use parentheses to make an expression easier to read, as in `(minute * 100) / 60`, even though it doesn't change the result.


See the Java tutorials for a complete table of operator precedence: [https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).
If the order of operations is not obvious when looking at an expression, you can always add parentheses to make it more clear.
But over time, you should internalize these kinds of details about the Java language.