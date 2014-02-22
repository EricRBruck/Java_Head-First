Chapter 1 Exercises
===================

Exercise 1 - Code Magnets
----------------------------

A Java program is all scrambled up on the fridge.  Can you reconstruct the code snippets to make a working java program that produces the output listed below?  Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need.

#### Desired output: ####

<!-- language: txt -->

    a-b c-d	

#### Code Snippets: ####

<!-- language: java -->

    if (x == 1) {
        System.out.println("d");
        x = x - 1;
    }

<!-- language: java -->

    if (x == 2) {
        System.out.print("b c");
    }

<!-- language: java -->

    class CH01_Shuffle1 {
        public static void main(String[] args) {

<!-- language: java -->

    if (x > 2) {
        System.out.print("a");
    }

<!-- language: java -->

    int x = 3;

<!-- language: java -->

    x = x - 1;
        System.out.print("-");

<!-- language: java -->

    while (x > 0) {

- - -

Exercise 2 - Mixed Messages
---------------------------

A short Java program is listed below.  One block of the program is missing.  Your challenge is to match the candidate block of code, with the output that you'd see of the block were inserted.  Not all the lines of output will be used, and some of the lines of output might be used more than once.

#### Program: ####

<!-- language: java -->

    class CH01_EX2_MixedMessages {
    	public static void main(String [] args) {
    		int x = 0;
    		int y = 0;
    		while ( x < 5 ) {
    
    			//Candidate code goes here
    
    			System.out.print(x + "" + y + " " );
    			x = x + 1;
    		}
    		System.out.println("");
    	}
    }

#### Output Candidates: ####

<!-- language: txt -->

    22 46

<!-- language: txt -->

    11 34 59

<!-- language: txt -->

    02 14 26 38

<!-- language: txt -->

    02 14 36 48

<!-- language: txt -->

    00 11 21 32 42

<!-- language: txt -->

    11 21 32 42 53

<!-- language: txt -->

    00 11 23 36 410

<!-- language: txt -->

    02 14 25 36 47

#### Code Candidate 1: ####

<!-- language: java -->

    y = x - y;

>Output will be: 00 11 21 32 42

#### Code Candidate 2: ####

<!-- language: java -->

    y = x + y;

>Output will be: 00 11 23 36 410

#### Code Candidate 3: ####

<!-- language: java -->

    y = y + 2;
    if ( y > 4 ) { y = y - 1; }

>Output will be: 02 14 25 36 47

#### Code Candidate 4: ####

<!-- language: java -->

    x = x + 1;
    y = y + x;

>Output will be: 11 34 59

#### Code Candidate 5: ####

<!-- language: java -->

    if ( y < 5 ) {
        x = x + 1;
        if ( y < 3 ) { x = x - 1; }
    }
    y = y + 2;

>Output will be: 02 14 36 48
