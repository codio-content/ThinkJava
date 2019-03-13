Methods can return `boolean` values, just like any other type, which is often convenient for hiding tests inside methods. For example:

```code
public static boolean isSingleDigit(int x) {
    if (x > -10 && x < 10) {
        return true;
    } else {
        return false;
    }
}
```

The name of this method is `isSingleDigit`. It is common to give `boolean` methods names that sound like yes/no questions. Since the return type is `boolean`, the return statement has to provide a boolean expression.

The code itself is straightforward, although it is longer than it needs to be. Remember that the expression `x > -10 && x < 10` has type `boolean`, so there is nothing wrong with returning it directly (without the `if` statement):

```code
public static boolean isSingleDigit(int x) {
    return x > -10 && x < 10;
}
```
Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/BooleanMethods.java java -cp code/ BooleanMethods )


In `main`, you can invoke the method in the usual ways:

```code
System.out.println(isSingleDigit(2));
boolean bigFlag = !isSingleDigit(17);
```

The first line displays `true` because 2 is a single-digit number. The second line sets `bigFlag` to `true`, because 17 is *not* a single-digit number.

Conditional statements often invoke `boolean` methods and use the result as the condition:

```code
if (isSingleDigit(z)) {
    System.out.println("z is small");
} else {
    System.out.println("z is big");
}
```
{Run!}(sh .guides/bg.sh javac code/BooleanMethods.java java -cp code/ BooleanMethods 2 )


Examples like this one almost read like English: “If is single digit z, print ... else print ...”.