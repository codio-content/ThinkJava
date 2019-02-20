This implementation of `add` does not modify either of the parameters.
Instead, it creates and returns a new `Time` object.
Alternatively, we could have written a method like this:

```code
public void increment(double seconds) {
    this.second += seconds;
    while (this.second >= 60.0) {
        this.second -= 60.0;
        this.minute += 1;
    }
    while (this.minute >= 60) {
        this.minute -= 60;
        this.hour += 1;
    }
}
```

The `increment` method modifies an existing `Time` object.
It doesn't create a new one, and it doesn't return anything.


In contrast, methods like `add` (in the previous section) are called **pure** because:



*  They don't modify the parameters.
*  They don't have any other “side effects”, like printing.
*  The return value only depends on the parameters, not on any other data.



Methods like `increment`, which breaks the first rule, are sometimes called **modifiers**.
They are usually void methods, but sometimes they return a reference to the object they modify.

Modifiers can be more efficient because they don't create new objects.
But they can also be error-prone.
When objects are aliased, the effects of modifiers can be confusing.


If a class provides only getters and pure methods (no setters or modifiers), then the objects will be immutable.
Working with immutable objects can be more difficult at first, but they can save you from long hours of debugging.