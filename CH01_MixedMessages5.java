//Chapter 1
//Exercise 2
//Mixed Messages Part 5
// Output: 02 14 36 48

class CH01_MixedMessages5 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while ( x < 5 ) {

			// Altering Code Start

			if ( y < 5 ) {
				x = x + 1;
				if ( y < 3 ) { x = x - 1; }
			}
			y = y + 2;

			// Altering Code End

			System.out.print(x + "" + y + " " );
			x = x + 1;
		}
		System.out.println("");
	}
}
