fun main(){

    printRange('a'..'h')
}

fun printRange(start: Int, end: Int){
    for(i in start..end){
        print("$i \t")
    }
}

fun printRange(range: CharRange){
    for(i in range){
        print("$i \t")
    }
}