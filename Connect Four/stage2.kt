/*
Description

In this stage, you need to draw the game board by using the ║, ╚, ═, ╩, ╝ box-drawing characters. 
You can find more information about these characters in the corresponding Wikipedia article, but you can also simply copy them.

Construct a board in the manner shown in the following example for a 7x8 board:

Print the column number above each respective column and use the above-mentioned box-drawing characters for creating the board lines. 
You can find more board types in the Examples section.

There is the possibility, due to a known issue, that the ║, ╚, ═, ╩, ╝ box-drawing characters can't be correctly printed at the console output. 
Instead the ? character is printed for each of them. 
If this situation arises, then implement the board by using the plain text | and = plain text characters as following. 
Either case will be accepted as a valid solution. 
Also, a plain text board example is available at each stage.

The board size can vary, so your program should adapt to any possible size.


Objectives

    Draw and print the board set by users according to the procedure above;
    Print the column numbers on the board. Mind the spaces between characters.



Examples

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: printing the board

Connect Four
First player's name:
> Sophia
Second player's name:
> John
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 8 x 8
Sophia VS John
8 X 8 board
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝

Example 2: the default size board

Connect Four
First player's name:
> Sophia
Second player's name:
> John
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
>
Sophia VS John
6 X 7 board
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝

Example 3: plain text board

Connect Four
First player's name:
> Sophia
Second player's name:
> John
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7 x 8
Sophia VS John
7 X 8 board
 1 2 3 4 5 6 7 8
| | | | | | | | |
| | | | | | | | |
| | | | | | | | |
| | | | | | | | |
| | | | | | | | |
| | | | | | | | |
| | | | | | | | |
=================

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

fun printBoard(row:Int, col:Int){
    print(" ")
    println((1..col).joinToString( separator = " "))

    repeat(row) {
        repeat(col) {
            print("| ")
        }
        println("| ")
    }
    repeat( (2*col).toInt()){
        print("=")
    }
    print("=")
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
    printBoard(row, col)
}
