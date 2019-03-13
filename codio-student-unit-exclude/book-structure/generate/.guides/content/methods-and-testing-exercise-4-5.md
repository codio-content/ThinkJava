**Exercise 5.1:**

Draw a stack diagram that shows the state of the program the *second* time `zoop` is invoked.
What is the complete output?

```code
public static void zoop(String fred, int bob) {
    System.out.println(fred);
    if (bob == 5) {
        ping("not ");
    } else {
        System.out.println("!");
    }
}
```

```code
public static void main(String[] args) {
    int bizz = 5;
    int buzz = 2;
    zoop("just for", bizz);
    clink(2 * buzz);
}
```

```code
public static void clink(int fork) {
    System.out.print("It's ");
    zoop("breakfast ", fork);
}
```

```code
public static void ping(String strangStrung) {
    System.out.println("any " + strangStrung + "more ");
}
```