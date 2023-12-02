package stringmanipulations;

import java.util.Scanner;

public class C_UpperLower {
    public static void main(String[] args) {
        //Kullanıcıdan ismini aldıktan sonra, ismin bütün harflerini büyük harfe çeviriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = input.nextLine();

        isim = isim.toUpperCase(); //HAYRİYE KARTIN
        //isim = isim.toLowerCase(); //hayriye kartın
        System.out.println(isim);
    }
}
