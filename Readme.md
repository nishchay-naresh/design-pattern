# Design Principles

####    SOLID

**S - Single Responsibility Principle (SRP)**
    
“One class should have one and only one responsibility”

**O - Open Closed Principle (OCP)**

“Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. — Bertrand Meyer”

**L - Liskov’s Substitution Principle (LSP)**

“Derived types must be completely substitutable for their base types”

"If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering any of the desirable properties of that program (correctness, task performed, etc.)." — Barbara Liskov, 1987

**I - Interface Segregation Principle**

Make fine-grained interfaces that are client specific.

Don't create fatty interface so that Implementation classes require to implement unnecessary methods

Clients should not be forced to depend on methods they do not use.
 
**D - Dependency Inversion Principle (DIP)**

The legendary Robert C. Martin (Uncle Bob) lays down DIP with two golden rules::
1.	High-level modules should not depend on low-level modules. Both should depend on abstractions(e.g., interfaces).
2.	Abstractions should not depend on details. Details(concrete implementations) should depend on abstractions.

High-level modules define what they need (the contract/interface), and 
Low-level modules provide the how (the implementation of that interface).


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

“Most systems work best if they are kept simple rather than made complex. Therefore, simplicity should be a key goal in design.”

**7. YAGNI (You Aren’t Gonna Need It)**

“Always implement things when you actually need them, never when you just foresee that you need them.” — Ron Jeffries, co-founder of Extreme Programming
In simple terms: Don’t build for tomorrow. Build for today.



# Design Patterns

### Resources

- [Design patterns explained Pictorially ](https://refactoring.guru/design-patterns/catalog)
- [DP Cheat Sheet ](../design-pattern/src/resources/DP_cheat_sheet.pdf)

Types of Design Patterns
1. Creational Patterns - Deals with the process of creation of objects of a class.
2. Structural Patterns - deals with objects and arrangement of objects (IS A, HAS A)
3. Behavioral Patterns - concerned with communication between objects.


4. J2EE Patterns - specifically concerned with the presentation tier



### 1. Creational: 

1. Singleton - Makes sure there is just one instance. Either Eager (static) or Lazy. Eg: Logger, Configurer
2. Builder - Way to construct complex objects ( immutable )Eg: StringBuilder, PizzaMaker
3. Prototype - Wrapper of clone method, Copying costly-creation objects.
4. Factory / Factory Method - Assigns subclasses the task of instantiating objects. Eg: Trade type (Bonds, Bill, Notes)
5. Abstract Factory - Constructs related object families without defining their concrete classes.
Factory of factories of related products. Eg: Trade Type (GermanBond, EuroBond, GermanBill, EuroBill)
6. Object pool - Re-use instances. Eg: Threadpool, objectpool

### 2. Structural: 

6.	Adapter - Acts as a bridge between two incompatible interface/module/system
7.	Facade - Hiding complexity behind simple interfaces. Eg: Turbo Tax
8.	Decorator - Attaches additional functionality(enrichment) to objects at runtime. Eg: synchronizedXxx(), unmodifiableXxx()
9.	Proxy - Controls the access to an object. Eg: Hibernate proxy for lazy fetch. @Spy instances for JUnit/Mockito.
10.	Flyweight - Share common parts of state between multiple objects to reduce memory. Eg: String Interning
11.	Composite - Handles single and composite objects equally. Allows composing objects into a tree-like structure and treat it like a single object. Eg:Tree, LinkedList, Folder and files
12.	Bridge - Decouple abstraction from implementation so that both can vary independently. Bridge pattern is often created using Adapter pattern.


### 3. Behavioral: 

13.	Observer - Observe and notify multiple objects about any events that happen to the object they’re observing. publish-subscribe pattern. Eg: Reactive streams.
14.	Chain of Responsibility - Object passes through various instances, coordinated by Handler. Eg: A try-catch block with multiple catch
15.	Visitor - Object which visits all similar instances. Eg: File Traverse, or Calculate total bill from cart.
16.	Command - Object encapsulates action with common interface which executor calls. Eg: Remote click.
17.	Strategy - Switch the algorithm/strategy at run time based upon the situation. Eg: Collections.sort() and Arrays.sort()
18.	State - Behavior based on current state of object.
19.	Iterator - Iterating through a collection of objects.
20.	Mediator 
21.	Interpreter - Format converter. Eg: JVM converts byte to native for JVM.
22.	Memento - Snapshot. Save and restore state of object. Eg: UseCase - implement undo feature

