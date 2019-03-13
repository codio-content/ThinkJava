**Exercise 5.1:**

Answer the following questions without running the program on a computer.



1.  Draw a stack diagram that shows the state of the program the first time `ping` is invoked.

1.  What is output by the following program?
Be precise about where there are spaces and where there are newlines.


```code
public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}
```

```code
public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}
```

```code
public static void baffle() {
    System.out.print("wug");
    ping();
}
```

```code
public static void ping() {
    System.out.println(".");
}
```