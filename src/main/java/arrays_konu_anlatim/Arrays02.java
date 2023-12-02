package arrays_konu_anlatim;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        // Ornek 1: Kullanicinin coklu data yi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1)Kullanicidan data almak icin Scanner object olustur
        2)Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen eklemek isstediğiniz öğrenci sayısını giriniz..");
        int ogreniSayisi = input.nextInt();

        String[] names =new String[ogreniSayisi];
        System.out.println("Çıkmak için q ya basınız..");

        for (int i = 0; i <names.length ; i++) {
            System.out.println((i+1)+". öğrencinin ismini giriniz..");
            String name=input.next();
            if (name.equalsIgnoreCase("q")){
                    break;
            }else {
                names[i]=name;
            }
        }
        System.out.println(Arrays.toString(names));



    }
}
