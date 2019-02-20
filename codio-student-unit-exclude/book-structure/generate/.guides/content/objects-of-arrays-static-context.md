Figure 0.3 lists the `Deck` methods we have so far.
In UML diagrams, `private` methods begin with a minus sign (`-`), and `static` methods are underlined.


![Figure 14.3 UML diagram for the `Deck` class.](figs/deck.jpg)

**Figure 14.3 UML diagram for the `Deck` class.**

The helper methods `randomInt` and `merge` are `static`, because they do not require `this.cards`.
All other methods are instance methods, because they require an instance of `this.cards`.
For example, you cannot invoke the `print` method this way:

```code
Deck.print();  // wrong!
```



If you try to compile this code, you will get the error, “non-static method print() cannot be referenced from a static context.”
By **static context**, the compiler means you are trying to invoke a method without passing `this`.
To invoke an instance method, you need an instance:

```code
Deck deck = new Deck();
deck.print();  // correct
```

Notice that `Deck` with a capital `D` is a class, and `deck` with a lowercase `d` is a variable.
When you invoke `deck.print()`, the reference of `deck` becomes the reference `this`.
For static methods, there is no such thing as `this`.

```code
private static Deck merge(Deck d1, Deck d2) {
    return this.cards;  // wrong!
}
```

If you refer to `this` in a static method, you will get the compiler error, “non-static variable this cannot be referenced from a static context.”
The `merge` method needs to create and return a new `Deck` object.