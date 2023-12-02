package stringmanipulations;

public class K_IsEmpty {
    public static void main(String[] args) {
        //isEmpty() --> boş mu?
        //boolean döndürür --> true ya da false

        String s = "Tekrar et unutma";
        System.out.println(s.isEmpty()); //false

        System.out.println("".isEmpty()); //true

        //isEmpty() methodundan true alıyorsak, o String'in içinde hiçbir şey yok demektir
        //yani String'in length'i 0 demektir
        //isEmpty() --> true == length() --> 0
    }
}
