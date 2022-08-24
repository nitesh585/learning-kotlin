/*
Description

Players use red and yellow colored discs in the "hardware" version of the game. 
In this project, we are going to substitute them with o and * characters. The o is for the first player.

Each player inputs a column number one after another. 
The program must read the input and print the appropriate character ( o or *) on the first available position at the bottom of that column. 
If the user input isn't correct, print the appropriate message and ask for a new one (see Examples). 
The program should also check whether a column is full or not. If it is, no more discs can be added to it.

If players input end instead of a column number, terminate the program and print the respective message.


Objectives

In addition to the functionality from the previous stage, your game should perform the following:

    Ask each player to input a column number by prompting <First player's name>'s turn: or <Second player's name>'s turn:. 
    Read the column number and print o or * on the first available position of that column. 
    The first player is o; the second player is *. If either player inputs end, terminate the program and print Game over! (see Example 1).
    If the input contains an integer number outside the scope of available columns, warn the players with the The column number is out of range (1 - <Max column number>) message and ask for it once again. 
    If players' input doesn't contain an integer, warn the players with Incorrect column number and ask for it once again (see Example 2).
    If the column is full, print the following message Column <Column number> is full and ask to input another column number (see Example 2).



Examples

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: normal execution

Connect Four
First player's name:
> Mia
Second player's name:
> Bill
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x8
Mia VS Bill
6 X 8 board
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 7
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ο║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 8
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ο║*║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 8
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ο║
║ ║ ║ ║ο║ο║ ║ο║*║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║ο║
║*║ ║ ║ο║ο║ ║ο║*║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> end
Game over!

Example 2: warning messages

Connect Four
First player's name:
> Mia
Second player's name:
> Bill
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7 x 8
Mia VS Bill
7 X 8 board
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 0
The column number is out of range (1 - 8)
Mia's turn:
> 9
The column number is out of range (1 - 8)
Mia's turn:
> a12
Incorrect column number
Mia's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Mia's turn:
> 1
 1 2 3 4 5 6 7 8
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Bill's turn:
> 1
Column 1 is full
Bill's turn:
> end
Game over!

Example 3: plain text example

Connect Four
First player's name:
> Mia
Second player's name:
> Bill
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x7
Mia VS Bill
5 X 7 board
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
===============
Mia's turn:
> 2
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| |o| | | | | |
===============
Bill's turn:
> 3
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| |o|*| | | | |
===============
Mia's turn:
> 2
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| |o| | | | | |
| |o|*| | | | |
===============
Bill's turn:
> 2
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| |*| | | | | |
| |o| | | | | |
| |o|*| | | | |
===============
Mia's turn:
> 1
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| |*| | | | | |
| |o| | | | | |
|o|o|*| | | | |
===============
Bill's turn:
> 4
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| |*| | | | | |
| |o| | | | | |
|o|o|*|*| | | |
===============
Mia's turn:
> end
Game over!
*/


package connectfour
import kotlin.math.ceil

fun getRowFromInput(input: String): Int {
    return input.split("x", "X").first().trim().toInt()
}

fun getColFromInput(input: String): Int {
    return input.split("x", "X").last().trim().toInt()
}

fun isInRange(x: Int): Boolean {
    return x in 5..9
}

fun printBoard(row:Int, col:Int, board:MutableList<MutableList<String>>){
    print(" ")
    println((1..col).joinToString( separator = " "))

    for(i in 1..row){
        for(j in 1..col){
            print("|${board[i-1][j-1]}")
        }
        println("|")
    }

    repeat( (2*col).toInt()){
        print("=")
    }
    println("=")
}

fun main() {
    println("Connect Four")
    println("First player's name:")
    val player1 = readln()

    println("Second player's name:")
    val player2 = readln()

    var row = 6
    var col = 7
    var correctDim = false

    while (!correctDim) {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 x 7)")

        val input = readln()
        if (input != "") {
            try {
                row = getRowFromInput(input)
                col = getColFromInput(input)

                when {
                    !isInRange(row) -> println("Board rows should be from 5 to 9")
                    !isInRange(col) -> println("Board columns should be from 5 to 9")
                    else -> correctDim = true
                }
            } catch (e: Exception) {
                println("Invalid input")
            }
        } else {
            row = 6
            col = 7
            correctDim = true
        }
    }

    println("$player1 VS $player2")
    println("$row X $col board")
    var board = mutableListOf<MutableList<String>>()
    repeat(row){
        board.add(MutableList<String>(col){" "})
    }

    printBoard(row, col, board)

    var turn = true
    var input = ""
    while(true){
        if(turn){
            // first player
            println("$player1's turn:")
        }else{
            // second player
            println("$player2's turn:")
        }

        try {
            input = readln()
            var block :Int ?= null
            if(input == "end"){
                break
            }else{
                block = input.toInt()
            }

            if(block in 1..col){
                var emptyBlockFound = false

                for(i in row-1 downTo 0){
                    if(board[i][block-1] == " "){
                        emptyBlockFound = true
                        board[i][block-1] =  if (turn) "o" else "*"
                        turn = !turn
                        printBoard(row, col, board)
                        break
                    }
                }

                if(!emptyBlockFound){
                    println("Column $block is full")
                }

            }else{
                println("The column number is out of range (1 - $col)")
            }

        }catch (e:Exception){
            println("Incorrect column number")
        }
    }
    println("Game over!")
}
