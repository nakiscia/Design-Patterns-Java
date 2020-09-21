## Prototype Pattern

#### Use the Prototype Pattern when creating an instance of a given class is either expensive or complicated.

The Prototype pattern is used when the type of object to 
create is determined by a prototypical instance, which is cloned to produce a new instance.
Oftentimes, the prototype pattern is used to get a unique instance to get a unique instance of same object.
In prototype pattern, we can do copy process in two different ways. First one is shallow copy which copy all the refenrece objects directly, second is deep copy which create new instances  of referenced object and then copy required parameters to instantiate that object. The shallow copy is a bit dangerous because reference object changes reflect in both original and clone objects.

### Concepts

- Avoids costly creation
- Avoids subclassing
- Typically doesnt use 'new' keyword
- Often utilizes an Interface
- Usually implemented wit a Registery

Example : java.lang.Object#clone()

Everyday Example : Since prototype is often used when a creating new instance is a costly thing. 
Instead of creating new instace we just clone it and it is still a unique object. For example creating a Database connection
is a bit costly. Because of that the prototype pattern can be used for that case.


 ### Benefits
 - Hides the complexities of making new instances from the client
 - Provides the option for the client to generate objects whose type is not know
 - In some circumstances copying an object can be more efficient than creating new one.
 
 ### Drawbacks
 - Prototype should be considered when a system must create new objects of many types in a complex class hierarchy.
 - Making a copy of an object can sometimes be complicated.
