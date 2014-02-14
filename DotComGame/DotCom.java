/**********************************************************
Description
----------------
This class holds the data of one DotCom and checks the user guess agains this DotCom data.

Variables
----------------
locationCells (String ArrayList) - Array List of the location the DotCom is at
name (int) - The name of the DotCom

Methods
----------------
setLocationCells - Set the location of the DotCom
setNmae - Set the name of the DotCom
checkYourself - Check the user guess
**********************************************************/
import java.util.*;

public class DotCom {

	private ArrayList<String> locationCells;
	private String name;

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {

		//default result to miss
		String result = "miss";

		//get index of guess (-1 if not in locationCells)
		int index = locationCells.indexOf(userInput);

		//if guess is in locationCells, remove it
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunck " + name);
			}
			else {
				result = "hit";
			}
		}

		return result;
	}
}
