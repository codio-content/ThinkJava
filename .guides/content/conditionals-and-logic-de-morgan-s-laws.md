Sometimes you need to negate an expression containing a mix of relational and logical operators. For example, to test if `x` and `y` are both nonzero, you could write:

```code
if (!(x == 0 || y == 0)) {
    System.out.println("Neither x nor y is zero");
}
```


This condition is difficult to read because of the `!` and parentheses. A better way to negate logic expressions is to apply **De Morgan's laws**:



*  `!(A && B)`  is the same as  `!A || !B`
*  `!(A || B)`  is the same as  `!A && !B`


Negating a logical expression is the same as negating each term and changing the operator. The `!` operator takes precedence over `&&` and `||`, so you don't have to put parentheses around the individual terms `!A` and `!B`.

De Morgan's laws also apply to the relational operators. In this case, negating each term means using the “opposite” relational operator.



*  `!(x < 5 && y == 3)`  is the same as  `x >= 5 || y != 3`
*  `!(x >= 1 || y != 7)`  is the same as  `x < 1 && y == 7`


It may help to read these examples out loud in English. For instance, “If I don't want the case where $x$ is less than 5 and $y$ is 3, then I need $x$ to be greater than or equal to 5, or I need $y$ to be anything but 3.”

Returning to the previous example, here is the revised condition. In English, it reads “if $x$ is not zero and $y$ is not zero.” The logic is the same, and the source code is easier to read.

```code
if (x != 0 && y != 0) {
    System.out.println("Neither x nor y is zero");
}
```