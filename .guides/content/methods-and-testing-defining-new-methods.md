###  Defining new methods




Some methods perform a computation and return a result.
For example, `Math.sqrt(25)` returns the value `5.0`.
Other methods (including `main`) carry out a sequence of actions, without returning a result.
Java uses the keyword `void` to define such methods.
Here's a simple example:


```code
public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        newLine();
        System.out.println("Second line.");
    }
}
```


The name of the class is `NewLine`.
By convention, class names begin with a capital letter.
`NewLine` contains two methods, `newLine` and `main`.
Remember that Java is case-sensitive, so `NewLine` and `newLine` are not the same.


Method names should begin with a lowercase letter and use “camel case”, which is a cute name for `jammingWordsTogetherLikeThis`.
You can use any name you want for methods, except `main` or any of the Java keywords.


`newLine` and `main` are `public`, which means they can be **invoked** (or called) from other classes.
And they are both `void`, which means that they don't return a result (unlike the `Math` methods, for example).

The output of this program is:

```code
First line.

Second line.
```

Notice the extra space between the lines.
If we wanted more space between them, we could invoke the same method repeatedly.
Or we could write yet another method (named `threeLine`) that displays three blank lines.

In the following program, `main` invokes `threeLine`, and `threeLine` invokes `newLine` three times.
Because `newLine` is in the same class as `threeLine`, we don't have to specify the class name like `NewLine.newLine()`.

```code
public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
    }
}
```