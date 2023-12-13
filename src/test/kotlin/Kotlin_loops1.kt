fun main() {

    whileLoopAssignment()
}

fun whileLoop() {
    var counter = 1

    while (counter < 10) {
        println(counter)
        counter += 1
    }
    counter = 1
    println("counter is up against $counter")
}

fun doWhileLoop() {
    var counter = 1
    do {

        println(counter)
        counter += 1
    } while (counter < 10)


}

fun whileLoopAssignment() {
    var counter = 10
    while (counter >= 1) {

        println(counter)

        counter -= 1;
    }
    println("Blast off")
}