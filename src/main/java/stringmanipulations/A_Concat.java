package stringmanipulations;

public class A_Concat {
    public static void main(String[] args) {

        //"+" işaretiyle yaptığımız birleştirmeyi concat() methodu ile de yapabiliriz

        String s = "Öğreten öğrenir";

        System.out.println(s.concat(" tamam mı?")); //Öğreten öğrenir tamam mı?

        System.out.println(s.concat(" 5")); //Öğreten öğrenir5

        //yan yana ekler tek bir String haline getirir

        //geçici değişiklik yapar, orijinal String değişmez
        System.out.println(s); //Öğreten öğrenir

        //
    }
}
