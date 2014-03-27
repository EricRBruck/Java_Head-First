Interesting Java facts
======================

### Primitive Types ###
| Type      | Bit Depth     | Value Range               |
| :-------- | :------------ | :------------------------ |
| boolean   | UVM-specific  | true or false             |
| char      | 16 bits       | 0 to 65535                |
| byte      | 8 bits        | -128 to 127               |
| short     | 16 bits       | -32768 to 32767           |
| int       | 32 bits       | -2147483648 to 2147483647 |
| long      | 64 bits       | -huge to huge             |
| float     | 32 bits       | varies                    |
| double    | 64 bits       | varies                    |

Examples - Primitive Declarations with Assignments

* int x;
* x = 234;
* byte b = 89;
* boolean isFun = true;
* boolean isPunkRock;
* isPunkRock = false;
* double d = 3456.98;
* char c = 'f';
* long big = 3456789;
* float f = 32.5f;
  * **NOTE:** The 'f' is needed with a float, because Java thinks anything with floating point is a double, unless you use 'f'.

- - -

### Object ~~Variable~~ Reference ###
There is actually no such thing as an OBJECT variable.

There is only an object REFERENCE variable.

An object reference variable holds bits that represent a way to access and object.

It does not hold the object itself, but it holds something like a pointer, or an address.  Except, in Java we don't really know what is inside a reference variable.  We do know whatever it is, it represents one and only one object.  The JVM knows how to use the reference to get to the object.

- - -

### Default Values ###
Instance variables always get a default value.  If you don't explicitly assign a value to an instance variable, or you don't call a setter method, the instance variable still has a value!

| Type            | Default Value |
| :-------------- | :------------ |
| Integer         | 0             |
| Floating Points | 0.0           |
| Booleans        | false         |
| References      | null          |

- - -

### The Difference Instance and Local Variables ###
**Instance** variables are *declared inside a class* but not within a method.

  + Instance variable: height, breed

<!-- language: java -->

    class Horse {
      private double height = 15.2;
      private String breed;
      // more code...
    }

**Local** variables are *declared within a method*.

  + Local variable: total

<!-- language: java -->

    class AddThing {
      int a;
      int b = 12;
      
      public int add() {
        int total = a + b;
        return total;
      }
    }

**Local** variables *MUST be initialized before use*!

  + Local variable: x
  + Local Variables do NOT get a default value! the compiler complains if you try to use a local variable before the variable is initialized.
  + This will not compile.  You can declare x without a value, but as soon as you try to use it, the compiler will throw an error.

<!-- language: java -->

    class foo {
      public void go() {
        int x;
        int z = x + 3;
      }
    }

- - -

### Random Numbers ###

<!-- language: java -->

    int randomNum = (int) (Math.random() * 5);

The Math.random method return a number from **zero to just less than one**.  In other languages like C++ the number generated from **0 to 32767** (this may vary).  For C++ the modulus (%) is used to generate a number within a range.  In Java you need to multiply (*) to obtain a range of numbers.

- - -

### Pre and Post Increment/Decrement Operator ***

**Post Increment:** This is the same as x = x + 1;

<!-- language: java -->

    x++;

**Post Decrement:** This is the same as x = x - 1;

<!-- language: java -->

    x--;

**Pre Increment:** This is the same as x = x + 1;

<!-- language: java -->

    ++x;

**Pre Decrement:** This is the same as x = x - 1;

<!-- language: java -->

    --x;

Putting the operator *before* the variable means, "first" increment by 1 then use the new value.  This only matters when the value is part of a larger expression rather than just a single statement.

<!-- language: java -->

    int x = 0;
    int z = ++x;

This produces x = 1 and z = 1.  x is incremented by 1 then used to set the value of z.

<!-- language: java -->

    int x = 0;
    int z = x++;

This produces x = 1 and **z = 0**.  z is set then x is incremented.

- - -

### The *Enhanced* for Loop ###

<!-- language: java -->

    for (String name : nameArray ) { }

This is synonymous with foreach in other languages.  This loops through all values in nameArray and stores the value in name for each iteration.

- - -

### Inheritance ###

- The subclass inherits from the superclass

- The subclass extends the superclass - the subclass inherits the members if the user class.
Members included the instance variables and methods

- Subclasses can add new methods and instance variables and override the methods it inherits from the superclass.

Example:

<!-- language: java -->

                   ------------------
                  | Doctor           |
                   ==================
                  |                  |
                  | worksAtHospital  |    (Instance Variables)
                  |                  |
                   ------------------
                  |                  |
                  | treatPatient()   |    (Methods)
                  |                  |
                   ------------------
                       / \    / \
                        |      |
                        |      |
              ----------        ----------
             |                            |
             |                            |
     ------------------          ------------------
    | FamilyDoctor     |        | Surgeon          |
     ==================          ==================
    |                  |        |                  |
    | makesHouseCalls  |        |                  |
    |                  |         ------------------
     ------------------         |                  |
    |                  |        | treatPatient()   |
    | giveAdvice()     |        | makeIncision()   |
    |                  |        |                  |
     ------------------          ------------------

<!-- language: java -->

    public class Doctor {
        boolean worksAtHospital;
        void treatPatient() {
            //give a checkup
        }
    }
    
    public class FamilyDoctor extends Doctor {
        boolean makesHouseCalls;
        void giveAdvice() {
            //give homespun advice
        }
    }
    
    public class Surgeon extends Doctor {
        void treatPatient() {
            //perform surgery
        }
        void makeIncision() {
            //make incision
        }
    }

If you wish to override a method but still use the superclass version of the method preface the method call with super.

Example:

<!-- language: java -->

    public void roam() {
        super.roam();
        //my own roam stuff
    }

**Using the IS-A and HAS-A**

When you want to know if one thing should extend another, apply the IS-A test.

Example:

> Triangle IS-A Shape ~ **True**
>> Triangle extends Shape

> Cat IS-A Feline ~ **True**
>> Cat extends Feline

> Tub IS-A Bathroom ~ **False**
>> Tub does not extend Bathroom

When you want to know is one thing has a reference to another, apply the HAS-A test.

Example:

> Bathroom HAS-A Tub ~ **True**
>> Bathroom has a reference to Tub

- - -

### Abstract ###

Abstract Class
Some classes should not be instantiated.  This is most common with the superclasses.  Fortunately, there is a simple way to prevent a class from over being instantiated.  In other words, to stop anyone from ever saying "new" on that type.  By making the class *abstract*, the compiler will stop any code from ever creating an instance of that type.

Classes that are not abstract are considered *concrete*.  Concrete classes are those that are specific enough to be instantiated.

To make an abstract class, put the keyword *abstract* before the class declaration

<!-- language: java -->

    abstract class Canine extends Animal {
        public void roam() { }
    }

Abstract Method
An abstract class means the class must be extended; an abstract method means the method must be overridden.  You might decide that some or all behaviors in an abstract class don't make sense unless they are implemented by a more specific subclass.  In other words, you can't think of any generic method implementation that could possibly be useful for subclasses.  For abstract methods you will not put in a method body, so no curly braces - just end the declaration with a semicolon.

<!-- language: java -->

    public abstract void eat() ;

Note: If you declare an abstract method, you **MUST** mark the class abstract as well.  You cannot have an abstract method in a non-abstract class.

- - -

### The Object Class ###

The Object class is the mother of all classes it's the superclass to everything.  The Object class serves 2 main purposes:
1. To act as a polymorphic type for methods that need to work on any class that you or anyone else makes.
2. To provide real method code that all objects in Java need at runtime.

Every class in Java extends the class Object.

A class directly extends the class Object if it does not already extend another class.

If a class does not directly extend the object class, then it implicitly extends the Object class.

- - -

### Multiple Inheritance ###

This is not possible in Java because of the Deadly Diamond of Death.

<!-- language: java -->

                   ------------------
                  | DigitalRecorder  |
                   ==================
                  |                  |
                  | int i            |
                  |                  |
                   ------------------
                  |                  |
                  | brun()           |
                  |                  |
                   ------------------
                       / \    / \
                        |      |
                        |      |
              ----------        ----------
             |                            |
             |                            |
     ------------------          ------------------
    | CDBurner         |        | DVDBurner        |
     ==================          ==================
    |                  |        |                  |
    |                  |        |                  |
     ------------------          ------------------ 
    |                  |        |                  |
    | burn()           |        | burn()           |
    |                  |        |                  |
     ------------------          ------------------
            / \                          / \
             |                            |
             |                            |
              ----------        ----------
                        |      |
                        |      |
                   ------------------
                  | ComboDrive       |
                   ==================
                  |                  |
                  |                  |
                   ------------------
                  |                  |
                  |                  |
                   ------------------

Problem - What burn() method does the ComboDrive class use?

- - -

### Interface - Solving the multiple inheritance problem ###

This is a solution that gives you much of the polymorphic benefits of multiple inheritance without the paring and suffering of the Deadly Diamond of Death.

**Solution:** make all methods abstract requiring the subclasses to implement the methods.

Define an interface:

<!-- language: java -->

    public interface pet {
        public abstract void beFriendly();
        public abstract void play();
    }

All interface methods are abstract, so they must end in a semicolon (They have no body).

Implement an interface:

<!-- language: java -->

    public class Dog extends Canine implements Pet {
        public void beFriendly() {
            …
        }
        public void play() {
            …
        }
    }

Classes that implement an interface must implement all methods in the interface class.

- - -
