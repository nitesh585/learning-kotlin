/*
Description

Running a cinema theatre is no easy business. To help our friends, let's add statistics to your program. The stats will show the current income, total income, the number of available seats, and the percentage of occupancy.

In addition, our friends asked you to take care of a small inconvenience: it's not good when a user can buy a ticket that has already been purchased by another user. Let's fix this!


Objectives

Now your menu should look like this:

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit

When the item Statistics is chosen, your program should print the following information:

    The number of purchased tickets;
    The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
    Current income;
    The total income that shows how much money the theatre will get if all the tickets are sold.

The rest of the menu items should work the same way as before, except the item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print That ticket has already been purchased! and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print Wrong input! and ask to enter different seat coordinates until the user picks an available seat.

Please note that you need to output percentages with 2 digits after the separator. For this output, you can do this:

val percentage = 0.0
val formatPercentage = "%.2f".format(percentage)
print(formatPercentage) // 0.00


Examples

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0
*/

package cinema

var purchasedTicket = 0
var currentIncome = 0
var totalIncome = 0

fun printSeats(col: Int, seatsLst: MutableList<MutableList<String>>) {
    println("\nCinema:")
    print("  ")
    for (i in 1..col) {
        print(i)
        print(" ")
    }
    println()
    for (i in seatsLst.indices) {
        print(i + 1)
        print(" ")
        for (seat in seatsLst[i]) {
            print(seat)
            print(" ")
        }
        println()
    }
}

fun bookTicket(row: Int, col: Int, x: Int, y: Int, seatsLst: MutableList<MutableList<String>>) {
    var price = 0
    val seats = row * col

    if (seats < 60) {
        price = 10
    } else {
        val halfRow = row / 2
        if (halfRow >= x) {
            price = 10
        } else {
            price = 8
        }
    }

    println("Ticket price: $" + price)
    currentIncome += price
    seatsLst[x - 1][y - 1] = "B"
}

fun statistics(row: Int, col: Int) {
    println("Number of purchased tickets: $purchasedTicket")

    var seats: Double = row.toDouble() * col.toDouble()

    val percentage = (purchasedTicket.toDouble() / seats) * 100.0
    val formatPercentage = "%.2f".format(percentage)
    println("Percentage: $formatPercentage%")

    print("Current income: $")
    println(currentIncome)

    print("Total income: $")
    println(totalIncome)
}

fun main() {
    println("Enter the number of rows:")
    val row = readln().toInt()
    println("Enter the number of seats in each row:")
    val col = readln().toInt()

    val seats = row * col

    if (seats < 60) {
        totalIncome = 10 * seats
    } else {
        val halfRow = row / 2
        totalIncome = 10 * halfRow * col + 8 * (row - halfRow) * col
    }

    val seatsLst = mutableListOf<MutableList<String>>()
    repeat(row) {
        seatsLst.add(MutableList(col) { "S" })
    }

    while (true) {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        val op = readln().toInt()

        when {
            op == 1 -> printSeats(col, seatsLst)
            op == 2 -> {
                var notBooked = true

                while (notBooked) {
                    println("Enter a row number:")
                    val x = readln().toInt()
                    println("Enter a seat number in that row:")
                    val y = readln().toInt()

                    try {
                        if (seatsLst[x - 1][y - 1] == "B") {
                            println("That ticket has already been purchased!")
                        } else {
                            bookTicket(row, col, x, y, seatsLst)
                            notBooked = false
                            purchasedTicket++
                        }
                    } catch (e: Exception) {
                        println("Wrong input!")
                    }
                }

            }
            op == 3 -> statistics(row, col)
            op == 0 -> break
        }
    }
}

