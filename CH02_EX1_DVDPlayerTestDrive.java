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
