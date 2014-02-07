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
