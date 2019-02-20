Selection sort is a simple algorithm, but it is not very efficient.
To sort $n$ items, it has to traverse the array $n-1$ times.
Each traversal takes an amount of time proportional to $n$.
The total time, therefore, is proportional to $n^2$.


We will develop a more efficient algorithm called **merge sort**.
To sort $n$ items, merge sort takes time proportional to $n \log_2 n$.
That may not seem impressive, but as $n$ gets big, the difference between $n^2$ and $n \log_2 n$ can be enormous.

For example, $\log_2$ of one million is around 20.
So if you had to sort a million numbers, merge sort would require 20 million steps.
But selection sort would require one trillion steps!

The idea behind merge sort is this: if you have two subdecks, each of which has already been sorted, you can quickly merge them into a single, sorted deck.
Try this out with a deck of cards:



1.  Form two subdecks with about 10 cards each, and sort them so that when they are face up the lowest cards are on top.
Place both decks face up in front of you.

1.  Compare the top card from each deck and choose the lower one.
Flip it over and add it to the merged deck.

1.  Repeat step 2 until one of the decks is empty.
Then take the remaining cards and add them to the merged deck.


The result should be a single sorted deck.
In the next few sections, we'll explain how to implement this algorithm in Java.