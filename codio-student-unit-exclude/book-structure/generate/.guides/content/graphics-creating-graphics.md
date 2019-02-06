###  Creating graphics



There are several ways to create graphics in Java; the simplest way is to use `java.awt.Canvas` and `java.awt.Graphics`.
A `Canvas` is a blank rectangular area of the screen onto which the application can draw.
The `Graphics` class provides basic drawing methods such as `drawLine`, `drawRect`, and `drawString`.

Here is an example program that draws a circle using the `fillOval` method:

```code
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {
```

```code
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }
}
```

The `Drawing` class extends `Canvas`, so it has all the methods provided by `Canvas`, including `setSize`.
You can read about the other methods in the documentation, which you can find by doing a web search for “Java Canvas”.


In the `main` method, we:



1.  Create a `JFrame` object, which is the window that will contain the canvas.

1.  Create a `Drawing` object (which is the canvas), set its width and height, and add it to the frame.

1.  Pack the frame (resize it) to fit the canvas, and display it on the screen.



Once the frame is visible, the `paint` method is called whenever the canvas needs to be drawn; for example, when the window is moved or resized.
The application doesn't end after the `main` method returns; instead, it waits for the `JFrame` to close.
If you run this code, you should see a black circle on a gray background.