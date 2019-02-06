###  Card objects



If we want to define a class to represent a playing card, it is pretty obvious what the instance variables should be: `rank` and `suit`.
It is not as obvious what types they should be.

One possibility is a `String` containing things like `"Spade"` for suits and `"Queen"` for ranks.
A problem with this design is that it would not be easy to compare cards to see which had a higher rank or suit.


An alternative is to use integers to **encode** the ranks and suits.
By encode, we don't mean to encrypt or translate into a secret code.
We mean to define a mapping between a sequence of numbers and the things we want to represent.

Here is a mapping for suits:

|Clubs|$\mapsto$|0 |
|-|-|-|
|Diamonds|$\mapsto$|1 |
|Hearts|$\mapsto$|2 |
|Spades|$\mapsto$|3|



We use the mathematical symbol $\mapsto$ to make it clear that these mappings are not part of the program.
They are part of the program design, but they never appear explicitly in the code.

Each of the numerical ranks (2 through 10) maps to the corresponding integer.
For the face cards, we can use:

|Ace|$\mapsto$|1 |
|-|-|-|
|Jack|$\mapsto$|11 |
|Queen|$\mapsto$|12 |
|King|$\mapsto$|13 |


So far, the class definition for the `Card` type looks like this:

```code
public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
```


The instance variables are `private`: we can access them from inside this class, but not from other classes.

The constructor takes a parameter for each instance variable.
To create a `Card` object, we use the `new` operator:

```code
Card threeOfClubs = new Card(3, 0);
```

The result is a reference to a `Card` that represents the “3 of Clubs”.