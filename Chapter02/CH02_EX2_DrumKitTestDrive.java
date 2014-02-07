class CH02_EX2_DrumKitTestDrive {
	public static void main(String [] args) {
		CH02_EX2_DrumKit d = new CH02_EX2_DrumKit();

		d.playSnare();
		d.playTopHat();

		d.snare = false;

		if (d.snare == true) {
			d.playSnare();
		}
	}
}
