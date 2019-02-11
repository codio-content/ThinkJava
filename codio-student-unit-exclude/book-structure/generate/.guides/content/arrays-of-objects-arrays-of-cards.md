###  Arrays of cards






Just as you can create an array of `String` objects, you can create an array of `Card` objects.
The following statement creates an array of 52 cards:

```code
Card[] cards = new Card[52];
```

Figure 13.2 shows the memory diagram for this array.

![Figure 13.2 Memory diagram of an unpopulated `Card` array.](figs/cardarray.jpg)

**Figure 13.2 Memory diagram of an unpopulated `Card` array.**


Although we call it an “array of cards”, the array contains *references* to cards; it does not contain the `Card` objects themselves.
The references are initialized to `null`.
You can access the elements of the array in the usual way:

```code
if (cards[0] == null) {
    System.out.println("No card yet!");
}
```


If you try to access the instance variables of non-existent `Card` objects, you will get a `NullPointerException`.

```code
System.out.println(cards[0].rank);  // NullPointerException
```


That code won't work until we put cards in the array.
One way to populate the array is to write nested `for` loops:

```code
int index = 0;
for (int suit = 0; suit <= 3; suit++) {
    for (int rank = 1; rank <= 13; rank++) {
        cards[index] = new Card(rank, suit);
        index++;
    }
}
```

The outer loop iterates suits from 0 to 3.
For each suit, the inner loop iterates ranks from 1 to 13.
Since the outer loop runs 4 times, and the inner loop runs 13 times for each suit, the body is executed 52 times.


We use a separate variable `index` to keep track of where in the array the next card should go.
Figure 13.3 shows what the array looks like after the first two cards have been created.

![Figure 13.3 Memory diagram of a `Card` array with two cards.](figs/cardarray2.jpg)

**Figure 13.3 Memory diagram of a `Card` array with two cards.**


When you work with arrays, it is convenient to have a method that displays the contents.
We have seen the pattern for traversing an array several times, so the following method should be familiar.

```code
public static void printDeck(Card[] cards) {
    for (Card card : cards) {
        System.out.println(card);
    }
}
```


Since `cards` has type `Card[]`, an element of `cards` has type `Card`.
So `println` invokes the `toString` method in the `Card` class.
This method is similar to invoking `System.out.println(Arrays.toString(cards))`.