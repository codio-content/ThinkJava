Some of the methods we have used require arguments, which are the values you provide in parentheses when you invoke the method.

For example, the `Math.sin` method takes a `double` argument. To find the sine of a number, you have to provide the number: `Math.sin(0.0)`. Similarly, the `System.out.println` method takes a `String` argument. To display a message, you have to provide the message: `System.out.println("Hello")`.


When you invoke a method, you provide the arguments. When you define a method, you name the **parameters**, which are variables that indicate what arguments are required. The class in the top-left pane shows an example.
{Run!}(sh .guides/bg.sh javac code/PrintTwice.java java -cp code/ PrintTwice )





The `printTwice` method has a parameter named `s` with type `String`. When you invoke `printTwice`, you have to provide an argument with type `String`.


Before the method executes, the argument gets assigned to the parameter. In this example, the argument `"Don't make me say this twice!"` gets assigned to the parameter `s`.


This process is called **parameter passing** because the value gets passed from outside the method to the inside. An argument can be any kind of expression, so if you have a `String` variable, you can use its value as an argument:

```code
String message = "Never say never.";
printTwice(message);
```

The value you provide as an argument must have the same (or compatible) type as the parameter. For example, if you try:

```code
printTwice(17);  // syntax error
```

You will get an error message like this:

```code
File: Test.java  [line: 10]
Error: method printTwice in class Test cannot be applied
       to given types;
  required: java.lang.String
  found: int
  reason: actual argument int cannot be converted to
          java.lang.String by method invocation conversion
```

Sometimes Java can convert an argument from one type to another automatically. For example, `Math.sqrt` requires a `double`, but if you invoke `Math.sqrt(25)`, the integer value `25` is automatically converted to the floating-point value `25.0`. But in the case of `printTwice`, Java can't (or won't) convert the integer `17` to a `String`.


Parameters and other variables only exist inside their own methods. Inside `main`, there is no such thing as `s`. If you try to use it there, you'll get a compiler error. Similarly, inside `printTwice` there is no such thing as `message`. That variable belongs to `main`. Because variables only exist inside the methods where they are defined, they are often called **local variables**.




Here is an example of a method that takes two parameters:

```code
public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
}
```

In the parameter list, it may be tempting to write:

```code
public static void printTime(int hour, minute) {  // error
```

But that format (without the second `int`) is only allowed for local variables. For parameters, you need to declare the type of each variable separately.

To invoke this method, we have to provide two integers as arguments:

```code
int hour = 11;
int minute = 59;
printTime(hour, minute);
```

Beginners sometimes make the mistake of “declaring” the arguments:

```code
int hour = 11;
int minute = 59;
printTime(int hour, int minute);  // syntax error
```

That's a syntax error, because the compiler sees `int hour` and `int minute` as variable declarations, not expressions. You wouldn't declare the types of the arguments if they were simply integers:

```code
printTime(int 11, int 59);  // syntax error
```


You can see the pulled together code fragments in the bottom-left pane.
{Run!}(sh .guides/bg.sh javac code/PrintTime.java java -cp code/ PrintTime )
