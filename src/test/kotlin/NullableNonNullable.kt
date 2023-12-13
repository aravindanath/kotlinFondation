fun main(){
    var name = "Arvind"
    var lastName: String? = null
    var fullName: String? = name+lastName
    var number: Int? = 890
    var fn = name ?: lastName // Evlis
    var mobile = number!!
    println(fullName)
    println(fn)
    println(mobile)


}