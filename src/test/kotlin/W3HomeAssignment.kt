import java.util.Scanner

fun getDayType(): String {
    println("Enter day")
    var read = Scanner(System.`in`)
    var dayType = read.next()
    return when (dayType) {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "It's a weekday."
        "Saturday", "Sunday" -> "It's a Weekend'"
        else -> "It's Invalid'"
    }

}


fun factorial(n: Int): Int {

    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}


fun p1(x: Int, y: Int): Boolean {

    var result = false
    var res = x + y
    if (res % 4 == 0) {
        result = true
    } else {
        result = false
    }
    return result
}

fun findOfChar(s: String): Boolean {
    var aHas = false
    var zHas = false

    for (x in s) {
        if (x.equals('a')) {
            aHas = true

        } else if (x.equals('z')) {
            zHas = true
        }
        if (aHas && zHas) return true
    }

    return false
}

fun accountCreation(): String {

    var email = "aravind@gmail.com"
    var password = "password$123"
    var name = "aravindanath"

    var message = if (email.isEmpty() || password.isEmpty() || name.isEmpty()) {
        "you must fill your data"
    } else if (name.length < 6) {
        "Name to be atleast 6 char long"
    } else if (password.length < 6) {
        "Password to be atleast 6 char long"
    } else if (!email.contains("@") || !email.contains(".")) {
        "Invalid  Email format "
    } else {
        "Successfully registered"
    }


    return message
}

/**
 *  *

 */

fun getGrade(grade: Int): String {

    var result = if (grade < 59) {

        "F"

    } else if (grade > 59 && grade <= 69) {
        "D"
    } else if (grade > 69 && grade <= 79) {
        "C"
    } else if (grade > 79 && grade <= 89) {
        "B"
    } else if (grade > 89 && grade <= 100) {
        "A"
    } else {
        "Enter marks between 0-100"
    }

    return result;
}

fun printMultiples(num: Int, limit: Int) {

    var x = limit / num

    for (z in 1..x) {
        println(num * z)

    }

}

fun nullAbleInteger(num: Int) {
    var result = if (num == 0) {
         0
    } else if (num >= 1) {
        num * 2
    }
    else {
        "Enter a some value"
    }
    println("Result: " + result)
}


fun main() {
    nullAbleInteger(0)
}