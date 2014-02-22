Chapter 7 Exercises
===================

Exercise 1 - Mixed Messages
---------------------------

A short Java program is listed below.  One block of the program is missing.  Your challenge is to match the candidate block of code, with the output that you'd see of the block were inserted.  Not all the lines of output will be used, and some of the lines of output might be used more than once.

#### Program: ####

<!-- language: java -->

    class A {
	    int ivar = 7;
	    void m1() {
		    System.out.print("A's m1, ");
	    }
	    void m2() {
		    System.out.print("A's m2, ");
	    }
	    void m3() {
		    System.out.print("A's m3, ");
	    }
    }
    
    class B extends A {
	    void m1() {
		    System.out.print("B's m1, ");
	    }
    }
    
    class C extends B {
	    void m3() {
		    System.out.print("C's m3, " + (ivar + 6));
	    }
    }
    
    public class CH07_EX1_MixedMessages1 {
	    public static void main(String [] args) {
		    A a = new A();
		    B b = new B();
		    C c = new C();
		    A a2 = new C();
    
		    //Candidate code goes here
    
		    System.out.print("\n");
	    }
    }


#### Output Candidates: ####

<!-- language: txt -->

    A's m1, A's m2, C's m3, 6

<!-- language: txt -->

    B's m1, A's m2, A's m3,

<!-- language: txt -->

    A's m1, B's m2, A's m3,

<!-- language: txt -->

    B's m1, A's m2, C's m3, 13

<!-- language: txt -->

    B's m1, C's m2, A's m3,

<!-- language: txt -->

    B's m1, A's m2, C's m3, 6

<!-- language: txt -->

    A's m1, A's m2, C's m3, 13

#### Code Candidate 1: ####

<!-- language: java -->

    b.m1();
    c.m2();
    a.m3();

>Output will be: B's m1, A's m2, A's m3,

#### Code Candidate 2: ####

<!-- language: java -->

    c.m1();
    c.m2();
    c.m3();

>Output will be: B's m1, A's m2, C's m3, 13

#### Code Candidate 3: ####

<!-- language: java -->

    a.m1();
    b.m2();
    c.m3();

>Output will be: A's m1, A's m2, C's m3, 13

#### Code Candidate 4: ####

<!-- language: java -->

    a2.m1();
    a2.m2();
    a2.m3();

>Output will be: B's m1, A's m2, C's m3, 13

- - -

Exercise 2 - Be The Compiler
----------------------------

Each of the Java files on this page represents a complete source file.  Your job is to play compiler and determine whether each of these files will compile.  If they won't compile, how would you fix them, and if they do compile what would be their output?

#### Program: ####

<!-- language: java -->

    public class CH07_EX2_MonsterTestDrive {
	    public static void main(String [] args) {
		    Monster [] ma = new Monster[3];
		    ma[0] = new Vampire();
		    ma[1] = new Dragon();
		    ma[2] = new Monster();
		    for(int x = 0; x < 3; x++) {
			    ma[x].frighten(x);
		    }
	    }
    }
    
    class Monster {
	    //Code Location A
    }
    
    class Vampire extends Monster {
	    //Code Location B
    }
    
    class Dragon extends Monster {
	    boolean frighten(int degree) {
		    System.out.println("breath fire");
		    return true;
	    }
    }

#### Desired Output: ####

<!-- language: txt -->

    a bite?
    breath fire
    arrrgh

#### Possible Code Option 1: ####

<!-- language: java -->

    //Code for location A
    boolean frighten(int d) {
	    System.out.println("arrrgh");
	    return true;
    }
    //Code for location B
    boolean frighten(int x) {
	    System.out.println("a bite?");
	    return false;
    }

>This code segment will give the expected output

#### Possible Code Option 2: ####

<!-- language: java -->

    //Code for location A
    boolean frighten(int x) {
	    System.out.println("arrrgh");
	    return true;
    }
    //Code for location B
    int frighten(int f) {
	    System.out.println("a bite?");
	    return false;
    }

>The second frighten method will not overload the original method because it has a different return type.

#### Possible Code Option 3: ####

<!-- language: java -->

    //Code for location A
    boolean frighten(int x) {
	    System.out.println("arrrgh");
	    return true;
    }
    //Code for location B
    boolean scare(int x) {
	    System.out.println("a bite?");
	    return false;
    }

>The second method will not overload the original method because it has a different name.

#### Possible Code Option 4: ####

<!-- language: java -->

    //Code for location A
    boolean frighten(int z) {
	    System.out.println("arrrgh");
	    return true;
    }
    //Code for location B
    boolean frighten(byte b) {
	    System.out.println("a bite?");
	    return false;
    }

>The second frighten method will not overload the original method because it has a different argument type.. 
