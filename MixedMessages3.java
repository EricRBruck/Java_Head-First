//Chapter 1
//Exercise 2
//Mixed Messages Part 3
// Output: 02 14 25 36 47

class MixedMessages3 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while ( x < 5 ) {

			// Altering Code Start

			y = y + 2;
			if ( y > 4 ) { y = y - 1; }

			// Altering Code End

			System.out.print(x + "" + y + " " );
			x = x + 1;
		}
		System.out.println("");
	}
}
