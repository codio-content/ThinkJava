At this point we have a class that represents a collection of cards.
It provides functionality common to decks of cards, piles of cards, hands of cards, and potentially other collections.


However, each kind of collection will be slightly different.
Rather than add every possible feature to `CardCollection`, we can use **inheritance** to define subclasses.
A **subclass** is a class that “extends” an existing class; that is, it has the attributes and methods of the existing class, plus more.

Here is the complete definition of our new and improved `Deck` class:

```code
public class Deck extends CardCollection {

    public Deck(String label) {
        super(label);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }
}
```


{Run!}(sh .guides/bg.sh javac code/Deck.java java -cp code/ Deck )


The first line uses the keyword `extends` to indicate that `Deck` extends the class `CardCollection`.
That means a `Deck` object has the same instance variables and methods as a `CardCollection`.
Another way to say the same thing is that `Deck` “inherits from” `CardCollection`.
We could also say that `CardCollection` is a **superclass**, and `Deck` is one of its subclasses.



In Java, classes may only extend one superclass.
Classes that do not specify a superclass with `extends` automatically inherit from `java.lang.Object`.
So in this example, `Deck` extends `CardCollection`, which in turn extends `Object`.
The `Object` class provides the default `equals` and `toString` methods, among other things.

Constructors are not inherited, but all other `public` attributes and methods are.
The only additional method in `Deck`, at least for now, is a constructor.
So you can create a `Deck` object like this:

```code
Deck deck = new Deck("Deck");
```

The first line of the constructor uses `super`, which is a keyword that refers to the superclass of the current class.
When `super` is used like a method, as in this example, it invokes the constructor of the superclass.


So in this case, `super` invokes the `CardCollection` constructor, which initializes the attributes `label` and `cards`.
When it returns, the `Deck` constructor resumes and populates the (empty) `ArrayList` with `Card` objects.

That's it for the `Deck` class.
Next we need a way to represent a hand, which is the collection of cards held by a player, and a pile, which is a collection of cards on the table.
We could define two classes, one for hands and one for piles, but there is not much difference between them.
So we'll use one class, called `Hand`, for both hands and piles.
Here's what the definition looks like:


```code
public class Hand extends CardCollection {

    public Hand(String label) {
        super(label);
    }

    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
        System.out.println();
    }
}
```

{Run!}(sh .guides/bg.sh javac code/Hand.java java -cp code/ Hand )


Like `Deck`, the `Hand` class extends `CardCollection`.
So it inherits methods like `getLabel`, `size`, and `getCard`, which are used in `display`.
`Hand` also provides a constructor, which invokes the constructor of `CardCollection`.

In summary, a `Deck` is just like a `CardCollection`, but it provides a different constructor.
And a `Hand` is just like a `CardCollection`, but it provides an additional method, `display`.