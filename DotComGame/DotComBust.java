/**********************************************************
Description
----------------
This class retrieves the user input and assigns locations to each DotCom

Variables
----------------
helper (GameHelper) - GameHelper class
dotComsList (DotCom array list) - An array list of DotComs
userHitList (string array list) - An array list of the user guesses that were hits
userMissList (string array list) - An array list of the user guesses that were misses
numOfGuesses (int) - Number of user guesses.

Methods
----------------
setUpGame - Set up DotCom game
startPlaying - Loop till the player finds all the DotComs
checkUserGuess - Check if the user guess is a hit or miss
finishGame - Print final game comments
addToUserGuessList - Add the new user guess to the hit or miss list if valid guess
printUserGuessList - Print the user hits and misses
printGrid - Print the current state of the grid
main - Set up game and start playing
**********************************************************/
import java.util.*;

public class DotComBust {
	
	//Initialize variables
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private ArrayList<String> userHitList = new ArrayList<String>();
	private ArrayList<String> userMissList = new ArrayList<String>();
	private int numOfGuesses = 0;

	/**********************************************************
	Description
	----------------
	Set up each DotCom with a location and name.
	Store each DotCom into the dotComList.

	Variables
	----------------
	one (DotCom) - A DotCom
	two (DotCom) - A DotCom
	three (DotCom) - A DotCom
	**********************************************************/
	private void setUpGame() {
		
		//Make 3 DotCom objects and give each one a name
		DotCom one = new DotCom();
		one.setName("pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("go2.com");

		//Store each DotCom into the ArrayList
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		//print instructions for user
		System.out.println("=======================================================");
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("pets.com, eToys.com, go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		System.out.println("=======================================================");

		//for each DotCom in dotComList generate a location for it and set the location
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	/**********************************************************
	Description
	----------------
	While there are still DotComs on the board (present) loop.
	Ask for user guess and check.
	When all the DotComs are hit finish the game.

	Variables
	----------------
	userGuess (string) - The user guess
	**********************************************************/
	private void startPlaying() {

		//while there is a dotCom that has not been hit ask for a guess and check
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			//addToUserGuessList(userGuess);
			checkUserGuess(userGuess);
		}

		//print final game information
		finishGame();
	}

	/**********************************************************
	Description
	----------------
	Check if the user guess is a hit or a miss or a kill for each DotCom
	Add the user guess to the userHitList or userMissList
	Print the grid

	Parameters
	----------------
	userGuess (string) - the user guess

	Variables
	----------------
	result (string) - The result of the user guess (miss, hit, kill)
	**********************************************************/
	private void checkUserGuess(String userGuess) {

		//increment the number of guesses
		numOfGuesses++;

		//default result to miss
		String result = "miss";

		//for each location of the dotCom that has not been hit
		//check result of user guess
		//break if hit or kill (remove dotCom from list of kill)
		for (int x = 0; x < dotComsList.size(); x++) {
			result = dotComsList.get(x).checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(x);
				break;
			}
		}

		//print result
		if (!result.equals("kill")) { System.out.println(result); }

		addToUserGuessList(userGuess, result);
		printGrid();
	}

	/**********************************************************
	Description
	----------------
	Print final output
	**********************************************************/
	private void finishGame() {

		System.out.println("==============================");
		System.out.println("All Dot Coms are dead!");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
		}
		else {
			System.out.println("Took you long enought. " + numOfGuesses + " guesses.");
		}
		System.out.println("==============================");
		//printUserGuessList();
	}

	/**********************************************************
	Description
	----------------
	Add the user guess the hit or miss list if
	it is a valid guess and 
	it is not already present in a list

	Parameters
	----------------
	userGuess (string) - The user guess
	result (string) - The result of the guess (miss, hit, kill)

	Variables
	----------------
	alphabet (string) - A string with the letters representing the rows
	**********************************************************/
	private void addToUserGuessList(String userGuess, String result) {
		String alphabet = "abcdefg";
		int col = -1, row = 0;
		if (userGuess.length() == 2) {
			String s = String.valueOf(userGuess.charAt(0)).toLowerCase();
			col = Character.getNumericValue(userGuess.charAt(1));
			row = alphabet.indexOf(s);
			//int pos = row*7+col;
			//System.out.println("==> col=" + col + " row=" + row + " pos=" + pos);
			if (!userHitList.contains(userGuess) && !userMissList.contains(userGuess)) {
				if (col <= 6 && col >= 0 && alphabet.indexOf(s) >= 0) {
					if (result.equals("miss")) {
						userMissList.add(userGuess);
					}
					else {
						userHitList.add(userGuess);
					}
				}
			}
		}
	}

	/**********************************************************
	Description
	----------------
	Print the user miss and hit guess list.
	**********************************************************/
	private void printUserGuessList() {
		for (String s : userHitList) {
			System.out.print(s + " ");
		}
		System.out.print("\n");
		for (String s : userMissList) {
			System.out.print(s + " ");
		}
		System.out.print("\n");
	}

	/**********************************************************
	Description
	----------------
	Print the current state of the grid

	Variables
	----------------
	alphabet (string) - A string with the letters representing the rows
	**********************************************************/
	private void printGrid() {
		String alphabet = "abcdefg";

		System.out.println("     0   1   2   3   4   5   6 ");
		System.out.println("    ---------------------------");
		
		for (int i = 0; i < 7; i++) {
			String col = String.valueOf(alphabet.charAt(i));
			System.out.print(" " + col + " |");
			for (int j = 0; j < 7; j++) {
				String pos = col.concat(Integer.toString(j));
				//System.out.print(pos);
				if (userHitList.contains(pos)) {
					System.out.print(" O ");
				}
				else if (userMissList.contains(pos)) {
					System.out.print(" X ");
				}
				else {
					System.out.print("   ");
				}
				System.out.print("|");
			}
			System.out.print("\n");
			System.out.println("    ---------------------------");
		}
	}

	/**********************************************************
	Description
	----------------
	Create a game object, set up the game, and play the game.

	Variables
	----------------
	game (string) - DotComBust object
	**********************************************************/
	public static void main(String [] args) {

		//create game object
		DotComBust game = new DotComBust();

		//set up game
		game.setUpGame();

		//play game
		game.startPlaying();
	}
}
