###  Recursive version



Another way to write a binary search is with a recursive method.
The trick is to write a method that takes `low` and `high` as parameters, and turn steps 3 and 4 into recursive invocations.
Here's what that code looks like:

```code
public static int binarySearch(Card[] cards, Card target,
                               int low, int high) {
    if (high < low) {
        return -1;
    }
    int mid = (low + high) / 2;                     // step 1
    int comp = cards[mid].compareTo(target);

    if (comp == 0) {                                // step 2
        return mid;
    } else if (comp < 0) {                          // step 3
        return binarySearch(cards, target, mid + 1, high);
    } else {                                        // step 4
        return binarySearch(cards, target, low, mid - 1);
    }
}
```

Instead of a `while` loop, we have an `if` statement to terminate the recursion.
We call this `if` statement the base case.
If `high` is less than `low`, there are no cards between them, and we conclude that the card is not in the array.


Two common errors in recursive methods are (1) forgetting to include a base case, and (2) writing the recursive call so that the base case is never reached.
Either error causes infinite recursion and a `StackOverflowError`.