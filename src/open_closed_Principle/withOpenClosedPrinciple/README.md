                            #Opne/Closed Principle

we saw the design problem in the calculating area which implemented without open/closed principle.

Using Open closed Principle we solved the design issue.

we have created one interface Shape to make our design extensible.
So now there is a base interface Shape. All shapes now implement the base interface Shape
Circle & Rectangle implement Shape interface.


Shape interface has an abstract method calculateArea().
Both circle & rectangle provide their own overridden implementation of calculateArea() method using their own attributes.

We have brought-in a degree of extensibility as shapes are now an instance of Shape interfaces. This allows us to use Shape instead of individual classes
wherever these classes are used by any client.


This AreaCalculator class now fully removes our design flaws noted above and gives a clean solution which adheres to the Open-Closed Principle.

The design is open for extension as more shapes can be added without modifying the existing code. We just need to create a new class for the new shape
and implement the calculateArea() method with a formula specific to that new shape.

This design is also closed for modification.