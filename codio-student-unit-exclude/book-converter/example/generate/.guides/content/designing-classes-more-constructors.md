###  More constructors



Like other methods, constructors can be overloaded, which means you can provide multiple constructors with different parameters.
Java knows which constructor to invoke by matching the arguments you provide with the parameters of the constructor.


It is common to provide a constructor that takes no arguments, like the previous one, and a “value constructor”, like this one:

```code
public Time(int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
}
```


All this constructor does is copy values from the parameters to the instance variables.
In this example, the names and types of the parameters are the same as the instance variables.
As a result, the parameters **shadow** (or hide) the instance variables, so the keyword `this` is necessary to tell them apart.
Parameters don't have to use the same names, but that's a common style.

To invoke this second constructor, you have to provide arguments after the `new` operator.
This example creates a `Time` object that represents a fraction of a second before noon:

```code
Time time = new Time(11, 59, 59.9);
```

Overloading constructors provides the flexibility to create an object first and then fill in the attributes, or collect all the information before creating the object itself.

Once you get the hang of it, writing constructors gets boring.
You can write them quickly just by looking at the list of instance variables.
In fact, some IDEs can generate them for you.

Pulling it all together, here is the complete class definition so far:


```code
public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
```