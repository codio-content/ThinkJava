**Exercise 14.1:**

Find and open the file `War.java` in the repository.
The `main` method contains all the code from the last section of this chapter.
Check that you can compile and run this code before proceeding.

The program is incomplete; it does not handle the case when two cards have the same rank.
Finish implementing the `main` method beginning at the line that says: `// it's a tie...draw four more cards`.

When there's a tie, draw three cards from each pile and store them in a collection, along with the original two.
Then draw one more card from each pile and compare them.
Whoever wins the tie will take all ten of these cards.

If one pile does not have at least four cards, the game ends immediately.
If a tie ends with a tie, flip a coin and give the cards to one of the players.

Notice that this program depends on `Deck.shuffle`.
If you haven't implemented the `shuffle` method (see Exercise 13.2), the game won't be that fun.
Player 1 will have the Ace through King of the first two suits, and Player 2 will have the the Ace through King of the other two suits, all in the same order.