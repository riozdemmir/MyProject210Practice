package studentpractice;

import java.util.Scanner;

public class MusteriKarti {
    public static void main(String[] args) {
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, 10 urunden az ise %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Müşteri kartınız var mı? (Evet-Hayır)");
        String kart = input.next();
        System.out.println("Aldığınız ürünün adedini giriniz..");
        int urun = input.nextInt();
        System.out.println("Aldığınız ürünün liste fiyatını giriniz..");
        double fiyat = input.nextDouble();
        if (kart.equalsIgnoreCase("Evet")){
            if (urun>10){
                System.out.println("Odenecek tutar = "+urun*(fiyat*0.8)+" %20 inidirim kazandınız..");
            }else {
                System.out.println("Odenecek tutar = "+urun*(fiyat*0.85)+" %15 inidirim kazandınız..");

            }
        } else if (kart.equalsIgnoreCase("Hayır")) {
            if (urun>10){
                System.out.println("Odenecek tutar = "+urun*(fiyat*0.85)+" %15 inidirim kazandınız..");
            }else {
                System.out.println("Odenecek tutar = "+urun*(fiyat*0.9)+" %10 inidirim kazandınız..");
            }
        }else{
            System.out.println("Hatalı bir giriş yaptınız..");
        }

    }
}
