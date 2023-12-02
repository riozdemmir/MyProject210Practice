package doWhileLoop03;

import java.util.Random;
import java.util.Scanner;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        int sayi=rnd.nextInt(101);
        System.out.println(sayi);
        int kullaniciSayi;
        int tahminSayisi=0;
        do {
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi = scan.nextInt();
            if (kullaniciSayi>sayi){
                System.out.println("sayiyi kucult");
            } else if (kullaniciSayi<sayi) {
                System.out.println("sayiyi buyult");
            }
            tahminSayisi++;

        }while (sayi!=kullaniciSayi);
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz");


    }
}