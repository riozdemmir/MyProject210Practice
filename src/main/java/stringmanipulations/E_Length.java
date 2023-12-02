package stringmanipulations;

import java.util.Scanner;

public class E_Length {
    public static void main(String[] args) {
        //length() methodu bir String'teki karakterlerin uzunluğunu (sayısını) verir

        String s = "Testi çöz kendini gör";
        System.out.println(s.length()); //21

        //Kullanıcıdan aldığınız girdinin karakter uzunluğunu veren kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir şeyler yazınız :) ");
        String anything = input.nextLine();

        System.out.println(anything.length()); //benim bir kedim var --> 19
    }
}
