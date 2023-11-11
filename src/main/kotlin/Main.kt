//list to store notes
val notes = mutableListOf<String>()

//function that will get and add notes from the user to the notes list
fun getNote() {
    println("Please enter your note.")
    val note = readLine()
    println("Add Note: ${notes.add("$note")}")
    println("Notes: $notes")
}

//main function will run the program.
fun main() {
    //menu options
    var options = arrayOf("Write Note", "Delete Note", "View Notes")
    println("1. ${options[0]}")
    println("2. ${options[1]}")
    println("3. ${options[2]}")
    println("Please enter an option (eg. 1,2, or 3)")
    //receives input from user on which option they want.
    val choice = readLine()!!.toInt()

    //if-else statement to run the program based on the user's menu choice.
    if (choice == 1) {
        getNote()
        println("Would you like to return to the menu?")
        val returnToMenu = readLine()

        //while loop for if the user wants to return to the menu.
        while (returnToMenu == "yes") {
            var options = arrayOf("Write Note", "Delete Note", "View Notes")

            //repeat menu options
            println("1. ${options[0]}")
            println("2. ${options[1]}")
            println("3. ${options[2]}")
            println("Please enter an option (eg. 1,2, or 3)")
            val choice = readLine()!!.toInt()

            //repeat if-else statement within while loop
            if (choice == 1) {
                getNote()
                println("Would you like to return to the menu?")
                val returnToMenu = readLine()
            } else if (choice == 2) {
                println("Please enter the number of the note you want to delete.")
                val delete = readLine()!!.toInt()
                val noteToDelete: Int = delete - 1
                // have to subtract 1 from user input to get correct index
                println("delete Note: ${notes.removeAt(noteToDelete)}")
                println("Would you like to return to the menu?")
                val returnToMenu = readLine()
            } else {
                println("Notes: $notes")
                println("Would you like to return to the menu?")
                val returnToMenu = readLine()
            }
        }
    // choice two from the menu option. It will delete the note that you want deleted.
    } else if (choice == 2) {
            println("Please enter the number of the note you want to delete.")
            val delete = readLine()!!.toInt()
            val noteToDelete: Int = delete - 1
        // have to subtract 1 from user input to get correct index
            println("delete Note: ${notes.removeAt(noteToDelete)}")
            println("Would you like to return to the menu? (yes/no")
            val returnToMenu = readLine()

            //while loop if the user wants to return to the menu
            while (returnToMenu == "yes") {
                var options = arrayOf("Write Note", "Delete Note", "View Notes")
                println("1. ${options[0]}")
                println("2. ${options[1]}")
                println("3. ${options[2]}")
                println("Please enter an option (eg. 1,2, or 3)")
                val choice = readLine()!!.toInt()

                if (choice == 1) {
                    getNote()
                    println("Would you like to return to the menu?")
                    val returnToMenu = readLine()
                } else if (choice == 2) {
                    println("Please enter the number of the note you want to delete.")
                    val delete = readLine()!!.toInt()
                    val noteToDelete: Int = delete - 1
                    // have to subtract 1 from user input to get correct index
                    println("delete Note: ${notes.removeAt(noteToDelete)}")
                    println("Would you like to return to the menu?")
                    val returnToMenu = readLine()
                } else {
                    println("Notes: $notes")
                    println("Would you like to return to the menu?")
                    val returnToMenu = readLine()
                }
            }
    //else will handle choice three and print out the notes within the notes list
    } else {
        println("Notes: $notes")
        println("Thank for using the program!")
    }
}