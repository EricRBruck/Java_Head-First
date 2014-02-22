Chapter 5 Exercises
===================

Exercise 1 - Be The JVM
---------------------------

The Java file on this page represents a complete source file.  Your job is to play JVM and determine what would be the output when the program runs?

#### Program: ####

<!-- language: java -->

    class CH05_EX1_Output {
    
    	public static void main(String [] args) {
    		CH05_EX1_Output o = new CH05_EX1_Output();
    		o.go();
    	}
    
    	void go() {
		int y = 7;
    		for (int x = 1; x < 8; x++) {
    			//This is post incrementing of y
    			y++;
			if (x > 4) {
    				//This is pre incrementing of y
    				//y will be incremented before it is displayed
    				System.out.print(++y + " ");
    			}
    			if (y > 14) {
    				System.out.println("x = " + x);
    				break;
    			}
    		}
    	}
    }


#### Possible Output: ####

<!-- language: txt -->

    12 14

<!-- language: txt -->

    12 14 x = 6

<!-- language: txt -->

    13 15 x = 6

#### Correct Output: ####

<!-- language: java -->

    13 15 x = 6

- - -

Exercise 2 - Code Magnets
----------------------------

A Java program is all scrambled up on the fridge.  Can you reconstruct the code snippets to make a working java program that produces the output listed below?  Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need.

#### Desired output: ####

<!-- language: txt -->

    0 4
    0 3
    1 4
    1 3
    3 4
    3 3

#### Code Snippets: ####

<!-- language: java -->

    x++;

<!-- language: java -->

    if (x == 1) {

<!-- language: java -->

    System.out.println(x + " " + y);

<!-- language: java -->

    class MultiFor {

<!-- language: java -->

    for (int y = 4; y > 2; y--) {

<!-- language: java -->

    for (int x = 0; x < 4; x++) {

<!-- language: java -->

    public static void main(String [] args) {

- - -

Exercise 3 - Mixed Messages
---------------------------

A short Java program is listed below.  One block of the program is missing.  Your challenge is to match the candidate block of code, with the output that you'd see of the block were inserted.  Not all the lines of output will be used, and some of the lines of output might be used more than once.

#### Program: ####

<!-- language: java -->

    class CH05_EX3_MixedMessages1 {
	public static void main(String [] args) {
		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 4; inner > 1; inner--) {
    
				//Candidate code goes here
    
				y = y - 2;
				if (x == 6) {
					break;
				}
				x = x + 3;
			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}
}

#### Output Candidates: ####

<!-- language: txt -->

    45 6

<!-- language: txt -->

    36 6

<!-- language: txt -->

    54 6

<!-- language: txt -->

    60 10

<!-- language: txt -->

    18 6

<!-- language: txt -->

    6 14

<!-- language: txt -->

    12 14


#### Code Candidates 1: ####

<!-- language: java -->

    x = x + 3;

>Output will be: 54 6

#### Code Candidates 2: ####

<!-- language: java -->

    x = x + 6;

>Output will be: 60 10

#### Code Candidates 3: ####

<!-- language: java -->

    x = x + 2;

>Output will be: 45 6

#### Code Candidates 4: ####

<!-- language: java -->

    x++;

>Output will be: 36 6

#### Code Candidates 5: ####

<!-- language: java -->

    x--;

>Output will be: 18 6

#### Code Candidates 6: ####

<!-- language: java -->

    x = x + 0;

>Output will be: 6 14

