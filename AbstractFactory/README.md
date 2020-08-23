## Abstract Factory Pattern

Abstract Factory Pattern is very similar to Factory Method Pattern. It is simply factory of factories.
In the design, there is a AbstractFactory interface, a concrete factory class which has some factory methods and lastly
a concreate product class which exteds concrete factory. The main goal in this pattern is to group factories together. 
The key distinction is that it uses composition which Factory Method pattern not use. The Abstract class in the pattern help us to decide which Factory we will use.. 



- It's Factory of Factories.
- Common Interface
- Factory of related objects
- DocumentBuilder is a example of Factory Pattern in Java
- It is used in many frameworks

#### Pitfalls

- Complexity
