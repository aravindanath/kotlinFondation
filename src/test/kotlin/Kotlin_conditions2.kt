
import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(){
//
//    var num = -10
//
//   var result =  if(num<0)"Negative number" else "Possitive number"
//
//
//    println(result)
   calculator2()

}

fun minMax(){

    var x = 10
    var y = 20

    var result = if(x>y){
        println("$x is larger than $y.")
        println("max variable holds value of x.")
        x
    } else {
        println("$y is larger than $x.")
        println("max variable holds value of y.")
        y
    }

    println("Max: $result")

}

fun calculator(a: Int, b: Int): Comparable<*> {

    println("Enter operator either +, - ,* ,/ ,%")
    val operator = readLine()
   val result =   when(operator){
       "+" -> a + b
       "-" -> a - b
       "*" -> a * b
       "/" -> a / b
       "%" -> a % b
       else -> ("$operator operator is invalid")
    }
    return result
}

fun calculator2()  {

   println("Enter operator either *,-, +,/")
    var operator = readLine()
    val read = Scanner(System.`in`)
    println("Enter 1st Input:")
    var x:Int =  read.nextInt()
    println("Enter 2nd Input:")
    var y = read. nextInt()

    var result = when(operator){
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> x / y

        else -> println("$operator is invalid")
    }
    println("Result: $result")
}

