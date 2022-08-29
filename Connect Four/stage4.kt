/*
Description

Now, it is time to implement the winning condition. 
A player wins when they place four discs of the same color in a row horizontally, vertically, or diagonally. 
After each move, the program checks if the condition is met. Also, if the board is full and the win condition isn't fulfilled, claim it a draw.


Objectives

In addition to what we have added before, your program should do the following:

    Check the board for the winning condition. If a player wins, output Player <Player's name> won;
    If the board is full, but neither of the players has won, print It is a draw;
    Regardless of whether it is a draw or somebody's victory, print Game Over! and terminate the program.

Examples

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: the first player wins by placing four discs in a horizontal row

Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x8
Paul VS Joanne
6 X 8 board
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║ ║ ║ ║ ║ ║ ║
║ ║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║ ║ ║ ║ ║ ║ ║
║ ║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║ ║ ║ ║ ║ ║
║ ║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║ ║ ║ ║ ║ ║
║ ║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║*║ ║ ║ ║ ║
║ ║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║*║ ║ ║ ║ ║
║ ║ο║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Player Paul won
Game over!

Example 2: the second player wins by placing four discs in a vertical row

Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x7
Paul VS Joanne
5 X 7 board
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ο║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ο║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Joanne won
Game over!

Example 3: the first player wins by placing four discs in a diagonal row

Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7x7
Paul VS Joanne
7 X 7 board
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║
║ ║ ║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║*║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Paul won
Game over!

Example 4: a draw

Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5 X 5
Paul VS Joanne
5 X 5 board
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
It is a draw
Game over!

Example 5: plain text board

Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x7
Paul VS Joanne
6 X 7 board
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
===============
Joanne's turn:
> 6
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | |*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | |*|o|
===============
Joanne's turn:
> 5
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | |*|*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | | |*|*|o|
===============
Joanne's turn:
> 4
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | |*|*|*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | | | | |o|
| | | |*|*|*|o|
===============
Player Paul won
Game over!
*/

package connectfour

var ROW = 6
var COL = 7

fun getRowFromInput(input: String): Int {
    return input.split("x", "X").first().trim().toInt()
}

fun getColFromInput(input: String): Int {
    return input.split("x", "X").last().trim().toInt()
}

fun isInRange(x: Int): Boolean {
    return x in 5..9
}

fun isBoardFull(row: Int, col: Int, board: MutableList<MutableList<String>>): Boolean {
    for (i in 0 until row) {
        for (j in 0 until col) {
            if (board[i][j] == " ") {
                return false
            }
        }
    }
    return true
}

fun checkVerAndHor(
    row: Int, col: Int, sign: String, board: MutableList<MutableList<String>>, isVertical: Boolean
): Boolean {
    val rowRange = if (isVertical) row - 4 else row - 1
    val colRange = if (isVertical) col - 1 else col - 4

    for (i in 0..if (isVertical) colRange else rowRange) {
        for (j in 0..if (isVertical) rowRange else colRange) {
            var cnt = 0
            for (k in 0..3) {
                if (isVertical && board[j + k][i] == sign) {
                    cnt++
                } else if (!isVertical && board[i][j + k] == sign) {
                    cnt++
                }
            }
            if (cnt == 4) {
                return true
            }
        }
    }
    return false
}

fun isValid(row: Int, col: Int, x: Int, y: Int): Boolean {
    return x in 0 until row && y in 0 until col
}

fun checkDiagonally(
    row: Int, col: Int, sign: String, leftRightDir: Boolean, board: MutableList<MutableList<String>>
): Boolean {
    for (i in if (leftRightDir) 0 until row else row - 1 downTo 0) {
        for (j in if (leftRightDir) 0 until col else col - 1 downTo 0) {
            var cnt = 0
            for (k in 0..3) {
                val x = if (leftRightDir) i + k else i + k
                val y = if (leftRightDir) j + k else j - k

                if (isValid(row, col, x, y) && board[x][y] == sign) {
                    cnt++
                } else {
                    break
                }
            }
            if (cnt == 4) {
                return true
            }
        }
    }
    return false
}

fun isPlayerWon(
    row: Int, col: Int, sign: String, board: MutableList<MutableList<String>>
): Boolean {
    // Check vertically and horizontally
    if (checkVerAndHor(row, col, sign, board, true) || checkVerAndHor(
            row, col, sign, board, false
        ) || checkDiagonally(row, col, sign, true, board) || checkDiagonally(row, col, sign, false, board)
    ) {
        return true
    }

    return false
}

fun printBoard(row: Int, col: Int, board: MutableList<MutableList<String>>) {
    print(" ")
    println((1..col).joinToString(separator = " "))

    for (i in 1..row) {
        for (j in 1..col) {
            print("|${board[i - 1][j - 1]}")
        }
        println("|")
    }

    repeat((2 * col).toInt()) {
        print("=")
    }
    println("=")
}

fun inputRowAndCol(){
    var correctDim = false

    while (!correctDim) {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 x 7)")

        val input = readln()
        if (input != "") {
            try {
                ROW = getRowFromInput(input)
                COL = getColFromInput(input)

                when {
                    !isInRange(ROW) -> println("Board rows should be from 5 to 9")
                    !isInRange(COL) -> println("Board columns should be from 5 to 9")
                    else -> correctDim = true
                }
            } catch (e: Exception) {
                println("Invalid input")
            }
        } else {
            ROW = 6
            COL = 7
            correctDim = true
        }
    }
}

fun main() {
    println("Connect Four")
    println("First player's name:")
    val player1 = readln()

    println("Second player's name:")
    val player2 = readln()

    inputRowAndCol()

    println("$player1 VS $player2")
    println("$ROW X $COL board")
    var board = mutableListOf<MutableList<String>>()
    repeat(ROW) {
        board.add(MutableList<String>(COL) { " " })
    }

    printBoard(ROW, COL, board)

    var turn = true
    var input = ""
    outer@ while (true) {
        if (turn) {
            // first player
            println("$player1's turn:")
        } else {
            // second player
            println("$player2's turn:")
        }

        try {
            input = readln()
            var block: Int? = null
            if (input == "end") {
                break
            } else {
                block = input.toInt()
            }

            if (block in 1..COL) {
                var emptyBlockFound = false

                for (i in ROW - 1 downTo 0) {
                    if (board[i][block - 1] == " ") {
                        emptyBlockFound = true
                        board[i][block - 1] = if (turn) "o" else "*"
                        printBoard(ROW, COL, board)

                        if (isPlayerWon(ROW, COL, if (turn) "o" else "*", board)) {
                            println("Player ${if (turn) player1 else player2} won")
                            break@outer
                        }

                        turn = !turn
                        break
                    }
                }

                if (!emptyBlockFound) {
                    println("Column $block is full")
                }

                if (isBoardFull(ROW, COL, board)) {
                    println("It is a draw")
                    break@outer
                }

            } else {
                println("The column number is out of range (1 - $COL)")
            }

        } catch (e: Exception) {
            println("Incorrect column number")
        }
    }
    println("Game over!")
}
