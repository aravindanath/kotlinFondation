fun main(){

    var password: String? = null
    var passwordLength = password?.length?:0

   var message =  if(passwordLength == 0 ){
        "Password cannot be empty"
    }else if(passwordLength in 1 .. 6 ){
        "Password is week"
    }else if(passwordLength in 6..10 ){
        "Password id medium strenght"
   }else if(passwordLength in 11..15){
       "Password id strong"
   }else{
       "Enter password"
   }

    println(message)
}

