//Chapter 1
//Exercise 2
//Mixed Messages Part 4
// Output: 11 34 59

class CH01_MixedMessages4 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while ( x < 5 ) {

			// Altering Code Start

			x = x + 1;
			y = y + x;

			// Altering Code End

			System.out.print(x + "" + y + " " );
			x = x + 1;
		}
		System.out.println("");
	}
}
