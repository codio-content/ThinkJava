###  The indexOf method



To search for a specific character in a string, you could write a `for` loop and use `charAt` like in the previous section.
However, the `String` class already provides a method for doing just that.

```code
String fruit = "banana";
int index = fruit.indexOf('a');     // returns 1
```

This example finds the index of `'a'` in the string.
But the letter appears three times, so it's not obvious what `indexOf` should do.
According to the documentation, it returns the index of the *first* appearance.

To find subsequent appearances, you can use another version of `indexOf`, which takes a second argument that indicates where in the string to start looking.

```code
int index = fruit.indexOf('a', 2);  // returns 3
```

To visualize how `indexOf` and other `String` methods work, it helps to draw a picture like Figure **7.3**.
The previous code starts at index 2 (the first `'n'`) and finds the next `'a'`, which is at index 3.


![Figure 7.3 Memory diagram for a `String` of six characters.](figs/banana.jpg)

**Figure 7.3 Memory diagram for a `String` of six characters.**


If the character happens to appear at the starting index, the starting index is the answer.
So `fruit.indexOf('a', 5)` returns `5`.
If the character does not appear in the string, `indexOf` returns `-1`.
Since indexes cannot be negative, this value indicates the character was not found.

You can also use `indexOf` to search for an entire string, not just a single character.
For example, the expression `fruit.indexOf("nan")` returns `2`.