The instance variables of `Card` are `private`, so they can't be accessed from other classes. We can provide getters to allow other classes to read the `rank` and `suit` values:

```code
public int getRank() {
    return this.rank;
}

public int getSuit() {
    return this.suit;
}
```

{Run!}(sh .guides/bg.sh javac code/Card.java java -cp code/ Card 5 )



Whether or not to provide setters is a design decision. If we did, cards would be mutable, so you could transform one card into another. That is probably not a feature we want, and in general, mutable objects are more error-prone. So it might be better to make cards immutable. To do that, all we have to do is *not* provide any modifier methods (including setters).


That's easy enough, but it is not foolproof, because some fool might come along later and add a modifier. We can prevent that possibility by declaring the instance variables `final`:

```code
public class Card {
    private final int rank;
    private final int suit;

    ...
}
```

{Run!}(sh .guides/bg.sh javac code/Card.java java -cp code/ Card 6 )


You can still assign values to these variables inside a constructor. But if someone writes a method that tries to modify these variables, they'll get a compiler error. Putting these kinds of safeguards into the code helps prevent future mistakes and hours of debugging.