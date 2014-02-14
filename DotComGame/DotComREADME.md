DotCom Game
===

#### Goal ####

Sink all of the computer's Dot Coms in the fewest numbers of guesses.  You're given a rating level based on how well you perform.

#### Setup ####

When the game program is launched, the computer places three Dot Coms, randomly, on the virtual 7 x 7 grid.  When that's complete, the game asks for your first guess.

#### How to play ####

This is a command line interface.  The computer will prompt the user to enter a guess (a cell).  The user enters a cell ("A3", C4", etc.).  In response to the guess a response of "hit", "miss", or "kill" will be displayed to the user.  When all three DotComs have been killed the game ends by printing the result (number of guesses).

- - -

My Comments
---

This is a game from chapter 5 and 6 of Head First Java.  Most of the code is from the book.  I did make improvements and changes to some of the program.

##### Change #####

* I updated the placeDotCom method in the GameHelper class.  I did not like how the position was being generated and altered it a bit.

##### Addition #####

* I added the userHitList and userMissList arrayLists that contain all the valid user guesses.

* I added the printGrid method in the DotComBust class.  This method prints the current state of the grid as a visual representation of the game.  I use the userHitList and userMissList to generate this gird.

> O = hit
> X = miss
>
>     0   1   2   3   4   5   6 
>    ---------------------------
> a | X |   |   | X |   |   | X |
>    ---------------------------
> b |   | O | O | O |   | X |   |
>    ---------------------------
> c |   | X |   |   | X |   |   |
>    ---------------------------
> d | X |   |   | O |   | X | O |
>    ---------------------------
> e |   |   |   | O |   |   | O |
>    ---------------------------
> f |   |   |   | O |   |   | O |
>    ---------------------------
> g |   |   |   |   |   |   |   |
>    ---------------------------
>