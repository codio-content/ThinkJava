###  CardCollection


To implement *Crazy Eights*, we need to represent a deck of cards, a discard pile, a draw pile, and a hand for each player.
And we need to be able to deal, draw, and discard cards.

The `Deck` and `Pile` classes from the previous chapter meet some of these requirements.
But unless we make some changes, neither of them can be used to represent a hand of cards that well.


Furthermore, `Deck` and `Pile` are essentially two versions of the same code: one based on arrays, and the other based on `ArrayList`.
It would be helpful to combine their features into one class that meets the needs of both.

We will define a class named `CardCollection` and add the code we want one step at a time.
Since this class will represent different piles and hands of cards, we'll add a `label` attribute to tell them apart.


```code
public class CardCollection {

    private String label;
    private ArrayList<Card> cards;

    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }
}
```


As with the `Pile` class, we need a way to add cards to the collection.
Here is the `addCard` method from the previous chapter:

```code
public void addCard(Card card) {
    this.cards.add(card);
}
```


Until now, we have used `this` explicitly to make it easy to identify attributes.
Inside `addCard` and other instance methods, you can access instance variables without using the keyword `this`.
So from here on, we will drop it:

```code
public void addCard(Card card) {
    cards.add(card);
}
```

We also need to be able to remove cards from the collection.
The following method takes an index, removes the card at that location, and shifts the following cards left to fill the gap:

```code
public Card popCard(int i) {
    return cards.remove(i);
}
```


If we are dealing cards from a shuffled deck, we don't care which card gets removed.
It is most efficient to choose the last one, so we don't have to shift any cards left.
Here is an overloaded version of `popCard` that removes and returns the last card:

```code
public Card popCard() {
    int i = size() - 1;     // from the end of the collection
    return popCard(i);
}
```

Notice that `popCard` uses `CardCollection`'s own `size` method, which in turn calls the `ArrayList`'s `size` method:

```code
public int size() {
    return cards.size();
}
```

For convenience, `CardCollection` also provides an `empty` method that returns `true` when `size` is zero:

```code
public boolean empty() {
    return cards.size() == 0;
}
```

To access the elements of an `ArrayList`, you can't use the array `[]` operator.
Instead, you have to use the methods `get` and `set`.
Here is a wrapper for `get`:

```code
public Card getCard(int i) {
    return cards.get(i);
}
```

The `lastCard` method gets the last card (but doesn't remove it):

```code
public Card lastCard() {
    int i = size() - 1;
    return cards.get(i);
}
```


In order to control the ways card collections are modified, we don't provide a wrapper for `set`.
The only modifiers we provide are the two versions of `popCard` and the following version of `swapCards`:

```code
public void swapCards(int i, int j) {
    Card temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
}
```

We use `swapCards` to implement `shuffle`, which we described in Section **14.2**:

```code
public void shuffle() {
    Random random = new Random();
    for (int i = size() - 1; i > 0; i--) {
        int j = random.nextInt(i);
        swapCards(i, j);
    }
}
```