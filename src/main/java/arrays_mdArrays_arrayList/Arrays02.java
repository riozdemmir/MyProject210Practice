package arrays_mdArrays_arrayList;

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
        Scanner input=new Scanner(System.in);
        System.out.println("Eklemek istediğiniz eleman sayısını giriniz..");
        int elemanSayisi = input.nextInt();
        String[] isimler=new String[elemanSayisi];
        System.out.println("Çıkmak için w a basınız..");
        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println((i+1)+". ogrenci ismini giriniz..");
            String name = input.next();
            if (name.equalsIgnoreCase("w")){
                break;
            }else {
                isimler[i]=name;
            }

        }
        System.out.println(Arrays.toString(isimler));



    }
}
