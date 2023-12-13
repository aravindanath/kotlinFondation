
fun name(firstName: String?, lastName: String?): String {
    var fullName: String? = firstName+lastName
    var fn = fullName ?: lastName // Evlis
    return "$fn"
}

fun main() {
    println(name("Aadvik","Sharma"))
}