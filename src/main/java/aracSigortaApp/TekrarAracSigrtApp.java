package aracSigortaApp;

import java.util.Scanner;

public class TekrarAracSigrtApp {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */
    public static void main(String[] args) {
        //1.uygulamayı baslatan bir method
        start();


    }//Main..
    public static void start(){
        //2.kullanıcıdan bilgi alma
        Scanner input=new Scanner(System.in);
        boolean isAgain;
        //3.tekar tekrar menu gösterilecek.
        do {
            System.out.println("--Zorunlu Araç Sigorta Prim Hesaplama---");
            System.out.println("Tarife Dönemini seçiniz..");
            System.out.println("1. Haziran 2023");
            System.out.println("2. Aralık 2023");
            int donem = input.nextInt();
            String donemBilgi=donem==1?"Haziran 2023":"Aralık 2023";
            //kullanıcı tarife donemi girerse isleme devam edecek hatalı ise
            if (donem==1||donem==2){
                TekrarArac tekrarArac=new TekrarArac();//default
                System.out.println("Araç tipini seçiniz");
                System.out.println("otomobil, kamyon, otobus, motosiklet");
                tekrarArac.type=input.next();
                tekrarArac.hesaplaPrim(donem);
                if (tekrarArac.prim>0){
                    System.out.println("------------------------");
                    System.out.println("Araç tipi : "+tekrarArac.type);
                    System.out.println("Tarife bilgisi : "+donemBilgi);
                    System.out.println("Aracınızın ilgili donem sigorta bilgisi : "+tekrarArac.prim);
                    System.out.println("-----------------");
                    System.out.println("Yeni işlem için 1, çıkış i.im 0 seciniz.");
                    int select = input.nextInt();
                    isAgain=select==1?true:false;

                }else {
                    System.out.println("Hesaplama işlemi başarısız.. Tekrar deneyiniz..");
                    System.out.println("Yeni işlem için 1 çıkış için 0 seciniz");
                    int select = input.nextInt();
                    isAgain=select==1?true:false;
                }

            }else {
                System.out.println("Hatalı giriş");
                isAgain=true;
            }



        }while (isAgain);
        System.out.println("İyi Günler");

    }
}
