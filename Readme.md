# Design Principles

####    SOLID

**S - Single Responsibility Principle**
    
“One class should have one and only one responsibility”

**O - Open Closed Principle**

“Software components should be open for extension, but closed for modification”

**L - Liskov’s Substitution Principle**

“Derived types must be completely substitutable for their base types”

**I - Interface Segregation Principle**

Make fine grained interfaces that are client specific.

Don't create fatty interface, Implementation classes require to implement unnecessary methods
 
**D - Dependency Inversion Principle**

Dependency Inversion principle states that:
1.	High-level modules should not depend on low-level modules. Both should depend on abstractions.
2.	Abstractions should not depend on details. Details should depend on abstractions.

## Few More Design Principles

**1. DRY (Don't Repeat Yourself)**

Avoid code duplication

**2. Encapsulate what changes**

Hides implementation details, It will help in maintenance

**3.  Favor Composition over Inheritance**

Code re-usability without cost of inflexibility

**4. Code to Interface**

Helps in maintenance, improve flexibility

**5. Delegation Principle**

Do not do all the stuffs by yourself, delegate it.

**6. KISS (Keep It Simple, Stupid)**

# Design Patterns

### Resources

- [Design patterns explained too simply](https://github.com/kamranahmedse/design-patterns-for-humans)
- [Examples of design patterns in Java libraries](http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries/2707195#2707195)


Types of Design Patterns
1. Creational Patterns - Deals with the process of creation of objects of a class.
2. Structural Patterns - deals with objects and arrangement of objects (IS A, HAS A)
3. Behavioral Patterns - concerned with communication between objects.


4. J2EE Patterns - specifically concerned with the presentation tier



### 1. Creational: 

1. Singleton - Single instance of class. Either Eager (static) or Lazy. Eg: Logger, Configurer
2. Builder - Way to construct complex objects ( immutable )Eg: StringBuilder, PizzaMaker
3. Prototype - Wrapper of clone method, Copying costly-creation objects.
4. Factory - Create types of instances. Eg: Trade type (Bonds, Bill, Notes)
5. Abstract Factory - Factory of factories of related products. Eg: Trade Type (GermanBond, EuroBond, GermanBill, EuroBill)
6. Object pool - Re-use instances. Eg: Threadpool, objectpool

### 2. Structural: 

6.	Adapter - Adapting to a non-direct-compatible class/module/system
7.	Facade - Hiding complexity behind simple interfaces. Eg: Turbo Tax
8.	Decorator -  Attaches additional functionality(enrichment) to objects at runtime. Eg: synchronizedXxx(), unmodifiableXxx()
9.	Proxy - Eg: Hibernate proxy for lazy fetch. @Spy instances for JUnit/Mockito.
10.	Flyweight - Store common characteristics of multiple objects at single place. Eg: String Interning
11.	Composite - Allows composing objects into a tree-like structure and treat it like a single object. Eg:tree, Folder and files
12.	Bridge - Decouple abstraction from implementation so that both can vary independently. Bridge pattern is often created using Adapter pattern.


### 3. Behavioral: 

13.	Observer - publish-subscribe pattern. Eg: Reactive streams.
14.	Chain of Responsibility - Object passes through various instances, coordinated by Handler. Eg: A try-catch block with multiple catch
15.	Visitor - Object which visits all similar instances. Eg: File Traverse, or Calculate total bill from cart.
16.	Command - Object encapsulates action with common interface which executor calls. Eg: Remote click.
17.	Strategy - Switch the algorithm/strategy at run time based upon the situation. Eg: Collections.sort() and Arrays.sort()
18.	State - Behavior based on current state of object.
19.	Iterator - Iterating through a collection of objects.
20.	Mediator 
21.	Interpreter - Format converter. Eg: JVM converts byte to native for JVM.
22.	Memento - Snapshot. Save and restore state of object. Eg: UseCase - implement undo feature

