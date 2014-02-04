//Chapter 1
//Exercise 2
//Mixed Messages Part 1
// Output: 00 11 21 32 42

class CH01_MixedMessages1 { 
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while ( x < 5 ) {

			// Altering Code Start

			y = x - y;

			// Altering Code End

			System.out.print(x + "" + y + " " );
			x = x + 1;
		}
		System.out.println("");
	}
}
