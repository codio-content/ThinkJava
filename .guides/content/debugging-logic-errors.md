###  Logic errors



####  My program doesn't work.


Logic errors are hard to find because the compiler and interpreter provide no information about what is wrong.
Only you know what the program is supposed to do, and only you know that it isn't doing it.

The first step is to make a connection between the code and the behavior you get.
You need a hypothesis about what the program is actually doing.
Here are some questions to ask yourself:



*  Is there something the program was supposed to do, but doesn't seem to be happening?
Find the section of the code that performs that function, and make sure it is executing when you think it should.
See “Flow of execution” on page in section **Run-time errors**.

*  Is something happening that shouldn't?
Find code in your program that performs that function, and see if it is executing when it shouldn't.

*  Is a section of code producing an unexpected effect?
Make sure you understand the code, especially if it invokes methods in the Java library.
Read the documentation for those methods, and try them out with simple test cases.
They might not do what you think they do.


To program, you need a mental model of what your code does.
If it doesn't do what you expect, the problem might not actually be the program; it might be in your head.


The best way to correct your mental model is to break the program into components (usually the classes and methods) and test them independently.
Once you find the discrepancy between your model and reality, you can solve the problem.

Here are some common logic errors to check for:




*  Remember that integer division always rounds toward zero.
If you want fractions, use `double`.
More generally, use integers for countable things and floating-point numbers for measurable things.

*  Floating-point numbers are only approximate, so don't rely on them to be perfectly accurate.
You should probably never use the `==` operator with `double`s.
Instead of writing `if (d == 1.23)`, do something like `if (Math.abs(d - 1.23) < .000001)`.


*  When you apply the equality operator (`==`) to objects, it checks whether they are identical.
If you meant to check equivalence, you should use the `equals` method instead.

*  By default for user-defined types, `equals` checks identity.
If you want a different notion of equivalence, you have to override it.

*  Inheritance can lead to subtle logic errors, because you can run inherited code without realizing it.
See “Flow of execution” on page in section **Run-time errors**.



####  I've got a big hairy expression and it doesn't do what I expect.



Writing complex expressions is fine as long as they are readable, but they can be hard to debug.
It is often a good idea to break a complex expression into a series of assignments to temporary variables.

```code
rect.setLocation(rect.getLocation().translate(
                 -rect.getWidth(), -rect.getHeight()));
```

This example can be rewritten as:

```code
int dx = -rect.getWidth();
int dy = -rect.getHeight();
Point location = rect.getLocation();
Point newLocation = location.translate(dx, dy);
rect.setLocation(newLocation);
```

The second version is easier to read, partly because the variable names provide additional documentation.
It's also easier to debug, because you can check the types of the temporary variables and display their values.


Another problem that can occur with big expressions is that the order of operations may not be what you expect.
For example, to evaluate $\frac{x}{2 \pi}$, you might write:

```code
double y = x / 2 * Math.PI;
```

That is not correct, because multiplication and division have the same precedence, and they are evaluated from left to right.
This code computes $\frac{x}{2}\pi$.

If you are not sure of the order of operations, check the documentation, or use parentheses to make it explicit.

```code
double y = x / (2 * Math.PI);
```

This version is correct, and more readable for other people who haven't memorized the order of operations.


####  My method doesn't return what I expect.



If you have a return statement with a complex expression, you don't have a chance to display the value before returning.

```code
public Rectangle intersection(Rectangle a, Rectangle b) {
    return new Rectangle(
        Math.min(a.x, b.x), Math.min(a.y, b.y),
        Math.max(a.x + a.width, b.x + b.width)
            - Math.min(a.x, b.x)
        Math.max(a.y + a.height, b.y + b.height)
            - Math.min(a.y, b.y));
}
```

Instead of writing everything in one statement, use temporary variables:

```code
public Rectangle intersection(Rectangle a, Rectangle b) {
    int x1 = Math.min(a.x, b.x);
    int y1 = Math.min(a.y, b.y);
    int x2 = Math.max(a.x + a.width, b.x + b.width);
    int y2 = Math.max(a.y + a.height, b.y + b.height);
    Rectangle rect = new Rectangle(x1, y1, x2 - x1, y2 - y1);
    return rect;
}
```

Now you have the opportunity to display any of the intermediate variables before returning.
And by reusing `x1` and `y1`, you made the code smaller, too.


####  My print statement isn't doing anything.



If you use the `println` method, the output is displayed immediately, but if you use `print` (at least in some environments), the output gets stored without being displayed until the next newline.
If the program terminates without displaying a newline, you may never see the stored output.
If you suspect that this is happening, change some or all of the `print` statements to `println`.


####  I'm really, really stuck and I need help.


First, get away from the computer for a few minutes.
Computers emit waves that affect the brain, causing the following symptoms:



*  Frustration and rage.

*  Superstitious beliefs (“the computer hates me”) and magical thinking (“the program only works when I wear my hat backwards”).

*  Sour grapes (“this program is lame anyway”).


If you suffer from any of these symptoms, get up and go for a walk.
When you are calm, think about the program.
What is it doing?
What are possible causes of that behavior?
When was the last time you had a working program, and what did you do next?

Sometimes it just takes time to find a bug.
People often find bugs when they let their mind wander.
Good places to find bugs are buses, showers, and bed.


####  No, I really need help.


It happens.
Even the best programmers get stuck.
Sometimes you need another pair of eyes.

Before you bring someone else in, make sure you have tried the techniques described in this appendix.

Your program should be as simple as possible, and you should be working on the smallest input that causes the error.
You should have print statements in the appropriate places (and the output they produce should be comprehensible).
You should understand the problem well enough to describe it concisely.

When you bring someone in to help, give them the information they need:



*  What kind of bug is it?
Compile-time, run-time, or logic?

*  What was the last thing you did before this error occurred?
What were the last lines of code that you wrote, or what is the test case that fails?

*  If the bug occurs at compile time or run time, what is the error message, and what part of the program does it indicate?

*  What have you tried, and what have you learned?


By the time you explain the problem to someone, you might see the answer.
This phenomenon is so common that some people recommend a debugging technique called “rubber ducking”.
Here's how it works:




1.  Buy a standard-issue rubber duck.

1.  When you are really stuck on a problem, put the rubber duck on the desk in front of you and say, “Rubber duck, I am stuck on a problem.
Here's what's happening...”

1.  Explain the problem to the rubber duck.

1.  Discover the solution.

1.  Thank the rubber duck.


We're not kidding, it works!
See [https://en.wikipedia.org/wiki/Rubber_duck_debugging](https://en.wikipedia.org/wiki/Rubber_duck_debugging).


####  I found the bug!


When you find the bug, it is usually obvious how to fix it.
But not always.
Sometimes what seems to be a bug is really an indication that you don't understand the program, or there is an error in your algorithm.
In these cases, you might have to rethink the algorithm, or adjust your mental model.
Take some time away from the computer to think, work through test cases by hand, or draw diagrams to represent the computation.

After you fix the bug, don't just start in making new errors.
Take a minute to think about what kind of bug it was, why you made the error, how the error manifested itself, and what you could have done to find it faster.
Next time you see something similar, you will be able to find the bug more quickly.
Or even better, you will learn to avoid that type of bug for good.