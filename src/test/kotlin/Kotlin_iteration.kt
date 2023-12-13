fun main(){
    iteration_Reverse()
}

fun iteration1(){
    var myRange = 10..100
    for(i in myRange step 10){
        println(i)
    }
}

fun iteration_Reverse(){
    var myRange = 10..100
    for(i in myRange.reversed() step 10){
        println(i)
    }
}