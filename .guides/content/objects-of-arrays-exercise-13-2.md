**Exercise 13.2:**

The goal of this exercise is to implement the shuffling algorithm from this chapter.



1.  In the repository for this book, you should find the file named `Deck.java`.
Check that you can compile it in your environment.

1.  Implement the `randomInt` method.
You can use the `nextInt` method provided by `java.util.Random`, which we saw in Section 7.6.

*Hint:* Avoid creating a `Random` object every time `randomInt` is invoked by defining a class variable.

1.  Implement the `swapCards` method that takes two indexes and swaps the cards at the given locations.

1.  Implement the `shuffle` method using the algorithm in Section 13.2.