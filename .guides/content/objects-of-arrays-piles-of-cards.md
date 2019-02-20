Now that we have classes that represent cards and decks, let's use them to make a game.
One of the simplest card games that children play is called “War” (see [https://en.wikipedia.org/wiki/War_(card_game)](https://en.wikipedia.org/wiki/War_(card_game))).

In this game, the deck is divided into two or more piles.
Players take turns revealing the top card of their pile.
Whoever has the highest ranking card takes the two cards.
If there is a tie, players draw four more cards.
Whoever has the highest ranking fourth card takes all ten cards.
The game continues until one player has won the entire deck.

We could use the `Deck` class to represent the individual piles.
However, our implementation of `Deck` uses a `Card` array, and the length of an array can't change.
As the game progresses, we need to be able to add and remove cards from the piles.


We can solve this problem by using an `ArrayList`, which is in the `java.util` package.
An `ArrayList` is a **collection**, which is an object that contains other objects.
It provides methods to add and remove elements, and it grows and shrinks automatically.



We will define a new class named `Pile` that represents a pile of cards.
It uses an `ArrayList` (instead of an array) to store the `Card` objects.

```code
public class Pile {
    private ArrayList<Card> cards;

    public Pile() {
        this.cards = new ArrayList<Card>();
    }
}
```


When you declare an `ArrayList`, you specify the type it contains in angle brackets (`<>`).
This declaration says that `cards` is not just an `ArrayList`, it's an `ArrayList` of `Card` objects.
The constructor initializes `this.cards` with an empty `ArrayList`.


`ArrayList` provides a method, `add`, that adds an element to the collection.
We will write a `Pile` method that does the same thing:

```code
public void addCard(Card card) {
    this.cards.add(card);        // to the bottom of the pile
}
```


We also need to be able to remove cards from the top (or front) of the pile.
If we use `ArrayList.remove`, it will automatically shift the remaining cards left to fill the gap.

```code
public Card popCard() {
    return this.cards.remove(0);  // from the top of the pile
}
```

In order to know when to stop the game, we need to know how many cards are in each pile.

```code
public int size() {
    return this.cards.size();
}
```


Methods like `addCard`, `popCard`, and `size`, which invoke another method without doing much additional work, are called **wrapper methods**.
The last method we need adds an entire subdeck to the pile.

```code
public void addDeck(Deck deck) {
    for (Card card : deck.getCards()) {
        this.cards.add(card);
    }
}
```

Now we can use `Deck` and `Pile` to implement the game.
The `main` method begins like this:

```code
// create and shuffle the deck
Deck deck = new Deck();
deck.shuffle();

// divide the deck into piles
Pile p1 = new Pile();
p1.addDeck(deck.subdeck(0, 25));
Pile p2 = new Pile();
p2.addDeck(deck.subdeck(26, 51));
```

The game itself is a loop that repeats until one of the piles is empty.
At each iteration, we draw a card from each pile and compare their ranks.

```code
// while both piles are not empty
while (p1.size() > 0 && p2.size() > 0) {
    Card c1 = p1.popCard();
    Card c2 = p2.popCard();

    // compare the cards
    int diff = c1.getRank() - c2.getRank();
    if (diff > 0) {
        p1.addCard(c1);
        p1.addCard(c2);
    } else if (diff < 0) {
        p2.addCard(c1);
        p2.addCard(c2);
    } else {  // it's a tie...draw four more cards
```

One of the exercises at the end of this chapter asks you to implement the `else` block when there's a tie.
After the `while` loop ends, we display the winner based on which pile is not empty.

```code
if (p1.size() > 0) {
    System.out.println("Player 1 wins!");
} else {
    System.out.println("Player 2 wins!");
}
```

`ArrayList` provides many other methods that we didn't use for this example program.
Take a minute to read about them in the Java documentation.