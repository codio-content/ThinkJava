The goal of this exercise is to program a “Guess My Number” game. When it's finished, it will work like this:

```code
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
```

To choose a random number, you can use the `Random` class in `java.util`. Check out the `GuessStarter` code in the left panel to see how it works.

Like the `Scanner` class we saw in this chapter, `Random` has to be imported before we can use it. And as we saw with `Scanner`, we have to use the `new` operator to create a `Random` (number generator).

Then we can use the method `nextInt` to generate a random number. In this example, the result of `nextInt(100)` will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.



1.  Checkout the definition of `GuessStarter` in a file called `GuessStarter.java` (on the left).

1.  Compile and run this program.

    {Run! | terminal}(javac code/ch03/GuessStarter.java && java -cp code/ch03 GuessStarter)

1.  Modify the program to prompt the user, then use a `Scanner` to read a line of user input.
    Compile and test the program.

1.  Read the user input as an integer and display the result.
    Again, compile and test.

1.  Compute and display the difference between the user's guess and the number that was generated.
