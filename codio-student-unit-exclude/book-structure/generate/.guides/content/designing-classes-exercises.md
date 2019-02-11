###  Exercises


The code for this chapter is in the `ch11` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 12.1:**

Review the documentation of `java.awt.Rectangle`.
Which methods are pure?
Which are modifiers?

If you review the documentation of `java.lang.String`, you should see that there are no modifiers, because strings are immutable.




**Exercise 12.2:**

The implementation of `increment` in this chapter is not very efficient.
Can you rewrite it so it doesn't use any loops?

*Hint:* Remember the remainder operator. And yes, it works with `double`s too.




**Exercise 12.3:**

In the board game Scrabble, each tile contains a letter, which is used to spell words in rows and columns, and a score, which is used to determine the value of words.



1.  Write a definition for a class named `Tile` that represents Scrabble tiles.
The instance variables should include a character named `letter` and an integer named `value`.

1.  Write a constructor that takes parameters named `letter` and `value` and initializes the instance variables.

1.  Write a method named `printTile` that takes a `Tile` object as a parameter and displays the instance variables in a reader-friendly format.

1.  Write a method named `testTile` that creates a `Tile` object with the letter `Z` and the value `10`, and then uses `printTile` to display the state of the object.

1.  Implement the `toString` and `equals` methods for a `Tile`.

1.  Create getters and setters for each of the attributes.


The point of this exercise is to practice the mechanical part of creating a new class definition.



**Exercise 12.4:**

Write a class definition for `Date`, an object type that contains three integers: `year`, `month`, and `day`.
This class should provide two constructors.
The first should take no parameters and initialize a default date.
The second should take parameters named `year`, `month` and `day`, and use them to initialize the instance variables.

Write a `main` method that creates a new `Date` object named `birthday`.
The new object should contain your birth date.
You can use either constructor.




**Exercise 12.5:**


A rational number is a number that can be represented as the ratio of two integers.
For example, $2/3$ is a rational number, and you can think of 7 as a rational number with an implicit 1 in the denominator.



1.  Define a class called `Rational`.
A `Rational` object should have two integer instance variables that store the numerator and denominator.

1.  Write a constructor that takes no arguments and that sets the numerator to 0 and denominator to 1.

1.  Write an instance method called `printRational` that displays a `Rational` in some reasonable format.

1.  Write a `main` method that creates a new object with type `Rational`, sets its instance variables to some values, and displays the object.

1.  At this stage, you have a minimal testable program.
Test it and, if necessary, debug it.

1.  Write a `toString` method for `Rational` and test it using `println`.

1.  Write a second constructor that takes two arguments and uses them to initialize the instance variables.

1.  Write an instance method called `negate` that reverses the sign of a rational number.
This method should be a modifier, so it should be void.
Add lines to `main` to test the new method.

1.  Write an instance method called `invert` that inverts the number by swapping the numerator and denominator.
It should be a modifier.
Add lines to `main` to test the new method.

1.  Write an instance method called `toDouble` that converts the rational number to a `double` (floating-point number) and returns the result.
This method is a pure method; it does not modify the object.
As always, test the new method.

1.  Write an instance method named `reduce` that reduces a rational number to its lowest terms by finding the greatest common divisor (GCD) of the numerator and denominator and dividing through.
This method should be a pure method; it should not modify the instance variables of the object on which it is invoked.

*Hint:* Finding the GCD only takes a few lines of code.
Search the web for “Euclidean algorithm”.

1.  Write an instance method called `add` that takes a `Rational` number as an argument, adds it to `this`, and returns a new `Rational` object.

There are several ways to add fractions.
You can use any one you want, but you should make sure that the result of the operation is reduced so that the numerator and denominator have no common divisor (other than 1).


The purpose of this exercise is to write a class definition that includes a variety of methods, including constructors, static methods, instance methods, modifiers, and pure methods.