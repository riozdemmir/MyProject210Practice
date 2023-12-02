package stringmanipulations;

import java.util.Scanner;

public class M_ReplaceAll {
    public static void main(String[] args) {
        //replaceAll() --> tamamına yerleştir
        //Regex (Regular Expression) --> düzenli ifade
        //INTERVİEW SORUSU!!!
        //Regex ne demek? ---> Regular Expression demek
        //replace() ile spesifik karakterleri değiştirebiliyoruz
        //replaceAll() belli türdeki karakterleri seçebilmemize yarar
        //replaceAll() methoduna regex'leri kullanabilmek için ihtiyaç duyuyoruz

         /*
        Meshur Regex'ler: Bir grup data'yi almak icin kullanilir

            1) Tum rakamlar ==> [0-9]
            2) Tum kucuk harfler ==> [a-z]
            3) Tum buyuk harfler ==> [A-Z]
            4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
            5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
            6) Tum noktalama isaretleri ==> \\p{Punct}
            7) Tum sesli harfler ==> [aeiouAEIOU]
               Tum a, x, y harfleri ==> [axy]
               a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
            8) Tum küçük harfler haric: ==> [^a-z]
            9) Tum harfler haric ==> [^a-zA-Z]

        Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
            Sadece space karakteri    : \\s
            Space karakteri haric     : \\S
            Sadece rakamlar           : \\d (digit'ten geliyor)
            Rakamlar haric            : \\D
            Tüm harfler ve rakamlar   : \\w (word'den geliyor)
            Harfler ve rakamlar hariç : \\W
        */
        /*
        Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz.

        i)  En az 8 karakter olsun
        ii) Space karakteri password'de olmasın
        iii)En az bir tane büyük harf olsun
        iv) En az bir tane küçük harf olsun
        v)  En az bir tane rakam olsun
        vi) En az bir tane sembol olsun*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length()>7;
        System.out.println("lengthControl = " + lengthControl); //true

        //ii)Space karakteri password'de olmasin
        //boolean spaceControl = pwd.replaceAll("[^ ]", "" ).length()==0;
        boolean spaceControl = pwd.replaceAll("[^ ]", "" ).isEmpty(); //boş mu diye kontrol eden method
        System.out.println("spaceControl = " + spaceControl); //true

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseControl = " + upperCaseControl); //true

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("lowerCaseControl = " + lowerCaseControl); //true

        //v)En az bir tane rakam olsun
        boolean digitControl = !pwd.replaceAll("[^0-9]", "").isEmpty();
        System.out.println("digitControl = " + digitControl);

        //en az bir sembol içermeli - ödev
        //Tum noktalama isaretleri ==> \\p{Punct}
        boolean punctControl = pwd.replaceAll("[^\\p{Punct}]", "").length() > 0;
        System.out.println("punctControl = " + punctControl);



        String s = "Ali 12 ?_";

        System.out.println(s.replaceAll("\\S", "*")); //*** ** **
        //space'ler dışındaki her şeyi değiştir

        System.out.println(s.replaceAll("\\s", "*")); //Ali*12*?_
        //Tüm space leri değiştir

        System.out.println(s.replaceAll("\\d", "*")); //Ali ** ?_
        //Tüm rakamları değiştir

        System.out.println(s.replaceAll("\\D", "*")); //****12***
        //Rakamlar dışındaki tüm karakterleri değiştir

        System.out.println(s.replaceAll("\\w", "*")); //*** ** ?*
        //Tüm harfler ve rakamları değiştir
        //space ve sembol kaldı

        System.out.println(s.replaceAll("\\W", "*")); //Ali*12**_
        //Tüm harfler ve rakamlar dışındaki bütün karakterleri değiştir
        //space ve sembol değişti

        //replaceAll() methodunda char kullanamayız, String kullanılır

    }
}
