In Section 13.2 we introduced top-down development, which is a way of developing programs by identifying high-level goals, like shuffling a deck, and breaking them into smaller problems, like finding the lowest element in an array or swapping two elements.


In this section we present **bottom-up design**, which goes the other way around: first we identify simple pieces we need, then we assemble them into more complex algorithms.

Looking at the rules of *Crazy Eights*, we can identify some of the methods we'll need:



*  Create the deck, the players, and the discard and draw piles. Deal the cards and set up the game. (`Eights` constructor)

*  Check whether the game is over. (`isDone`)

*  If the draw pile is empty, shuffle the discard pile and move the cards into the draw pile. (`reshuffle`)

*  Draw a card, reshuffling the discard pile if necessary. (`drawCard`)

*  Keep track of whose turn it is, and switch from one player to the next. (`nextPlayer`)

*  Display the state of the game, and wait for the user before running the next turn. (`displayState`)


Now we can start implementing the pieces. Here is the beginning of the class definition for `Eights`, which encapsulates the state of the game:


```code
public class Eights {

    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;
```

In this version, there are always two players. One of the exercises at the end of the chapter asks you to modify this code to handle more players. The `Eights` class also includes a draw pile, a discard pile, and a `Scanner`, which we will use to prompt the user after each turn.

The constructor for `Eights` initializes the instance variables and deals the cards, similar to Section 14.3. The next piece we'll need is a method that checks whether the game is over. If either hand is empty, we're done:

```code
public boolean isDone() {
    return one.getHand().empty() || two.getHand().empty();
}
```

When the draw pile is empty, we have to shuffle the discard pile. Here is a method for that:

```code
public void reshuffle() {
    Card prev = discardPile.popCard();
    discardPile.dealAll(drawPile);
    discardPile.addCard(prev);
    drawPile.shuffle();
}
```

{Run!}(sh .guides/bg.sh javac code/Eights.java java -cp code/ Eights )


The first line saves the top card from `discardPile`. The next line transfers the rest of the cards to `drawPile`. Then we put the saved card back into `discardPile` and shuffle `drawPile`. We can use `reshuffle` as part of the `draw` method:

```code
public Card drawCard() {
    if (drawPile.empty()) {
        reshuffle();
    }
    return drawPile.popCard();
}
```

The `nextPlayer` method takes the current player as a parameter and returns the player who should go next.

```code
public Player nextPlayer(Player current) {
    if (current == one) {
        return two;
    } else {
        return one;
    }
}
```

{Run!}(sh .guides/bg.sh javac code/Eights.java java -cp code/ Eights 2 )


The last method from our bottom-up design is `displayState`. It displays the hand of each player, the contents of the discard pile, and how many cards are in the draw pile. Finally, it waits for the user to press the **Enter** key.


Using these pieces, we can write `takeTurn`, which executes one player's turn. It reads the top card off the discard pile and passes it to `player.play`, which we saw in the previous section. The result is the card the player chose, which is added to the discard pile.

```code
public void takeTurn(Player player) {
    Card prev = discardPile.lastCard();
    Card next = player.play(this, prev);
    discardPile.addCard(next);

    System.out.println(player.getName() + " plays " + next);
    System.out.println();
}
```

Finally, we use `takeTurn` and the other methods to write `playGame`:

```code
public void playGame() {
    Player player = one;

    // keep playing until there's a winner
    while (!isDone()) {
        displayState();
        takeTurn(player);
        player = nextPlayer(player);
    }

    // display the final score
    one.displayScore();
    two.displayScore();
}
```

{Run!}(sh .guides/bg.sh javac code/Eights.java java -cp code/ Eights 3)


Done! Notice the result of bottom-up design is similar to top-down: we have a high-level method that calls helper methods. The main difference is the order we used to arrive at this solution.