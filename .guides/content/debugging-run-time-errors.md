###  Run-time errors


It's not always clear what causes a run-time error, but you can often figure things out by adding print statements to your program.


####  My program hangs.



If a program stops and seems to be doing nothing, we say it is “hanging”.
Often that means it is caught in an infinite loop or an infinite recursion.



*  If there is a particular loop that you suspect is the problem, add a print statement immediately before the loop that says “entering the loop” and another immediately after that says “exiting the loop”.

Run the program.
If you get the first message and not the second, you know where the program is getting stuck.
Go to the section titled “Infinite loop”.


*  Most of the time an infinite recursion will cause the program to run for a while and then produce a `StackOverflowError`.
If that happens, go to the section titled “Infinite recursion”.

If you are not getting a `StackOverflowError`, but you suspect there is a problem with a recursive method, you can still use the techniques in the infinite recursion section.

*  If neither of the previous suggestions helps, you might not understand the flow of execution in your program.
Go to the section titled “Flow of execution”.



\subsubsection*{Infinite loop}

If you think you have an infinite loop and you know which loop it is, add a print statement at the end of the loop that displays the values of the variables in the condition, and the value of the condition.

For example:

```code
while (x > 0 && y < 0) {
    // do something to x
    // do something to y

    System.out.println("x: " + x);
    System.out.println("y: " + y);
    System.out.println("condition: " + (x > 0 && y < 0));
}
```

Now when you run the program you see three lines of output for each time through the loop.
The last time through the loop, the condition should be `false`.
If the loop keeps going, you will see the values of `x` and `y`, and you might figure out why they are not getting updated correctly.


\subsubsection*{Infinite recursion}


Most of the time, an infinite recursion will cause the program to throw a `StackOverflowError`.
But if the program is slow, it may take a long time to fill the stack.

If you know which method is causing an infinite recursion, check that there is a base case.
There should be some condition that makes the method return without making a recursive invocation.
If not, you need to rethink the algorithm and identify a base case.

If there is a base case, but the program doesn't seem to be reaching it, add a print statement at the beginning of the method that displays the parameters.
Now when you run the program you see a few lines of output every time the method is invoked, and you can see the values of the parameters.
If the parameters are not moving toward the base case, you might see why not.


\subsubsection*{Flow of execution}


If you are not sure how the flow of execution is moving through your program, add print statements to the beginning of each method with a message like “entering method foo”, where `foo` is the name of the method.
Now when you run the program, it displays a trace of each method as it is invoked.

You can also display the arguments each method receives.
When you run the program, check whether the values are reasonable, and check for one of the most common errors -- providing arguments in the wrong order.


####  When I run the program I get an exception.



When an exception occurs, Java displays a message that includes the name of the exception, the line of the program where the exception occurred, and a “stack trace”.
The stack trace includes the method that was running, the method that invoked it, the method that invoked that one, and so on.

The first step is to examine the place in the program where the error occurred and see if you can figure out what happened.



**NullPointerException**

You tried to access an instance variable or invoke a method on an object that is currently `null`.

You should figure out which variable is `null` and then figure out how it got to be that way.



Remember that when you declare a variable with an array type, its elements are initially `null` until you assign a value to them.

For example, this code causes a `NullPointerException`:



```code

int[] array = new Point[5];

System.out.println(array[0].x);

```



**ArrayIndexOutOfBoundsException**

The index you are using to access an array is either negative or greater than `array.length - 1`.

If you can find the site where the problem is, add a print statement immediately before it to display the value of the index and the length of the array.

Is the array the right size?

Is the index the right value?



Now work your way backwards through the program and see where the array and the index come from.

Find the nearest assignment statement and see if it is doing the right thing.

If either one is a parameter, go to the place where the method is invoked and see where the values are coming from.



**StackOverflowError**

See “Infinite recursion” on page in section **Run-time errors**.



**FileNotFoundException**

This means Java didn't find the file it was looking for.

If you are using a project-based development environment like Eclipse, you might have to import the file into the project.

Otherwise make sure the file exists and that the path is correct.

This problem depends on your file system, so it can be hard to track down.



**ArithmeticException**

Something went wrong during an arithmetic operation; for example, division by zero.




####  I added so many print statements I get inundated with output.



One of the problems with using print statements for debugging is that you can end up buried in output.
There are two ways to proceed: either simplify the output, or simplify the program.

To simplify the output, you can remove or comment out print statements that aren't helping, or combine them, or format the output so it is easier to understand.
As you develop a program, you should write code to generate concise, informative traces of what the program is doing.

To simplify the program, scale down the problem the program is working on.
For example, if you are sorting an array, sort a *small* array.
If the program takes input from the user, give it the simplest input that causes the error.


Also, clean up the code.
Remove unnecessary or experimental parts, and reorganize the program to make it easier to read.
For example, if you suspect that the error is in a deeply-nested part of the program, rewrite that part with a simpler structure.
If you suspect a large method, split it into smaller methods and test them separately.

The process of finding the minimal test case often leads you to the bug.
For example, if you find that a program works when the array has an even number of elements, but not when it has an odd number, that gives you a clue about what is going on.

Reorganizing the program can help you find subtle bugs.
If you make a change that you think doesn't affect the program, and it does, that can tip you off.