package studentpractice;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
      /*  Write a Java program to print a pyramid of numbers. Each row should have numbers starting from 1,
      increasing by one in each column and each row having one number more than the previous row.
      (Sayılardan oluşan bir piramit yapmanızı istiyoruz. Her bir satır bir önceki satırdan 1 fazla değere sahip olmalı.)
        Örnek;
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

       */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int satir = input.nextInt();
        int sutun =1;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(sutun+" ");
            }
            sutun++;
            System.out.println();
        }




    }//Main..
}
