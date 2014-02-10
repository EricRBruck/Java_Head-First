class CH04_EX1_XCopy {
	public static void main(String [] args) {
		int orig = 42;

		CH04_EX1_XCopy x = new CH04_EX1_XCopy();

		int y = x.go(orig);

		System.out.println(orig + " " + y);
	}

	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
}
