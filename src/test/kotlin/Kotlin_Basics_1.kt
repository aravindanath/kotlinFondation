

fun main(){
    var creditcard = Triple("123452345134","007","Visa")
    var bankAccount = Pair(16000, creditcard)
    var (balance) = bankAccount
    var (cardNumber,cardType) = creditcard
    println("The account has $balance with the cardnumber:  $cardNumber and the card type: $cardType,security code: ****")
}