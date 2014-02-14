/**********************************************************
Description
----------------
This class retrieves the user input and assigns locations to each DotCom

Variables
----------------
alphabet (String) - A string containing the letters representing each row of the grid.
gridLength (int) - the length of one side of the grid. (we assume this is a cube grid).
gridSize (int) - The number of cells in the grid.
grid (int array) - An array, with a size equal to the number of cells in the grid (gridSize), used to make sure no cell is used more than once. 0 = not used, 1 = used.
comCount (int) - The number of DotComs that have been created.

Methods
----------------
getUserInput - Get the input from the user and return it.
placeDotCom - Return a string array list with a location for a DotCom.
**********************************************************/
import java.io.*;
import java.util.*;

public class GameHelper {

	//Initialize variables
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;

	/**********************************************************
	Description
	----------------
	Get the input from the user and return it.

	Parameters
	----------------
	prompt (string) - Message to display to the user.

	Return
	----------------
	inputLine (string) - The input retrieved from the command line.

	Variables
	----------------
	inputLine (string) - The input retrieved from the command line.
	**********************************************************/
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
		}
		catch (IOException e) {
			System.out.println("IOExcetion: " + e);
		}
		return inputLine.toLowerCase();
	}

	
	/**********************************************************
	Description
	----------------
	Get a location for a DotCom

	Parameters
	----------------
	comSize (int) - The size of the DotCom, or how many cells it will use.

	Return
	----------------
	newLoc (string array list) - An array list containing the location of the DotCom.

	Variables
	----------------
	newLoc(string array list) - An array list containing the location of the DotCom.
	attemptCount (int) - Number of attempts finding an open spot for the DotCom
	orientation (int) - The orientation of the DotCom
		This number is how many to increment by to get the next cell for the DotCom location
		1 = Horizontal
		gridLength (7) = Vertical
	success (boolean) - false if valid location not found,
		true if valid location found
	coords (int array) - Numerical values of the location
	**********************************************************/
	public ArrayList<String> placeDotCom(int comSize) {

		//increment the number of DotComs placed on the grid
		comCount++;

		//Initialize variables
		ArrayList<String> newLoc = new ArrayList<String>();
		int attemptCount = 0;
		int orientation = 1;
		boolean success = false;
		int [] coords = new int[comSize];

		//switch between placing horizontal and vertical DotComs
		if (comCount % 2 == 1) { orientation = gridLength; }

		//While a valid location has not been found and we have not tried to find one 100 times
		while (!success && attemptCount++ < 100) {

			//Starting location
			int location = (int) (Math.random() * gridSize);

			//If the DotCom would expand past the grid size, try again
			if (location > gridSize-(comSize-1) && orientation == 1) { continue; }
			if (location > gridSize-((comSize-1)*orientation) && orientation == gridLength) { continue; }
			if ((location%gridLength) > (gridLength-comSize) && orientation == 1) { continue; }
			if ((location/gridLength) > (gridLength-comSize) && orientation == gridLength) { continue; }

			//Set success to true and try to make it fail
			success = true;

			//final all cells for this location and check if they are valid (open)
			for (int x = 0; x < comSize; x++) {
				int currLoc = location+(x*orientation);
				if (currLoc >= gridSize) {
					success = false;
					break;
				}

				if (grid[currLoc] == 0) {
					coords[x] = currLoc;
				}
				else {
					success = false;
					break;
				}
			}
		}

		//If a valid location was found convert the numeric location to string and store in array list
		if (success) {
			for (int x : coords) {
				grid[x] = 1;
				int col = x % gridLength;
				String row = String.valueOf(alphabet.charAt(x/gridLength));
				String toAdd = row.concat(Integer.toString(col));
				newLoc.add(toAdd);
				//System.out.print(toAdd + " ");
			}
			//System.out.print("\n");
		}

		//return the new location
		return newLoc;
	}
}
