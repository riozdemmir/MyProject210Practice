package ornek_grup;

import java.util.Scanner;

public class Ornek2forLoop {
    public static void main(String[] args) {
        // ÖRNEK 4 ) Kullanıcıdan sisteme 5 adet sayı girmesini isteyiniz bu sayıların
        // birler basamağı 6 veya 3 olanlar hariç diğerlerinin toplamını bulunuz.

        Scanner scan =new Scanner(System.in);
        int sum=0;
        for (int i =0 ; i <5 ; i++) {
            System.out.println("Lütfen "+(i+1)+". sayıyı giriniz");
            int sayi = scan.nextInt();
            if (sayi%10==6||sayi%10==3){
                continue;
            }
            sum+=sayi;
        }

        System.out.println(sum);

    }
}

