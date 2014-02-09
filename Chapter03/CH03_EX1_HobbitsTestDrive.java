//Moved main to test drive class.
//without this it was an infinite recursive function.
class CH03_EX1_HobbitsTestDrive {
        public static void main(String [] args) {

                CH03_EX1_Hobbits [] h = new CH03_EX1_Hobbits[3];
                int z = 0;

		//Changed:
		// while (z < 4) {
		//to
		// while (z < 3) {
		//This would cause an out of bounds reference.
		//The code would try to reference array position 3
		//Only legal array positions are 0, 1, and 2.
                while (z < 3) {
                        h[z] = new CH03_EX1_Hobbits();
                        h[z].name = "bilbo";
                        if (z == 1) {
                                h[z].name = "frodo";
                        }
                        if (z == 2) {
                                h[z].name = "sam";
                        }
                        System.out.print(h[z].name + " is a ");
                        System.out.println("good Hobbit name");

			//Moved to end of while loop.
                        //If not array position 0 would never be referenced.
			z = z + 1;
                }
        }
}
        
