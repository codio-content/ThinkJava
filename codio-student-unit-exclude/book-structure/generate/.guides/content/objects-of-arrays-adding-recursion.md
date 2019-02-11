###  Adding recursion


Now that we have a way to `merge` two decks, the real fun begins!
The magical thing about merge sort is that it is inherently recursive.
Take another look at the pseudocode for `almostMergeSort` in the previous section.

At the point where you sort the subdecks, why should you invoke the slower method, `selectionSort`?
Why not invoke the spiffy new `mergeSort` method, the one you are in the process of writing?
Not only is that a good idea, it is *necessary* to achieve the $\log_2$ performance advantage.

To make `mergeSort` work recursively, you have to add a base case; otherwise it repeats forever.
A simple base case is a subdeck with 0 or 1 cards.
If `mergeSort` receives such a small subdeck, it can return it unmodified since it would already be sorted.

The recursive version of `mergeSort` looks something like this:

```code
public Deck mergeSort() {
    // if the deck has 0 or 1 cards, return it
    // divide the deck into two subdecks
    // sort the subdecks using mergeSort
    // merge the subdecks, return the result
}
```


As usual, there are two ways to think about recursive programs: you can think through the entire flow of execution, or you can make the “leap of faith” (see Section 9.4).
This example should encourage you to make the leap of faith.

When you used `selectionSort` to sort the subdecks, you didn't feel compelled to follow the flow of execution.
You just assumed it works because you had already debugged it.
And all you did to make `mergeSort` recursive was replace one sorting algorithm with another.
There is no reason to read the program any differently.

Well, almost.
You might have to give some thought to getting the base case right and making sure that you reach it eventually.
But other than that, writing the recursive version should be no problem.
The most difficult part of merge sort is the `merge` method, and that part is not recursive.