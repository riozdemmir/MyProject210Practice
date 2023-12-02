package stringmanipulations;

public class J_StartsWith {
    public static void main(String[] args) {
        //startsWtih() --> method içine yazdığımız için String ifade ile başlıyor mu?
        //endsWith() methodunun yaptığının tersini yapar
        //Boolean döndürür --> true ya da false verir

        String s = "Code yazarak öğrenilir";
        System.out.println(s.startsWith("C"));
        //s String'i "C" harfiyle başlıyor --> true

        System.out.println(s.startsWith("c"));
        //s String'i "c" harfiyle başlıyor --> false

        System.out.println(s.startsWith("Code"));
        //s String'i "Code" kelimesiyle başlıyor --> true

        System.out.println(s.startsWith("e", 3));
        //s String'inin 3. indexi "e" dir --> true
        //3. index 4. karakter






    }
}
