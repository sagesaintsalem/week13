# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?
    Many forms. 

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.
    Using an interface, we can write an empty method in the interface and then implement that interface in classes. From there, the empty methods in the interface would be called in the classes and then the methods can be written to behave a specific way in each class. Essentially, the same method takes a different form depending on the class it is in.

3. What can we use to implement polymorphism in Java?
    Inheritance and Interfaces.

4. How many 'forms' can an object take when using polymorphism?
    As many times as it is implemented.

5. Give an example of when you could use polymorphism.
    To save time and sanity, a programmer can write an empty method in an interface to eliminate the need to essentially write the same method several times over. For example, say there are three classes - GiftShop, SnackStand, TicketBooth - and they all need a method that will purchase items. You could use polymorphism to write one empty method - e.g. buyItem() - in an interface - IBuy - and then implement it across those three classes instead of writing it over and over in each class.



# Composition and Aggregation

6. What do we mean by 'composition' in reference to object-oriented programming?
    Composition describes a "belongs-to" relationship between objects. Here, an object is comprised of other objects but they "own" the other objects. If the object is deleted, so are the objects that it is comprised of. A real world example would be a roof makes up a house but a roof doesn't exist without a house.

7. When would you use composition? Provide a simple example in Java.
    When Inheritance won't work for us.

8. Give a difference between composition and aggregation?
    With composition, the objects within an object are destroyed when the object is destroyed. With aggregation, all objects exist on their own and do not depend on other objects, thus they are not destroyed when the object that they make up is destroyed. Aggregation also describes a "has a" relationship between objects, in that an object can be comprised of other objects but all of those objects exist on their own. This is an example of loose coupling. A real world example would be that a kitchen has a kettle, a toaster and some plates: all of which still exist if and when they're moved to other rooms in the house.


9. What is/are the advantage(s) of using composition/aggregation?
    Reusable code, gets around the problem of no multiple inheritances in Java and easier testing.



10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?
    The objects are destroyed.


11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?
    Nothing, they still exist on their own.