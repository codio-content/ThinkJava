To summarize what we've learned so far, `Point` and `Rectangle` objects each have their own attributes and methods. Attributes are an object's *data*, and methods are an object's *code*. An object's *class* defines which attributes and methods it will have.


In practice, it's more convenient to look at high-level pictures than to examine the details of source code. **Unified Modeling Language** (UML) defines a standard way to summarize the design of a class.

![Figure 10.7 UML class diagrams for `Point` and `Rectangle`.](figs/point-rect.jpg)

**Figure 10.7 UML class diagrams for `Point` and `Rectangle`.**


As shown in Figure 10.7, a **class diagram** is divided into two sections. The top half lists the attributes, and the bottom half lists the methods.


UML uses a language-independent format, so rather than showing `int x`, the diagram uses `x: int`. The plus sign (`+`) means that the attributes and methods are `public`. We'll get to `private` attributes (`-`) in the next chapter.

In contrast to memory diagrams, which visualize objects (and variables) at run-time, a class diagram visualizes the source code at compile-time.

Both `Point` and `Rectangle` have additional methods; we are only showing the ones introduced in this chapter. See the documentation for these classes to learn more about what they can do.