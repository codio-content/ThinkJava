The code for this chapter is in the `ch13` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 14.1:**

Write a `toString` method for the `Deck` class.
It should return a single string that represents the cards in the deck.
When it's printed, this string should display the same results as the `print` method in Section 0.1.


*Hint:* You can use the `+` operator to concatenate strings, but it is not very efficient.
Consider using `java.lang.StringBuilder` instead; you can review the documentation by doing a web search for “Java StringBuilder”.




**Exercise 14.2:**

The goal of this exercise is to implement the shuffling algorithm from this chapter.



1.  In the repository for this book, you should find the file named `Deck.java`.
Check that you can compile it in your environment.

1.  Implement the `randomInt` method.
You can use the `nextInt` method provided by `java.util.Random`, which we saw in Section 0.6.

*Hint:* Avoid creating a `Random` object every time `randomInt` is invoked by defining a class variable.

1.  Implement the `swapCards` method that takes two indexes and swaps the cards at the given locations.

1.  Implement the `shuffle` method using the algorithm in Section 0.2.





**Exercise 14.3:**

The goal of this exercise is to implement the sorting algorithms from this chapter.
Use the `Deck.java` file from the previous exercise, or create a new one from scratch.



1.  Implement the `indexLowest` method.
Use the `Card.compareTo` method to find the lowest card in a given range of the deck (from `lowIndex` to `highIndex`, including both).

1.  Implement `selectionSort` using the algorithm in Section 0.3.

1.  Using the pseudocode in Section 0.4, implement the `merge` method.
The best way to test it is to build and shuffle a deck.
Then use `subdeck` to form two small subdecks, and use selection sort to sort them.
Finally, pass the two halves to `merge` and see if it works.

1.  Implement `almostMergeSort`, the one that divides the deck in half, uses `selectionSort` to sort the two halves, and uses `merge` to create a new, sorted deck.
You should be able to reuse code from the previous step.

1.  Implement `mergeSort` recursively.
Remember that `selectionSort` is a modifier and `mergeSort` is a pure method, which means that they get invoked differently:

```code
deck.selectionSort();      // modifies an existing deck
deck = deck.mergeSort();   // replaces old deck with new
```





**Exercise 14.4:**

You can learn more about the sorting algorithms in this chapter, and others, at [http://www.sorting-algorithms.com/](sorting-algorithms.com).
This site provides explanations of the algorithms and animations that show how they work.
It also includes an analysis of their efficiency.

For example, “insertion sort” is an algorithm that inserts elements into place, one at a time.
Read about it at [http://www.sorting-algorithms.com/insertion-sort](http://www.sorting-algorithms.com/insertion-sort).
Then write a method named `insertionSort` that implements this algorithm.

One goal of this exercise is to practice top-down design.
Your solution should use a helper method, named `insert`, that implements the inner loop of the algorithm.
`insertionSort` should invoke this method $n-1$ times.





**Exercise 14.5:**

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
If you haven't implemented the `shuffle` method (see Exercise 0.2), the game won't be that fun.
Player 1 will have the Ace through King of the first two suits, and Player 2 will have the the Ace through King of the other two suits, all in the same order.




**Exercise 14.6:**

Extend your program from the previous exercise to handle the case when a tie ends with a tie.
In other words, when the fourth cards have the same rank, add three more cards to the collection and try again.
You will need to wrap your code in a loop, for example: `while (diff == 0)`.