#Builder Pattern

The builder pattern is solve one of the common problem in OOP design which is what constructor to use. It provide flexibility over telescoping constructors.
It calls appropriate constructor and negates the needs for exposed setters.

- Handles complex constructors.
- Large number of parameters
- Help to force immutability of an object.
- StringBuilder, DocumentBuilder are the good example of that pattern.

### Builder vs Prototype ###
- Builder pattern handles complex constructor, Prototype implemented around a clone and it avoids calling complex constructors. 
- Builder can work with legacy code, can be a seperate class. In Prototype, it is difficult to implement in legacy code.


