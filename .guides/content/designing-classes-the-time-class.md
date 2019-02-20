One common reason to define a new class is to encapsulate related data in an object that can be treated as a single unit.
That way, we can use objects as parameters and return values, rather than passing and returning multiple values.
We have already seen two types that encapsulate data in this way: `Point` and `Rectangle`.


Another example, which we will implement ourselves, is `Time`, which represents a time of day.
The data encapsulated in a `Time` object include an hour, a minute, and a number of seconds.
Because every `Time` object contains these data, we define attributes to hold them.


Attributes are also called **instance variables**, because each instance has its own variables (as opposed to class variables, coming up in Section 0.3).

The first step is to decide what type each variable should be.
It seems clear that `hour` and `minute` should be integers.
Just to keep things interesting, let's make `second` a double.

Instance variables are declared at the beginning of the class definition, outside of any method.
By itself, this code fragment is a legal class definition:

```code
public class Time {
    private int hour;
    private int minute;
    private double second;
}
```


The `Time` class is `public`, which means that it can be used in other classes.
But the instance variables are `private`, which means they can only be accessed from inside the `Time` class.
If you try to read or write them from another class, you will get a compiler error.


Private instance variables help keep classes isolated from each other so that changes in one class won't require changes in other classes.
It also simplifies what other programmers need to understand in order to use your classes.
This kind of isolation is called **information hiding**.