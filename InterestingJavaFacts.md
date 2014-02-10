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
    
