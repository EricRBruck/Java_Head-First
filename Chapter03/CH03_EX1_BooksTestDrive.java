class CH03_EX1_BooksTestDrive {
	public static void main(String [] args) {

		CH03_EX1_Books [] myBooks = new CH03_EX1_Books[3];
		int x = 0;

		// Missing code - Start
		myBooks[0] = new CH03_EX1_Books();
		myBooks[1] = new CH03_EX1_Books();
		myBooks[2] = new CH03_EX1_Books();
		// Missing code - End

		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";

		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";

		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
	}
}
