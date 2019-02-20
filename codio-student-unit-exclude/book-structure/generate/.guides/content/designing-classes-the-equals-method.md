We have seen two ways to check whether values are equal: the `==` operator and the `equals` method.
With objects you can use either one, but they are not the same.



*  The `==` operator checks whether two references are **identical**; that is, whether they refer to the same object.


*  The `equals` method checks whether two objects are **equivalent**; that is, whether they have the same values.


The definition of identity is always the same, so the `==` operator always does the same thing.
But the definition of equivalence is different for different objects, so objects can define their own `equals` methods.

Consider the following variables and the memory diagram in Figure 0.2.

```code
Time time1 = new Time(9, 30, 0.0);
Time time2 = time1;
Time time3 = new Time(9, 30, 0.0);
```


![Figure 12.2 Memory diagram of three `Time` variables.](figs/time2.jpg)

**Figure 12.2 Memory diagram of three `Time` variables.**

The assignment operator copies references, so `time1` and `time2` refer to the same object.
Because they are identical, `time1 == time2` is true.
But `time1` and `time3` refer to two different objects.
Because they are not identical, `time1 == time3` is false.

By default, the `equals` method does the same thing as `==`.
For `Time` objects, that's probably not what we want.
For example, `time1` and `time3` represent the same time of day, so we should consider them equivalent.


We can provide an `equals` method that implements this idea:

```code
public boolean equals(Time that) {
    return this.hour == that.hour
        && this.minute == that.minute
        && this.second == that.second;
}
```

`equals` is an instance method, so it doesn't have the keyword `static`.
It uses `this` to refer to current object, and `that` to refer to the other.
The parameter named `that` is not a keyword and could have a different name, but it improves readability.
We can invoke `equals` as follows:

```code
time1.equals(time3);
```

Inside the `equals` method, `this` refers to the same object as `time1`, and `that` refers to the same object as `time3`.
Since their instance variables are equal, the result is `true`.

Many objects have a similar notion of equivalence; that is, two objects are considered equal if their instance variables are equal.
But other definitions are possible.
You could, for example, allow a `Time` object and a `String` object to be considered equal if they represent the same time.

```code
public boolean equals(String str) {
    return str.equals(this.toString());
}
```

The `equals` method is now overloaded.
If we invoke `time1.equals(time3)`, the first method will be used; `time1.equals("09:30:00.0")` uses the second.