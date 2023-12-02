package ornek_grup;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
            /*
ÖRNEK 6 )   Asagidaki sekli for-loop kullanarak çizdiriniz.


         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
       Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz..");
        int sayi = scan.nextInt();
        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = sayi-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


/*        int sayi = 5;

        for (int i = 0; i < sayi; i++) {//satırlar için loop olusturalım  //outer loop

            for (int j = 0; j <= i; j++) {//sutun için yani * için
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = sayi - 1; i > 0; i--) {//outer loop, satırlar için

            for (int j = 0; j < i; j++) {//inner loop, yıldızlar için

                System.out.print("* ");
            }
            System.out.println();


        }*/



    }
}

