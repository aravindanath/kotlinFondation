fun loop1(){
    var numRange = 1..10
    for (i in numRange){
        println(i)
    }
}

fun loop2(){
    var numRange = 1 until 10
    for (i in numRange){
        print(i)
    }
}

fun loop3(){
    for(i in 10 downTo 1){
        println(i)
    }
}

fun loopchallange1(){
    var numRange = 1..20
    for(i in numRange){
        println(i)
    }
}
fun loopchallange2(){
    var numRange = 1..20 step 3
    for(i in numRange){
        println(i)
    }
}

fun loopchallange3(){
    var numRange = 15 downTo 1 step 2
    for(i in numRange){
        println(i)
    }
}

fun main(){
    loopchallange3()


}

