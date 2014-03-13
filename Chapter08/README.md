Chapter 8 Exercises
===================

Exercise 1 - What's the Picture?
---------------------------

Here's your chance to demonstrate your artistic abilities.  You are given sets of class and interface declarations.  Your job is to draw the associated class diagrams.

#### Key: ####

<!-- language: java -->

    - - -> implements
    
    -----> extends


#### Declarations 1: ####

<!-- language: java -->

    public interface Foo {}
    public class Bar implements Foo {}

<!-- language: java -->

    (interface)             (class)
     -----------             -----------
    |    Foo    |           |    Bar    |
    |-----------|  <- - -   |-----------|
    |           |           |           |
    |           |           |           |
     -----------             -----------

#### Declarations 2: ####

<!-- language: java -->

    public interface Vinn {}
    public abstract class Vout implements Vinn {}

<!-- language: java -->

    (interface)             (abstract class)
     -----------             -----------
    |   Vinn    |           |   Vout    |
    |-----------|  <- - -   |-----------|
    |           |           |           |
    |           |           |           |
     -----------             -----------

#### Declarations 3: ####

<!-- language: java -->

    public abstract class Muffie implements Wuffie {}
    public class Fluffie extends Muffie {}
    public interface Wuffie {}

<!-- language: java -->

    (interface)             (abstract class)        (class)
     -----------             -----------             -----------
    |  Wuffie   |           |  Muffie   |           |  Fluffie  |
    |-----------|  <- - -   |-----------|  <-----   |-----------|
    |           |           |           |           |           |
    |           |           |           |           |           |
     -----------             -----------             -----------

#### Declarations 4: ####

<!-- language: java -->

    public class Zoop {}
    public class Boop extends Zoop {}
    public class Goop extends Boop {}

<!-- language: java -->

    (interface)             (class)                 (class)
     -----------             -----------             -----------
    |   Zoop    |           |   Boop    |           |   Goop    |
    |-----------|  <- - -   |-----------|  <-----   |-----------|
    |           |           |           |           |           |
    |           |           |           |           |           |
     -----------             -----------             -----------

#### Declarations 5: ####

<!-- language: java -->

    public class Gamma extends Delta implements Epsilon {}
    public interface Epsilon {}
    public interface Beta {}
    public class Alpha extends Gamma implements Beta {}
    public class Delta {}

<!-- language: java -->

    (interface)                    (class)
     -----------                    -----------
    |   Delta   |                  |  Epsilon  |
    |-----------|                  |-----------|
    |           |                  |           |
    |           |                  |           |
     -----------                    -----------
    
        /|\                             / \
         |                               |
          --------------   - - - - - - -
                        | |
                        | 
                        | |

                   (interface)                    (class)
                    -----------                    -----------
                   |   Gamma   |                  |   Beta    |
                   |-----------|                  |-----------|
                   |           |                  |           |
                   |           |                  |           |
                    -----------                    -----------
    
                        /|\                            / \
                         |                              |
                          --------------   - - - - - - -
                                        | |
                                        | 
                                        | |
    
                                    (interface)
                                     -----------
                                    |   Alpha   |
                                    |-----------|
                                    |           |
                                    |           |
                                     -----------

- - -

Exercise 2 - 
----------------------------

You are given sets of class diagrams.  Your job is to turn these into valid declarations.

#### Key: ####

<!-- language: java -->

    - - ->               implements
    
    ----->               extends
    
     -----------
    |           |        class
     -----------

     ***********
    *           *        interface
     ***********

     +++++++++++
    +           +        abstract class
     +++++++++++



#### Class Diagram 1: ####

<!-- language: java -->

    (class)                 (class)
     -----------             -----------
    |   Click   |           |   Clack   |
    |-----------|  <-----   |-----------|
    |           |           |           |
    |           |           |           |
     -----------             -----------

<!-- language: java -->

    public class Click {}
    public class Clack extends Click {}

#### Class Diagram 2: ####

<!-- language: java -->

    (abstract class)        (class)
     +++++++++++             -----------
    +    Top    +           |    Tip    |
    +++++++++++++  <-----   |-----------|
    +           +           |           |
    +           +           |           |
     +++++++++++             -----------

<!-- language: java -->

    public abstract class Top {}
    public class Tip extends Top {}

#### Class Diagram 3: ####

<!-- language: java -->

    (abstract class)        (abstract class)
     +++++++++++             +++++++++++
    +    Fee    +           +    Fi     +
    +++++++++++++  <-----   +++++++++++++
    +           +           +           +
    +           +           +           +
     +++++++++++             +++++++++++

<!-- language: java -->

    public abstract class Fee {}
    public abstract class Fi extends Fee {}

#### Class Diagram 4: ####

<!-- language: java -->

    (abstract class)        (class)                (class)
     ***********             -----------             -----------
    *    Foo    *           |    Bar    |           |    Baz    |
    *************  <- - -   |-----------|  <-----   |-----------|
    *           *           |           |           |           |
    *           *           |           |           |           |
     ***********             -----------             -----------

<!-- language: java -->

    public interface Foo {}
    public class Bar implements Foo {}
    public class Baz extends Bar {}

#### Class Diagram 5: ####

<!-- language: java -->

    (abstract class)        (class)                (class)
     ***********             -----------             -----------
    *   Zeta    *           |   Alpha   |           |   Delta   |
    *************  <- - -   |-----------|  <-----   |-----------|
    *           *           |           |           |           |
    *           *           |           |           |           |
     ***********             -----------             -----------
                                                          |
    
                            (abstract class)              |
                             ***********
                            *   Zeta    *                 |
                            *************  <- - - - - - -
                            *           *
                            *           *
                             ***********

<!-- language: java -->

    public interface Zeta {}
    public class Alpha implements Zeta {}
    public interface Beta {}
    public class Delta extends Alpha implements Beta {}
