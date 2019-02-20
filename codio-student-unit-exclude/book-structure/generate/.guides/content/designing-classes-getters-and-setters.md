Recall that the instance variables of `Time` are `private`.
We can access them from within the `Time` class, but if we try to access them from another class, the compiler reports an error.


A class that uses objects defined in another class is called a **client**.
For example, here is a new class called `TimeClient`.


```code
public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        System.out.println(time.hour);      // compiler error
    }
}
```

If you try to compile this code, you will get an error message like “hour has private access in Time”.
There are three ways to solve this problem:



*  We could make the instance variables `public`.

*  We could provide methods to access the instance variables.

*  We could decide that it's not a problem, and refuse to let other classes access the instance variables.


The first choice is appealing because it's simple.
But here is the problem: when Class $A$ accesses the instance variables of Class $B$ directly, $A$ becomes dependent on $B$.
If anything in $B$ changes later, it is likely that $A$ will have to change, too.


But if $A$ only uses methods to interact with $B$, $A$ and $B$ are less dependent, which means that we can make changes in $B$ without affecting $A$ (as long as we don't change the method parameters).

So if we decide that `TimeClient` should be able to read the instance variables of `Time`, we should provide methods to do it:

```code
public int getHour() {
    return this.hour;
}

public int getMinute() {
    return this.minute;
}

public double getSecond() {
    return this.second;
}
```


Methods like these are formally called “accessors”, but more commonly referred to as **getters**.
By convention, the method that gets a variable named `something` is called `getSomething`.

If we decide that `TimeClient` should also be able to modify the instance variables of `Time`, we can provide methods to do that, too:

```code
public void setHour(int hour) {
    this.hour = hour;
}

public void setMinute(int minute) {
    this.minute = minute;
}

public void setSecond(double second) {
    this.second = second;
}
```


These methods are formally called “mutators”, but more commonly known as **setters**.
The naming convention is similar; the method that sets `something` is usually called `setSomething`.

Writing getters and setters can get boring, but many IDEs can generate them for you based on the instance variables.