###  Shuffling decks



For most card games, you need to be able to shuffle the deck; that is, put the cards in a random order.
In Section **8.6** we saw how to generate random numbers, but it is not obvious how to use them to shuffle a deck.

One possibility is to model the way humans shuffle, which is usually dividing the deck in two halves and then choosing alternately from each one.
Since humans usually don't shuffle perfectly, after about seven iterations the order of the deck is pretty well randomized.

But a computer program would have the annoying property of doing a perfect shuffle every time, which is not very random.
In fact, after eight perfect shuffles, you would find the deck back in the order you started in!
For more on this, see [https://en.wikipedia.org/wiki/Faro_shuffle](https://en.wikipedia.org/wiki/Faro_shuffle).


A better shuffling algorithm is to traverse the deck one card at a time, and at each iteration, choose two cards and swap them.
To sketch an outline of how this algorithm works, we will use a combination of Java statements and English comments.
This technique is sometimes called **pseudocode**.


```code
public void shuffle() {
    for each index i {
        // choose a random number between i and length - 1
        // swap the ith card and the randomly-chosen card
    }
}
```


The nice thing about pseudocode is that it often makes clear what other methods you are going to need.
In this case, we need a method that chooses a random integer between `low` and `high`, and a method that takes two indexes and swaps the cards at those positions.

```code
private static int randomInt(int low, int high) {
    // return a random number between low and high
}

private void swapCards(int i, int j) {
    // swap the ith and the jth cards in the array
}
```


Methods like `randomInt` and `swapCards` are called **helper methods**, because they help you solve parts of the problem.
Helper methods are often `private`, since they are specific to the internal algorithms of the class.


This process of writing pseudocode first and then writing helper methods to make it work is called **top-down design** (see [https://en.wikipedia.org/wiki/Top-down_and_bottom-up_design](https://en.wikipedia.org/wiki/Top-down_and_bottom-up_design)).
It is similar to “incremental development” and “encapsulation and generalization”, the other design processes you have seen in this book.

One of the exercises at the end of the chapter asks you to write the helper methods `randomInt` and `swapCards`, and use them to implement `shuffle`.