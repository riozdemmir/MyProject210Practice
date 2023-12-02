package stringmanipulations;

public class N_Substring {
    public static void main(String[] args) {

        //Java'da Substring, String'in bir parçasıdır
        //veya String'in alt kümesi olduğu söylenebilir. substring() yönteminin iki çeşidi vardır:
        //substring(beginindex: ) --> girilen indexten itibaren sonuna kadar alır
        //substring(beginindex, endindex)
        //   başlangıç (dahil), bitiş (hariç) --> istenen aralığı alır
        //substring methodu overload'dur --> birden fazla işleve sahiptir

        String s = "Java OOP language olduğu için popülerdir";

        System.out.println(s.substring(3)); //a OOP language olduğu için popülerdir

        System.out.println(s.substring(5)); //OOP language olduğu için popülerdir

        System.out.println(s.substring(0)); //Java OOP language olduğu için popülerdir

        //Son harfi ekrana yazdırmak için --> dinamik
        System.out.println(s.substring(s.length()-1)); //r

        System.out.println(s.substring(9, 17)); //language
        //index 9 dahil, index 17 hariçtir

        System.out.println(s.substring(0, 1)); //J
        //substring(0, 1) String'deki ilk harfi verir, charAt(0) gibi
        //substring(0, 1) String return eder, charAt(0) char return eder
        //substring(0, 1) != charAt(0)
        //return edilen değerlerin tipi farklıdır

        System.out.println(s.substring(5, 5));
        //İndex'ler eşit olduğu için console'da hiçbir şey görmeyiz. Hata vermez!

        System.out.println(s.substring(5, 1));
        //substring() methodunda başlangıç indexi bitiş indexinden büyük olamaz
        //Büyük olursa Run Time Error --> Exception verir


    }
}
