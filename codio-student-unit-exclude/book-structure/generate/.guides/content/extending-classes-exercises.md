The code for this chapter is in the `ch14` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 15.1:**

Design a better strategy for the `Player.play` method.
For example, if there are multiple cards you can play, and one of them is an eight, you might want to play the eight.


Think of other ways you can minimize penalty points, such as playing the highest-ranking cards first.
Write a new class that extends `Player` and overrides `play` to implement your strategy.




**Exercise 15.2:**

Write a loop that plays the game 100 times and keeps track of how many times each player wins.
If you implemented multiple strategies in the previous exercise, you can play them against each other to evaluate which one works best.

*Hint:* Design a `Genius` class that extends `Player` and overrides the `play` method, and then replace one of the players with a `Genius` object.




**Exercise 15.3:**

One limitation of the program we wrote in this chapter is that it only handles two players.
Modify the `Eights` class to create an `ArrayList` of players, and modify `nextPlayer` to select the next player.




**Exercise 15.4:**

When we designed the program for this chapter, we tried to minimize the number of classes.
As a result, we ended up with a few awkward methods.
For example, `cardMatches` is a static method in `Player`, but it would be more natural if it were an instance method in `Card`.

The problem is that `Card` is supposed to be useful for any card game, not just *Crazy Eights*.
You can solve this problem by adding a new class, `EightsCard`, that extends `Card` and provides a method, `match`, that checks whether two cards match according to the rules of *Crazy Eights*.

At the same time, you could create a new class, `EightsHand`, that extends `Hand` and provides a method, `scoreHand`, that adds up the scores of the cards in the hand.
And while you're at it, you could add a method named `scoreCard` to `EightsCard`.

Whether or not you actually make these changes, draw a UML class diagram that shows this alternative object hierarchy.