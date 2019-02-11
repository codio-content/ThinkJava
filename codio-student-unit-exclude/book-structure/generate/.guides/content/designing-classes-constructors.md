###  Constructors



After declaring instance variables, the next step is to define a **constructor**, which is a special method that initializes the object.
The syntax for constructors is similar to that of other methods, except:




*  The name of the constructor is the same as the name of the class.
*  Constructors have no return type (and no return value).
*  The keyword `static` is omitted.


Here is an example constructor for the `Time` class:

```code
public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
}
```

This constructor does not take any arguments.
Each line initializes an instance variable to zero (which in this example means midnight).


The name `this` is a keyword that refers to the object we are creating.
You can use `this` the same way you use the name of any other object.
For example, you can read and write the instance variables of `this`, and you can pass `this` as an argument to other methods.
But you do not declare `this`, and you can't make an assignment to it.

A common error when writing constructors is to put a `return` statement at the end.
Like `void` methods, constructors do not return values.

To create a `Time` object, you must use the `new` operator:

```code
public static void main(String[] args) {
    Time time = new Time();
}
```


When you use `new`, Java creates the object and invokes your constructor to initialize the instance variables.
When the constructor is done, `new` returns a reference to the new object.
In this example, the reference gets assigned to the variable `time`, which has type `Time`.
Figure 12.1 shows the result.


![Figure 12.1 Memory diagram of a `Time` object.](figs/time.jpg)

**Figure 12.1 Memory diagram of a `Time` object.**


Beginners sometimes make the mistake of using `new` in the constructor.
Doing so causes an infinite recursion, since `new` invokes the same constructor, which uses `new` again, which invokes the constructor again, and so on.

```code
public Time() {
    new Time();         // StackOverflowError
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
}
```