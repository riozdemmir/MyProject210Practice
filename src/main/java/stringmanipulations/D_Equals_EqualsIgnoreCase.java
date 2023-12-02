package stringmanipulations;

public class D_Equals_EqualsIgnoreCase {
    public static void main(String[] args) {
        //String'lerde eşitlik kontrol etmek için == değil equals() methodu kullanılır
        //ing. equal --> eşit demek
        //Boolean değer döndürür

        System.out.println("Ali".equals("Ali")); //true

        System.out.println("Ali".equals("ALI")); //false

        System.out.println("Ali" == "Ali"); //true

        // == bazen true verir bazen false verir
        //Riske girmeyip String için üretilmiş olan equals() methodunu kullanmak gerekir
        // == değerlerin ve adreslerin birbirine eşit olup olmadığını kontrol eder, ikisi de eşitse true döndürür
        //equals() adreslere bakmaksızın sadece değerler eşit mi diye bakar
        //password kontrolleri için uygun olan methoddur

        //equalsIgnoreCase()
        //Ignore --> görmezden gel
        //IgnoreCase --> küçük büyük harfi görmezden gel
        //Boolean değer döndürür

        System.out.println("ali".equalsIgnoreCase("ALI")); //true



        String str1 = "Ali";
        String str2 = "Ali";


        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str1==str2); //false

        System.out.println((str1+str2).equals(str2+str1)); //false
                          //Aliali     !=       aliAli
    }
}
