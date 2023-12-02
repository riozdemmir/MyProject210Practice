package stringmanipulations;

import java.util.Scanner;

public class H_Contains {
    public static void main(String[] args) {
        //contain --> içermek

        String s = "Java öğren zengin ol";

        System.out.println(s.contains("J")); //true
        System.out.println(s.contains("x")); //false

        //contains() methodu boolean (true, false) return eder

        System.out.println(s.contains("öğren")); //true

        System.out.println(s.contains("Zengin")); //false --> case sensetive

        System.out.println(s.contains("")); //true --> başında sonunda harfler arasında hiçlik var

        System.out.println(s.contains(" ")); //true


        //Kullanıcıdan aldığınız cümlenin "," içerip içermediğine bakın

        Scanner input = new Scanner(System.in);
        System.out.println("Lüften bir cümle yazınız: ");
        String cumle = input.nextLine();

        System.out.println(cumle.contains(",")); //true

    }
}
