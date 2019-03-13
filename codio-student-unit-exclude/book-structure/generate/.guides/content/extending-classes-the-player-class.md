The `Deck` and `Hand` classes we have defined so far could be used for any card game; we have not yet implemented any of the rules specific to *Crazy Eights*.
And that's probably a good thing, since it makes it easy to reuse these classes if we want to make another game in the future.

But now it's time to implement the rules.
We'll use two classes: `Player`, which encapsulates player strategy, and `Eights`, which creates and maintains the state of the game.
Here is the beginning of the `Player` definition:


```code
public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }
```

A `Player` has two `private` attributes: a name and a hand.
The constructor takes the player's name as a string and saves it in an instance variable.
In this example, we have to use `this` to distinguish between the instance variable and the parameter with the same name.

The primary method that `Player` provides is `play`, which decides which card to discard during each turn:

```code
public Card play(Eights eights, Card prev) {
    Card card = searchForMatch(prev);
    if (card == null) {
        card = drawForMatch(eights, prev);
    }
    return card;
}
```

{Run!}(sh .guides/bg.sh javac code/Player.java java -cp code/ Player )


The first parameter is a reference to the `Eights` object that encapsulates the state of the game.
We'll need it if we have to draw a new card.
The second parameter, `prev`, is the card on top of the discard pile.


Using top-down development, the `play` method invokes two helper methods, `searchForMatch` and `drawForMatch`.
The first method looks in the player's hand for a card that matches the previously played card:

```code
public Card searchForMatch(Card prev) {
    for (int i = 0; i < hand.size(); i++) {
        Card card = hand.getCard(i);
        if (cardMatches(card, prev)) {
            return hand.popCard(i);
        }
    }
    return null;
}
```

The strategy is pretty simple: the `for` loop searches for the first card that's legal to play and returns it.
If there are no cards that match, it returns `null`.
And in that case, we have to draw cards until we get a match.

```code
public Card drawForMatch(Eights eights, Card prev) {
    while (true) {
        Card card = eights.drawCard();
        System.out.println(name + " draws " + card);
        if (cardMatches(card, prev)) {
            return card;
        }
        hand.addCard(card);
    }
}
```

{Run!}(sh .guides/bg.sh javac code/Player.java java -cp code/ Player 2 )


The `while` loop runs until it finds a match (we'll assume for now that it always does).
It uses the `Eights` object to draw a card.
If it matches, it returns the card.
Otherwise it adds the card to the player's hand and repeats.

Both `searchForMatch` and `drawForMatch` use `cardMatches`, which is a static method, also defined in `Player`.
This method is a straightforward translation of the rules of the game:

```code
public static boolean cardMatches(Card card1, Card card2) {
    if (card1.getSuit() == card2.getSuit()) {
        return true;
    }
    if (card1.getRank() == card2.getRank()) {
        return true;
    }
    if (card1.getRank() == 8) {
        return true;
    }
    return false;
}
```

{Run!}(sh .guides/bg.sh javac code/Player.java java -cp code/ Player )


Finally, `Player` provides a `score` method, which computes penalty points for cards left in a player's hand at the end of the game.