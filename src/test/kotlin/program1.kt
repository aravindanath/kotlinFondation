import java.util.Scanner

fun main(){

    leapYear()

}

fun evenOdd(x: Int){
    if(x == 0){
        return
    }else if(x % 2 == 0){
        println("$x is even number")
    }else{
        println("$x is odd number")
    }

}

fun evenOdd_1(x: Int){
    if(x == 0)return else if(x % 2 == 0)println("$x is even number") else println("$x is odd number")
}

fun countDigits(word: String): Int{
    var i: Int = 0
    var j: String = ""
    for (x in word){
        if(x.isDigit()){
            i=i+x.digitToInt()
        }else{
            j=j+x
        }
    }

    println("Sum $i ")
    return i
}


fun evenOdd_1(){
    println("Enter a number")
    var reader = Scanner(System.`in`)
    var x = reader.nextInt()
    if(x == 0)return else if(x % 2 == 0)println("$x is even number") else println("$x is odd number")
}

fun leapYear() {
    println("Enter a Year")
    var reader = Scanner(System.`in`)
    var year = reader.nextInt()
    var leap = false
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false


    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}
