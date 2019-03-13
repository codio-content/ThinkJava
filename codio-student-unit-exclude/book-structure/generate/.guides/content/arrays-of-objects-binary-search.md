When you look for a word in a dictionary, you don't just search page by page from front to back.
Since the words are in alphabetical order, you probably use a **binary search** algorithm:



1.  Start on a page near the middle of the dictionary.

1.  Compare a word on the page to the word you are looking for.
If you find it, stop.

1.  If the word on the page comes before the word you are looking for, flip to somewhere later in the dictionary and go to step 2.

1.  If the word on the page comes after the word you are looking for, flip to somewhere earlier in the dictionary and go to step 2.


This algorithm is much faster than sequential search, because it rules out half of the remaining words each time you make a comparison.
If at any point you find two adjacent words on the page, and your word comes between them, you can conclude that your word is not in the dictionary.

Getting back to the array of cards, we can write this faster version of `search` if we know the cards are in order:

```code
public static int binarySearch(Card[] cards, Card target) {
    int low = 0;
    int high = cards.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;                 // step 1
        int comp = cards[mid].compareTo(target);

        if (comp == 0) {                            // step 2
            return mid;
        } else if (comp < 0) {                      // step 3
            low = mid + 1;
        } else {                                    // step 4
            high = mid - 1;
        }
    }
    return -1;
}
```

{Run!}(sh .guides/bg.sh javac code/Card.java java -cp code/ Card )


First, we declare `low` and `high` variables to represent the range we are searching.
Initially we search the entire array, from `0` to `cards.length - 1`.

Inside the `while` loop, we repeat the four steps of binary search:



1.  Choose an index between `low` and `high` -- call it `mid` -- and compare the card at `mid` to the target.

1.  If you found the target, return its index (which is `mid`).

1.  If the card at `mid` is lower than the target, search the range from `mid + 1` to `high`.

1.  If the card at `mid` is higher than the target, search the range from `low` to `mid - 1`.


If `low` exceeds `high`, there are no cards in the range, so we terminate the loop and return `-1`.
Notice that this algorithm only depends on the `compareTo` method of the object.
We can apply this same code to any object that provides a `compareTo` method.