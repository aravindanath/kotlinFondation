package Day1

import java.text.SimpleDateFormat
import java.util.*

/**
 *  Display current date and time
 */
fun main(){

   val currentDate = Date()
    val dateFormat = SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.CHINESE)
    println(dateFormat.format(currentDate))
}