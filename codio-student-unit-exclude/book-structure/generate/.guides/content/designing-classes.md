Whenever you create a new class, you are creating a new object type with the same name.
So way back in Section 0.3, when we had the class `Hello`, we also had an object type named `Hello`.
We didn't declare any variables with type `Hello`, and we didn't use `new` to create a `Hello` object.
It wouldn't have done much good if we had -- but we could have!

In this chapter, you will learn to design classes that represent *useful* objects.
Think of a class like a blueprint for a house: you can use the same blueprint to build any number of houses.

Beginners often confuse the difference between classes and objects.
Here are the main ideas:



*  A **class** definition is a template for objects: it specifies what attributes the objects have and what methods can operate on them.


*  Every object belongs to some object type; that is, it is an **instance** of some class.


*  The `new` operator **instantiates** objects, that is, it creates new instances of a class.

*  The design of a class (what methods it has) determines whether the objects are mutable or immutable.