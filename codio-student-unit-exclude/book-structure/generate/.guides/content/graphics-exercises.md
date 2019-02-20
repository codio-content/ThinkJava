The code for this chapter is in the `appc` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 18.1:**

Draw the flag of Japan: a red circle on a white background that is wider than it is tall.




**Exercise 18.2:**

Modify `Mickey.java` to draw ears on the ears, and ears on those ears, and more ears all the way down until the smallest ears are only 3 pixels wide.
The result should look like “Mickey Moose”, shown in Figure 0.4.
*Hint:* You should only have to add or modify a few lines of code.

![Figure 18.4 A recursive shape we call “Mickey Moose”.](figs/moose.png)

**Figure 18.4 A recursive shape we call “Mickey Moose”.**




**Exercise 18.3:**

In this exercise, you will draw “Moire&#x301; patterns” that seem to shift around as you move.
For an explanation of what is going on, see [https://en.wikipedia.org/wiki/Moire_pattern](https://en.wikipedia.org/wiki/Moire_pattern).



1.  Open `Moire.java` and read the `paint` method.
Draw a sketch of what you expect it to do.
Now run it.
Did you get what you expected?

1.  Modify the program so that the space between the circles is larger or smaller.
See what happens to the image.

1.  Modify the program so that the circles are drawn in the center of the screen and concentric, as in Figure 0.5 (left).
The distance between the circles should be small enough that the Moire&#x301; interference is apparent.

![Figure 18.5 Graphical patterns that can exhibit Moire&#x301; interference.](figs/moire.jpg)

**Figure 18.5 Graphical patterns that can exhibit Moire&#x301; interference.**

1.  Write a method named `radial` that draws a radial set of line segments as shown in Figure 0.5 (right), but they should be close enough together to create a Moire&#x301; pattern.

1.  Just about any kind of graphical pattern can generate Moire&#x301;-like interference patterns.
Play around and see what you can create.