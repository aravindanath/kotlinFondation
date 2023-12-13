public class X {

    public static void main(String[] args) {

       System.out.println( charCheck("Amazon"));

    }

  static   boolean charCheck(String str) {

        Boolean result = false;

        for(Character ch :str.toCharArray()){
            if(ch.toString().equalsIgnoreCase("a") && ch.toString().equalsIgnoreCase("z")){
                System.out.println(ch);
                result  = true;
            }
        }

    return result;
    }
}
