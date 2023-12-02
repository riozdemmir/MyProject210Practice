package doWhileLoop03;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //Bir pozitif tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        Scanner scan=new Scanner(System.in);
        System.out.println("tam bolenleri bulan uygulamaya hosgeldiniz devam etmek icin lutfen pozitif bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
        int bolen=1;

        do {

            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi "+bolen+" sayisina tam olarak bolenebildi");
                toplam+=bolen;
            }
            bolen++;
        }while (bolen<=sayi);

    }
}