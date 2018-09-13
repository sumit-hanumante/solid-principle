                code without using open/closed principle

As you see in Rectangle.java file , we’ve got a Rectangle class with attributes width and height.
Same as Rectangle Class we also have one Circle class with attribute radius.
To calculate area of circle and rectangle we have another class which is AreaCalculator

                #Problem with this kind od design

Lets say now we want to calculate area of triangles next. In that case we will again end up modifying AreaCalculator class.
As the types of shapes grows this becomes messier as AreaCalculator keeps on changing and any consumers of this class will
have to keep on updating their libraries which contain AreaCalculator.
As a result, AreaCalculator class will not be finalized with surety as every time a new shape comes it will be modified.
So, this design is not closed for modification.

Also, note that this design is not extensible, i.e what if complicated shapes keep coming,
AreaCalculator will need to keep on adding their computation logic in newer methods.
We are not really expanding the scope of shapes;
rather we are simply doing piece-meal(bit-by-bit) solution for every shape that is added.

