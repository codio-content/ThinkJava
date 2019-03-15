Answer the following questions without running the program on a computer.

Draw a stack diagram that shows the state of the program the first time `ping` is invoked.

```code
public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}

public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}

public static void baffle() {
    System.out.print("wug");
    ping();
}

public static void ping() {
    System.out.println(".");
}
```

{Check It!|assessment}(fill-in-the-blanks-1395462419)
