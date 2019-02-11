###  Testing with JUnit



When beginners start writing methods, they usually test them by invoking them from `main` and checking the results by hand.
Writing code like this can get repetitive, but there are tools to make it easier.
For cases where we know the right answer, we can do better by writing **unit tests**.

For example, to test `fibonacci` from Section 9.4, we could write:

```code
public static void main(String[] args) {
    if (fibonacci(1) != 1) {
        System.err.println("fibonacci(1) is incorrect");
    }
    if (fibonacci(2) != 1) {
        System.err.println("fibonacci(2) is incorrect");
    }
    if (fibonacci(3) != 2) {
        System.err.println("fibonacci(3) is incorrect");
    }
}
```

This test code is self-explanatory, but it's longer than it needs to be and it doesn't scale very well.
In addition, the error messages provide limited information.
Using a unit test framework addresses these and other issues.

JUnit is a common testing tool for Java programs (see [http://junit.org/](http://junit.org/)).
To use it, you have to create a test class that contains test methods.
If the name of your class is `Class`, the name of the test class is `ClassTest`.
And if there is a method in `Class` named `method`, there should be a method in `TestClass` named `testMethod`.

For example, suppose that the `fibonacci` method belongs to a class named `Series`.
Here is the corresponding JUnit test class and test method:

```code
import junit.framework.TestCase;

public class SeriesTest extends TestCase {

    public void testFibonacci() {
        assertEquals(1, Series.fibonacci(1));
        assertEquals(1, Series.fibonacci(2));
        assertEquals(2, Series.fibonacci(3));
    }
}
```

This example uses the keyword `extends`, which indicates that the new class, `SeriesTest` is based on an existing class, `TestCase`.
The `TestCase` class is imported from the package `junit.framework`.

Many development environments can generate test classes and test methods automatically.
In DrJava, you can select **New JUnit Test Case** from the **File** menu to generate an empty test class.

`assertEquals` is provided by the `TestCase` class.
It takes two arguments and checks whether they are equal.
If so, it does nothing; otherwise it displays a detailed error message.
The first argument is the “expected value”, which we consider correct, and the second argument is the “actual value” we want to check.
If they are not equal, the test fails.


Using `assertEquals` is more concise than writing your own `if` statements and `System.err` messages.
JUnit provides additional assert methods, such as `assertNull`, `assertSame`, and `assertTrue`, that can be used to design a variety of tests.

To run JUnit directly from DrJava, click the **Test** button on the toolbar.
If all your test methods pass, you will see a green bar in the lower-right corner.
Otherwise, DrJava will take you directly to the first assertion that failed.