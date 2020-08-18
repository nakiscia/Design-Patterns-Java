##Builder Pattern

####Use the Builder Pattern to encapsulate the construction of a product and allow it to be constructed in steps.


The builder pattern is solve one of the common problem in OOP design which is what constructor to use. It provide flexibility over telescoping constructors.
It calls appropriate constructor and negates the needs for exposed setters.

- Handles complex constructors.
- Large number of parameters
- Help to force immutability of an object.
- StringBuilder, DocumentBuilder are the good example of that pattern.

#### Builder vs Prototype ####
- Builder pattern handles complex constructor, Prototype implemented around a clone and it avoids calling complex constructors. 
- Builder can work with legacy code, can be a seperate class. In Prototype, it is difficult to implement in legacy code.

### Benefits
- Encapsulates the way a complex object is constructed.
- Allows objects to be constructed in a multistep and varying process.
- Hides the internal representation of the product from client.
- Product implementations can be swapped in and out because the client only sees an abstract interface.

### Drawbacks
- Often used for building composite structures.
- Constructing objects requires more domain knowledge of the client than when using Factory.
