So far we have seen local variables, which are declared inside a method, and instance variables, which are declared in a class definition, usually before the method definitions.
Now it's time to learn about **class variables**.
They are shared across all instances of the class.



Like instance variables, class variables are defined in a class definition, before the method definitions.
But they are identified by the keyword `static`.
Here is a version of `Card` where `RANKS` and `SUITS` are defined as class variables:

```code
public class Card {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    // instance variables and constructors go here

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
}
```


Class variables are allocated when the program begins (or when the class is used for the first time) and survive until the program ends.
In contrast, instance variables like `rank` and `suit` are allocated when the program creates `new` objects, and they are reclaimed when the object is garbage-collected.


Class variables are often used to store constant values that are needed in several places.
In that case, they should also be declared as `final`.
Note that whether a variable is `static` or `final` involves two separate considerations:
`static` means the variable is *shared*, and `final` means the variable is *constant*.

Naming `static final` variables with capital letters is a common convention that makes it easier to recognize their role in the class.
In the `toString` method, we can refer to `SUITS` and `RANKS` as if they were local variables, but we can tell that they are class variables.

One advantage of defining `SUITS` and `RANKS` as class variables is that they don't need to be created (and garbage-collected) every time `toString` is called.
They may also be needed in other methods and classes, so it's helpful to make them available everywhere.
Since the array variables are `final`, and the strings they reference are immutable, there is no danger in making them `public`.