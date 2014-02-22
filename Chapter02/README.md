Chapter 3 Exercises
===================

Exercise 1 - Be The Compiler
---------------------------

Each of the Java files on this page represents a complete source file.  Your job is to play compiler and determine whether each of these files will compile.  If they won't compile, how would you fix them, and if they do compile what would be their output?

#### Program 1: TapeDeck####

<!-- language: java -->

    class CH02_EX1_TapeDeck {
    	boolean canRecord = false;
    
    	void playTape() {
    	    System.out.println("tape playing");
    	}
    
    	void recordTape() {
    	    System.out.println("tape recording");
    	}
    }

<!-- language: java -->

    class CH02_EX1_TapeDeckTestDrive {
    	public static void main(String [] args) {
    
    	    t.canRecord = true;
    	    t.playTape();
    
    	    if (t.canRecord == true) {
    	        t.recordTape();
    	    }
    	}
    }


**Correction**

Missing the following line of code in the TapeDeckTestDrive class:

<!-- language: java -->

    TapeDeck t = new TapeDeck();

<!-- language: java -->

    class CH02_EX1_TapeDeckTestDrive {
    	public static void main(String [] args) {
    
    	    //Missing line of code
            CH02_EX1_TapeDeck t = new CH02_EX1_TapeDeck();
    
    	    t.canRecord = true;
    	    t.playTape();
    
    	    if (t.canRecord == true) {
    	        t.recordTape();
    	    }
    	}
    }

**Output**

Output will be the following:

>tape playing

>tape recording

#### Program 2: DVDPlayer####

<!-- language: java -->

    class CH02_EX1_DVDPlayer {
    	boolean canRecord = false;
    
    	void recordDVD() {
    	    System.out.println("DVD recording");
    	}
    }

<!-- language: java -->

    class CH02_EX1_DVDPlayerTestDrive {
    	public static void main(String [] args) {
    	    CH02_EX1_DVDPlayer d = new CH02_EX1_DVDPlayer();
    	    d.canRecord = true;
    
    	    d.playDVD();
    
    	    if (d.canRecord == true) {
    		d.recordDVD();
    	    }
    	}
    }

**Correction**

There is no playDVD method in the DVDPlayer class.  The following line in the DVDPlayerTestDrive class will throw an exception:

<!-- language: java -->

    d.playDVD();

<!-- language: java -->

    class CH02_EX1_DVDPlayerTestDrive {
    	public static void main(String [] args) {
    	    CH02_EX1_DVDPlayer d = new CH02_EX1_DVDPlayer();
    	    d.canRecord = true;
    
    	    //There is no method playDVD in DVDPlayer class
    	    //d.playDVD();
    
    	    if (d.canRecord == true) {
    		d.recordDVD();
    	    }
    	}
    }

**Output**

Output will be the following:

>DVD recording

- - -

Exercise 2 - Code Magnets
----------------------------

A Java program is all scrambled up on the fridge.  Can you reconstruct the code snippets to make a working java program that produces the output listed below?  Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need.

#### Desired output: ####

<!-- language: txt -->

    bang bang da-bang
    ding ding da-bing	

#### Code Snippets: ####

<!-- language: java -->

    d.playSnare();

<!-- language: java -->

    CH02_EX2_DrumKit d = new CH02_EX2_DrumKit();

<!-- language: java -->

    boolean topHat = true;
    boolean snare = true;

<!-- language: java -->

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

<!-- language: java -->

    public static void main(String [] args) {

<!-- language: java -->

    if (d.snare == true) {
        d.playSnare();
    }

<!-- language: java -->

    d.snare = false;

<!-- language: java -->

    class CH02_EX2_DrumKitTestDrive {

<!-- language: java -->

    d.playTopHat();

<!-- language: java -->

    class CH02_EX2_DrumKit {

<!-- language: java -->

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

