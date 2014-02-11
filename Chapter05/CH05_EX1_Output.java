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
