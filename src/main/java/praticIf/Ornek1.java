package praticIf;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        //Ornek 1: Kullanıcıdan alınan sayı 0 dan büyük ya da 10 dan kucuk ise rakam yazdırsın..

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı gir");
        int sayi = input.nextInt();
        if (sayi>=0 && sayi<10){
            System.out.println("Rakam");
        }else {
            System.out.println("Rakam değil");
        }




    }
}
