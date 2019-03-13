In this chapter, we will present a comprehensive example of object-oriented programming. *Crazy Eights* is a classic card game for two or more players. The main objective is to be the first player to get rid of all your cards. Here's how to play:



*  Deal five or more cards to each player, and then deal one card face up to create the “discard pile”.
Place the remaining cards face down to create the “draw pile”.

*  Each player takes turns placing a single card on the discard pile.
The card must match the rank or suit of the previously played card, or be an eight, which is a “wild card”.

*  When players don't have a matching card or an eight, they must draw new cards until they get one.

*  If the draw pile ever runs out, the discard pile is shuffled (except the top card) and becomes the new draw pile.

*  As soon as a player has no cards, the game ends and all other players score penalty points for their remaining cards.
Eights are worth 20, face cards are worth 10, and all others are worth their rank.


You can read [https://en.wikipedia.org/wiki/Crazy_Eights](https://en.wikipedia.org/wiki/Crazy_Eights) for more details, but we have enough to get started.