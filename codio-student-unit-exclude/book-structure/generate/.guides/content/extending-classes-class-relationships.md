###  Class relationships



This chapter demonstrates two common relationships between classes:



**composition**

Instances of one class contain references to instances of another class.

For example, an instance of `Eights` contains references to two `Player` objects, two `Hand` objects, and a `Scanner`.



**inheritance**

One class extends another class.

For example, `Hand` extends `CardCollection`, so every instance of `Hand` is also a `CardCollection`.




Composition is also known as a **HAS-A** relationship, as in “`Eights` HAS-A `Scanner`”.
Inheritance is also known as an **IS-A** relationship, as in “a `Hand` IS-A `CardCollection`”.
This vocabulary provides a concise way to talk about an object-oriented design.



There is also a standard way to represent these relationships graphically in UML class diagrams.
As we saw in Section **11.7**, the UML representation of a class is a box with three sections: the class name, the attributes, and the methods.
The latter two sections are optional when showing relationships.


Relationships between classes are represented by arrows: composition arrows have a standard arrow head, and inheritance arrows have a hollow triangle head (usually pointing up).
Figure **15.1** shows the classes defined in this chapter and the relationships among them.


![Figure 15.1 UML diagram for the classes in this chapter.](figs/uml1.jpg)

**Figure 15.1 UML diagram for the classes in this chapter.**

UML is an international standard, so almost any software engineer in the world could look at this diagram and understand our design.
And class diagrams are only one of many graphical representations defined in the UML standard.

We hope this final chapter has been a useful summary of all the techniques presented in the book, including variables, methods, conditionals, loops, arrays, objects, and algorithms.
Congratulations on making it to the end!