Suppose you are going to a movie that starts at 18:50 (or 6:50 PM), and the running time is 2 hours 16 minutes. What time does the movie end?

We'll use `Time` objects to figure it out.

```code
Time startTime = new Time(18, 50, 0.0);
Time runningTime = new Time(2, 16, 0.0);
```


Here are two ways we could “add” the `Time` objects:



*  We could write a static method that takes two `Time` objects as parameters (not object-oriented).
*  We could write an instance method that gets invoked on one object and takes the other as a parameter.


To demonstrate the difference, we'll do both. Here is a simple version that uses the static approach:


```code
public static Time add(Time t1, Time t2) {
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    return sum;
}
```

And here's how we would invoke the static method:

```code
Time endTime = Time.add(startTime, runningTime);
```

{Run!}(sh .guides/bg.sh javac code/Time.java java -cp code/ Time )


On the other hand, here's what it looks like as an instance method:


```code
public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    return sum;
}
```

The changes are:



*  We removed the keyword `static`.
*  We removed the first parameter.
*  We replaced `t1` with `this`.



And here's how we would invoke the instance method:

```code
Time endTime = startTime.add(runningTime);
```

{Run!}(sh .guides/bg.sh javac code/Time.java java -cp code/ Time 2 )


That's all there is to it. Static methods and instance methods do the same thing, and you can convert from one to the other with just a few changes.

There's only one problem: the addition code itself is not correct. For this example, it returns `20:66`, which is not a valid time. If `second` exceeds 59, we have to “carry” into the minutes column, and if `minute` exceeds 59, we have to carry into `hour`. Here is a better version of `add`:

```code
public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    if (sum.second >= 60.0) {
        sum.second -= 60.0;
        sum.minute += 1;
    }
    if (sum.minute >= 60) {
        sum.minute -= 60;
        sum.hour += 1;
    }
    return sum;
}
```

{Run!}(sh .guides/bg.sh javac code/Time.java java -cp code/ Time 3 )


It's still possible that `hour` may exceed 23, but there's no `days` attribute to carry into. In that case, `sum.hour -= 24` would yield the correct result.