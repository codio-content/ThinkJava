In Section 3.5, we learned how to use `System.out.printf` to display formatted output.
Sometimes programs need to create strings that are formatted a certain way, but not display them immediately, or ever.
For example, the following method returns a time string in 12-hour format:

```code
public static String timeString(int hour, int minute) {
    String ampm;
    if (hour < 12) {
        ampm = "AM";
        if (hour == 0) {
            hour = 12;  // midnight
        }
    } else {
        ampm = "PM";
        hour = hour - 12;
    }
    return String.format("%02d:%02d %s", hour, minute, ampm);
}
```


Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/StringFormat.java java -cp code/ StringFormat )


`String.format` takes the same arguments as `System.out.printf`: a format specifier followed by a sequence of values.
The main difference is that `System.out.printf` displays the result on the screen.
`String.format` creates a new string, but does not display anything.

In this example, the format specifier `%02d` means “two digit integer padded with zeros”, so `timeString(19, 5)` returns the string `"07:05 PM"`.
As an exercise, try writing two nested `for` loops (in `main`) that invoke `timeString` and display all possible times over a 24-hour period.

At some point today, skim through the documentation for `String`.
Knowing what other methods are there will help you avoid reinventing the wheel.
The easiest way to find documentation for Java classes is to do a web search for “Java” and the name of the class.