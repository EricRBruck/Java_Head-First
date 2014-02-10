//Expected output: 25 1
public class CH04_EX3_MixedMessages2 {
	int counter = 0;
	public static void main(String [] args) {
		int count = 0;
		CH04_EX3_MixedMessages2 [] ma = new CH04_EX3_MixedMessages2[20];
		int x = 0;

		//Changing code - start
		while (x < 20) {
		//Changing code - end

			ma[x] = new CH04_EX3_MixedMessages2();
			ma[x].counter = ma[x].counter + 1;
			count = count + 1;
			count = count + ma[x].maybeNew(x);
			x = x + 1;
		}
		System.out.println(count + " " + ma[1].counter); 
	}

	public int maybeNew(int index) {

		//Changed code - start
		if (index < 5) {
		//Changed code - end

			CH04_EX3_MixedMessages2 m = new CH04_EX3_MixedMessages2();
			m.counter = m.counter + 1;
			return 1;
		}
		return 0;
	}
}
