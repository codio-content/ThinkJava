Sometimes it is convenient to write multiple `return` statements, for example, one in each branch of a conditional:

```code
public static double absoluteValue(double x) {
    if (x < 0) {
        return -x;
    } else {
        return x;
    }
}
```

Since these `return` statements are in a conditional statement, only one will be executed. As soon as either of them executes, the method terminates without executing any more statements.


Code that appears after a `return` statement (in the same block), or any place else where it can never be executed, is called **dead code**. The compiler will give you an “unreachable statement” error if part of your code is dead. For example, this method contains two lines of dead code:

```code
public static double absoluteValue(double x) {
    if (x < 0) {
        return -x;
        System.out.println("This line is dead.");  // error
    } else {
        return x;
    }
    System.out.println("So is this one.");  // error
}
```

If you put `return` statements inside a conditional statement, you have to make sure that *every possible path* through the method reaches a `return` statement. The compiler will let you know if that's not the case. For example, the following method is incomplete:

```code
public static double absoluteValue(double x) {
    if (x < 0) {
        return -x;
    } else if (x > 0) {
        return x;
    }
    // error: missing return statement
}
```

When `x` is 0, neither condition is true, so the method ends without hitting a return statement. The error message in this case might be something like “missing return statement”, which is confusing since there are already two.

Compiler errors like “unreachable statement” and “missing return statement” often indicate a problem with your algorithm, not the code. In the previous example, `if (x > 0)` is unnecessary because `x` will always be positive or zero at that point. Changing that `else if` to an `else` resolves the error.




**dead code**

Part of a program that can never be executed, often because it appears after a `return` statement.