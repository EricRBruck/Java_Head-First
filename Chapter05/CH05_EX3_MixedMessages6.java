//Expected output: 6 14
class CH05_EX3_MixedMessages6 {
	public static void main(String [] args) {
		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 4; inner > 1; inner--) {

				//Changing code - start
				x = x + 0;
				//Changing code - end

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
