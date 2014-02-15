import java.util.*;

public class CH06_EX1_ArrayListMagnet {

	public static void printAL(ArrayList<String> al) {
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	
	public static void main(String [] args) {
	
		ArrayList<String> a = new ArrayList<String>();
		
		a.add(0,"zero");
		a.add(1,"one");
		
		if (a.contains("two")) {
			a.add("2.2");
		}
		
		a.add(2,"two");
		
		a.add(3,"three");
		printAL(a);
		
		a.remove(2);
		
		if (a.contains("three")) {
			a.add("four");
		}
		
		printAL(a);
		
		if (a.indexOf("four") != 4) {
			a.add(4,"4.2");
		}
		
		printAL(a);
		
		printAL(a);
	}
}