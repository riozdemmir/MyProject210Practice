package stringmanipulations;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        /*
        1) Kullanıcıdan ad ve soyadını ve 11 haneli kimlik numarasını alınız
        2) Kullanıcı ad ve soyadını yazarken yanlışlıkla space koyarsa siliniz
        3) Ad ve soyadın ilk harfleri büyük olmalı
        4) Kimlik numarasının son 4 rakamı hariç hepsi * yapılmalı
        Örneğin: Ali Can *******1234
         */

        // 1) Kullanıcıdan ad ve soyadını ve 11 haneli kimlik numarasını alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String ad = scan.nextLine();
        System.out.println("Soyadınızı giriniz: ");
        String soyad = scan.nextLine();
        System.out.println("Kimlik numaranızı giriniz: ");
        String kimlikNo = scan.nextLine();

        // 2) Kullanıcı ad ve soyadını yazarken yanlışlıkla space koyarsa siliniz
        ad = ad.trim();
        //hafızadaki orijinal veriyi yeni veriyle değiştirmek
        //için yeniden aynı değişkene atıyoruz
        soyad = soyad.trim();

        // 3) Ad ve soyadın ilk harfleri büyük olmalı
        ad = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase();

        soyad = soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase();


        // 4) Kimlik numarasının son 4 rakamı hariç hepsi * yapılmalı
        kimlikNo = "*******" +kimlikNo.substring(kimlikNo.length()-4);


        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(kimlikNo);



    }//main
}
