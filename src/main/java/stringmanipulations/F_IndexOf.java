package stringmanipulations;

public class F_IndexOf {
    public static void main(String[] args) {
        //indexOf() methodu her zaman istenen karakterin ilk indexine bakar
        //Soldan sağa bakar ve ilk bulduğunu getirir

        String s = "Java ah Java";
        System.out.println(s.indexOf('J')); //0
        //indexi sorulan char'ın String içindeki ilk görünümünün indexini verdi

        System.out.println(s.indexOf('h')); //6
        System.out.println(s.indexOf(' ')); //4

        System.out.println(s.indexOf("av")); //1

        //indexOf() methodunda hem char hemString kullanılabilir
        //Birden fazla karakterin indexi sorulursa ilk karakterin indexi return edilir

        System.out.println(s.indexOf("")); //0

        //"" hiçlik arattığımızda 0 return eder
        //bir String'in hem başında hem sonunda hem de her karakterin arasında hiçlik vardır

        System.out.println(s.indexOf("x")); //-1
        //Olmayan karakterler için -1 return eder

        //String s = "Java ah Java";

        System.out.println(s.indexOf('a', 6)); //9

        //6. indexten sonrasına bak, 'a' harfinin kaçıncı indexte olduğunu söyle
        //6. indexten itibaren 'a' harfi kaçıncı indexte buna bakar
        //Tüm String'te kaçıncı index'teyse onu çıktı verir

        System.out.println(s.indexOf('a', 10)); //11

        System.out.println(s.indexOf("ah", 2)); //5
        //2. indexten (dahil) itibaren String'i bulur, tüm String'te kaçıncı indexten başlıyorsa onu çıktı verir







    }
}
