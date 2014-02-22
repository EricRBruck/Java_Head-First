Chapter 3 Exercises
===================

Exercise 1 - Be The Compiler
---------------------------

Each of the Java files on this page represents a complete source file.  Your job is to play compiler and determine whether each of these files will compile.  If they won't compile, how would you fix them, and if they do compile what would be their output?

#### Program 1: Books####

<!-- language: java -->

    class CH03_EX1_Books {
    	String title;
    	String author;
    }

<!-- language: java -->

    class CH03_EX1_BooksTestDrive {
    	public static void main(String [] args) {
    
    		CH03_EX1_Books [] myBooks = new CH03_EX1_Books[3];
    		int x = 0;
    
    		myBooks[0].title = "The Grapes of Java";
    		myBooks[1].title = "The Java Gatsby";
    		myBooks[2].title = "The Java Cookbook";
    
    		myBooks[0].author = "bob";
    		myBooks[1].author = "sue";
    		myBooks[2].author = "ian";
    
    		while (x < 3) {
    			System.out.print(myBooks[x].title);
    			System.out.print(" by ");
    			System.out.println(myBooks[x].author);
    			x = x + 1;
    		}
    	}
    }

**Correction**

Missing the following lines of code in the BooksTestDrive class after the Books array, myBooks, is defined:

<!-- language: java -->

    myBooks[0] = new CH03_EX1_Books();
    myBooks[1] = new CH03_EX1_Books();
    myBooks[2] = new CH03_EX1_Books();

<!-- language: java -->

    class CH03_EX1_BooksTestDrive {
    	public static void main(String [] args) {
    
    		CH03_EX1_Books [] myBooks = new CH03_EX1_Books[3];
    		int x = 0;
    
    		// Missing code - Start
    		myBooks[0] = new CH03_EX1_Books();
    		myBooks[1] = new CH03_EX1_Books();
    		myBooks[2] = new CH03_EX1_Books();
    		// Missing code - End
    
    		myBooks[0].title = "The Grapes of Java";
    		myBooks[1].title = "The Java Gatsby";
    		myBooks[2].title = "The Java Cookbook";
    
    		myBooks[0].author = "bob";
    		myBooks[1].author = "sue";
    		myBooks[2].author = "ian";
    
    		while (x < 3) {
    			System.out.print(myBooks[x].title);
    			System.out.print(" by ");
    			System.out.println(myBooks[x].author);
    			x = x + 1;
    		}
    	}
    }

**Output**

Output will be the following:

>The Grapes of Java by bob

>The Java Gatsby by sue

>The Java Cookbook by ian

#### Program 2: Hobbits####

<!-- language: java -->

    class CH03_EX1_Hobbits {
    
    	String name;
    
    	public static void main(String [] args) {
    
            CH03_EX1_Hobbits [] h = new CH03_EX1_Hobbits[3];
            int z = 0;
    
            while (z < 4) {
                z = z + 1;
                h[z] = new CH03_EX1_Hobbits();
                h[z].name = "bilbo";
                if (z == 1) {
                        h[z].name = "frodo";
                }
                if (z == 2) {
                        h[z].name = "sam";
                }
                System.out.print(h[z].name + " is a ");
                System.out.println("good Hobbit name");
            }
        }
    }

**Correction**

Change 

<!-- language: java -->

    while (z < 4) {

to

<!-- language: java -->

    while (z < 3) {

This would cause an out of bounds reference.  The code would try to reference array position 3.  The only legal array positions are 0, 1, and 2.

Move

<!-- language: java -->

    z = z + 1;

to end of while loop.  If not array position 0 would never be referenced.

<!-- language: java -->

    class CH03_EX1_Hobbits {
    
    	String name;
    
    	public static void main(String [] args) {
    
            CH03_EX1_Hobbits [] h = new CH03_EX1_Hobbits[3];
            int z = 0;
    
    		//Changed:
    		// while (z < 4) {
    		//to
    		// while (z < 3) {
    		//This would cause an out of bounds reference.
    		//The code would try to reference array position 3
    		//Only legal array positions are 0, 1, and 2.
            while (z < 3) {
                h[z] = new CH03_EX1_Hobbits();
                h[z].name = "bilbo";
                if (z == 1) {
                        h[z].name = "frodo";
                }
                if (z == 2) {
                        h[z].name = "sam";
                }
                System.out.print(h[z].name + " is a ");
                System.out.println("good Hobbit name");
    
    			//Moved to end of while loop.
                //If not array position 0 would never be referenced.
    			z = z + 1;
            }
        }
    }

**Output**

Output will be the following:

>bilbo is a good Hobbit name

>frodo is a good Hobbit name

>sam is a good Hobbit name

- - -

Exercise 2 - Code Magnets
----------------------------

A Java program is all scrambled up on the fridge.  Can you reconstruct the code snippets to make a working java program that produces the output listed below?  Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need.

#### Desired output: ####

<!-- language: txt -->

    island = Fiji
    island = Cozumel
    island = Bermuda
    island = Azores	

#### Code Snippets: ####

<!-- language: java -->

    int y = 0;

<!-- language: java -->

    ref = index[y];

<!-- language: java -->

    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";

<!-- language: java -->

    int ref;
    while (y < 4) {

<!-- language: java -->

    System.out.println(islands[ref]);

<!-- language: java -->

    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

<!-- language: java -->

    String [] islands = new String[4];

<!-- language: java -->

    System.out.print("island = ");

<!-- language: java -->

    int [] index = new int[4];

<!-- language: java -->

    y = y + 1;

<!-- language: java -->

    class TestArrays {
    	public static void main(String [] args) {
