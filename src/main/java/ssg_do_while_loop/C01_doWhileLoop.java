package doWhileLoop03;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //Girilen tamsayının basamak degerlerinin toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        do {
            sayi=Math.abs(sayi);
            toplam+=sayi%10;
            sayi/=10;

        }while (sayi>0);
        for (int i = sayi; i >0 ; i/=10) {


        }

        // sayi=Math.abs(sayi);
        // while (sayi>0){

        //     toplam+=sayi%10;
        //     sayi/=10;
        // }
    }
}