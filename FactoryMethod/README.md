## Factory Method Pattern

Factory Method Pattern is opposite of the Singleton pattern. It basicly depends on a simple static function that take a String or Enum for a parameter and return a instance according to that parameter. 
The interface or abstract class should be there for client. For syntax it's looks a lot like Singleton.

- It is parameter driven and it solves complex creation.
- Does not expose instantiation logic.
- Defer to subclasses.
- All the clients knows about common interface that factory exposes.
- Specified by architecture, implemented by user.

Pitfalls of the Factory Method Pattern is complexity compare to other creational patterns.

#### Singleton vs Factory
While Singleton return same instance Factory returns various instances.
In Singleton there is no interface and subclasses but Factory Method Pattern is interface driven pattern and there are subclasses. In this pattern, adaptable to environment more easily.
