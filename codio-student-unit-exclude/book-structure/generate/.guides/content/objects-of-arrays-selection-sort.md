###  Selection sort



Now that we have shuffled the deck, we need a way to put it back in order.
There is an algorithm for sorting that is ironically similar to the algorithm for shuffling.
It's called **selection sort**, because it works by traversing the array repeatedly and selecting the lowest (or highest) remaining card each time.

During the first iteration, we find the lowest card and swap it with the card in the 0th position.
During the $i$th iteration, we find the lowest card to the right of $i$ and swap it with the $i$th card.

```code
public void selectionSort() {
    for each index i {
        // find the lowest card at or to the right of i
        // swap the ith card and the lowest card found
    }
}
```

Again, the pseudocode helps with the design of the helper methods.
For this algorithm we can use `swapCards` from before, so we only need a method to find the lowest card; we'll call it `indexLowest`.

```code
private int indexLowest(int low, int high) {
    // find the lowest card between low and high
}
```


One of the exercises at the end of the chapter asks you to write `indexLowest`, and then use it and `swapCards` to implement `selectionSort`.