fun main(){

    findoutCentury(1890)


}
 
fun findoutCentury(year: Int): String {
    var twentyfirstCent = 2001 .. 2100
    var twentyCentury = 1901 .. 2000
    var ninteenCen = 1801 .. 1900

  var result =  when(year) {
           in twentyfirstCent -> "twenty first Cent"
           in twentyCentury -> "twenty  Cent"
           in ninteenCen -> "Ninteen Cent"
      else -> {
          "Enter year"
      }
  }
    println(result)
    return result
}