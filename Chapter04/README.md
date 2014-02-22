Chapter 4 Exercises
===================

Exercise 1 - Be The Compiler
---------------------------

Each of the Java files on this page represents a complete source file.  Your job is to play compiler and determine whether each of these files will compile.  If they won't compile, how would you fix them, and if they do compile what would be their output?

#### Program 1: XCopy####

<!-- language: java -->

    class CH04_EX1_XCopy {
	public static void main(String [] args) {
		int orig = 42;
    
		CH04_EX1_XCopy x = new CH04_EX1_XCopy();
    
		int y = x.go(orig);
    
		System.out.println(orig + " " + y);
	}
    
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
    }

**Correction**

This file will compile as is.

**Output**

Output will be the following:

>42 84

#### Program 2: Clock####

<!-- language: java -->

    class CH04_EX1_Clock {
	String time;
    
	void setTime(String t) {
		time = t;
	}
    
	//Changed return type from void to String
	void getTime() {
		return time;
	}
    }

<!-- language: java -->

    class CH04_EX1_ClockTestDrive {
	public static void main(String [] args) {
		CH04_EX1_Clock c = new CH04_EX1_Clock();
    
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
    }

**Correction**

Chang return type of getTime() method from void to String.

<!-- language: java -->

    class CH04_EX1_Clock {
	String time;
    
	void setTime(String t) {
		time = t;
	}
    
	//Changed return type from void to String
	String getTime() {
		return time;
	}
    }

**Output**

Output will be the following:

>time: 1245

- - -

Exercise 2 - Who am I?
----------------------------

A bunch of Java components, in full costume, are playing at a party game, "Who am I?"  They give you a clue, and you try to guess who they are, based on what they say.  Assume they always tell the truth about themselves.  If they happen to say something that could be true for more than one guy, then write down all for whom that sentence applies.  Fill in the blanks next to the sentence with the names of one or more attendees.

Tonight's attendees:

>Instance variable, argument, return, getter, setter, encapsulation, public, private, pass by value, method.

1. A class can have any number of these

>method, instance variables, getter, setter

2. A method can have only one of these

>return

3. This can be implicitly promoted

>argument, return

4. I prefer my instance variables private

>encapsulation

5. It really means 'make a copy'

>pass by value

6. Only setters should update these

>instance variable

7. A method can have many of these

>argument

8. I return something by definition

>getter

9. I shouldn't be used with instance variables

>public

10. I can have many arguments

>method

11. By definition, I take one argument

>setter

12. These help create encapsulation

>getter, setter, public, private

13. I always fly solo

>return

- - -

Exercise 3 - Mixed Messages
---------------------------

A short Java program is listed below.  One block of the program is missing.  Your challenge is to match the candidate block of code, with the output that you'd see of the block were inserted.  Not all the lines of output will be used, and some of the lines of output might be used more than once.

#### Program: ####

<!-- language: java -->

    public class CH04_EX3_MixedMessages1 {
	int counter = 0;
	public static void main(String [] args) {
		int count = 0;
		CH04_EX3_MixedMessages1 [] ma = new CH04_EX3_MixedMessages1[20];
		int x = 0;
    
		while (/*Candidate code A goes here*/) {
    
			ma[x] = new CH04_EX3_MixedMessages1();
			ma[x].counter = ma[x].counter + 1;
			count = count + 1;
			count = count + ma[x].maybeNew(x);
			x = x + 1;
		}
		System.out.println(count + " " + ma[1].counter); 
	}
    
	public int maybeNew(int index) {

		if (/*Candidate code B goes here*/) {

			CH04_EX3_MixedMessages1 m = new CH04_EX3_MixedMessages1();
			m.counter = m.counter + 1;
			return 1;
		}
		return 0;
	}
    }

#### Output Candidates: ####

<!-- language: txt -->

    14 7

<!-- language: txt -->

    9 5

<!-- language: txt -->

    19 1

<!-- language: txt -->

    14 1

<!-- language: txt -->

    25 1

<!-- language: txt -->

    7 7

<!-- language: txt -->

    20 1

<!-- language: txt -->

    20 5

#### Code Candidate 1: ####

<!-- language: java -->

    //Code Candidate A
    x < 9
    
    //Code Candidate B
    index < 5

>Output will be: 14 1

#### Code Candidate 2: ####

<!-- language: java -->

    //Code Candidate A
    x < 20
    
    //Code Candidate B
    index < 5

>Output will be: 25 1

#### Code Candidate 3: ####

<!-- language: java -->

    //Code Candidate A
    x < 7
    
    //Code Candidate B
    index < 7

>Output will be: 14 1

#### Code Candidate 4: ####

<!-- language: java -->

    //Code Candidate A
    x < 19
    
    //Code Candidate B
    index < 1

>Output will be: 20 1
