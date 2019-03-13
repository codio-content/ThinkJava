Primitive values (like `int`s, `double`s, and `char`s) cannot be `null`, and they do not provide methods. For example, you can't invoke `equals` on an `int`:

```code
int i = 5;
System.out.println(i.equals(5));  // compiler error
```


But for each primitive type, there is a corresponding **wrapper class** in the Java library. The wrapper class for `int` is named `Integer`, with a capital `I`.

```code
Integer i = new Integer(5);
System.out.println(i.equals(5));  // displays true
```

Other wrapper classes include `Boolean`, `Character`, `Double`, and `Long`. They are in the `java.lang` package, so you can use them without importing them.

Like strings, objects from wrapper classes are immutable. And you need to use the `equals` method to compare them.

```code
Integer x = new Integer(123);
Integer y = new Integer(123);
if (x == y) {                           // false
    System.out.println("x and y are the same object");
}
if (x.equals(y)) {                      // true
    System.out.println("x and y have the same value");
}
```
Try it out in the panel to the left. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/Wrapper.java java -cp code/ Wrapper )


Because `x` and `y` refer to different `Integer` objects, the code only displays “x and y have the same value”.

Each wrapper class defines the constants `MIN_VALUE` and `MAX_VALUE`. For example, `Integer.MIN_VALUE` is `-2147483648`, and `Integer.MAX_VALUE` is `2147483647`. Because these constants are available in wrapper classes, you don't have to remember them, and you don't have to write them yourself.


Wrapper classes also provide methods for converting strings to and from primitive types. For example, `Integer.parseInt` converts a string to (you guessed it) an integer. In this context, **parse** means “read and translate”.

```code
String str = "12345";
int num = Integer.parseInt(str);
```

The other wrapper classes provide similar methods, like `Double.parseDouble` and `Boolean.parseBoolean`. They also each provide `toString`, which returns a string representation of a value:

```code
int num = 12345;
String str = Integer.toString(num);
```

{Run!}(sh .guides/bg.sh javac code/Wrapper.java java -cp code/ Wrapper 2 )


The result is the string `"12345"`, which as you now understand, is stored internally in a character array `\{'1', '2', '3', '4', '5'\`}.


It's always possible to convert a primitive value to a string, but not the other way around. The following code throws a `NumberFormatException`.

```code
String str = "five";
int num = Integer.parseInt(str);  // NumberFormatException
```