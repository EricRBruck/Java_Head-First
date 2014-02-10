class CH04_EX1_ClockTestDrive {
	public static void main(String [] args) {
		CH04_EX1_Clock c = new CH04_EX1_Clock();

		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}
