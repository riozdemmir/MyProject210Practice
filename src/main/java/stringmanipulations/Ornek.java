package stringmanipulations;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        /*
        1) Kullanıcıdan password alınız
        2) Password:
           a) İlk karakteri büyük harf olacak
           b) Son karakteri sayı olacak
           c) en az 6 karakter uzunluğunda olacak
           şartlarını sağlıyorsa ekrana "Password başarıyla oluşturuldu" yazınız
        3) Password yukarıdaki şartlardan herhangi birini sağlamıyorsa "Tekrar deneyiniz" yazdırın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password'unuzu giriniz: ");
        String pwd = input.next();

        if ((pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') &&
          //ilk karakteri charAt(0) ile alıp && operatörü ile true olma kontrolünü sağlıyoruz
          // A-Z aralığında (dahil) olma koşulu sağlansın
        (pwd.charAt(pwd.length()-1) >= '0' && pwd.charAt(pwd.length()-1) <= '9') &&
        //son karakteri length()-1 ile aldık
        //0-9 aralığında (dahil) olma koşulunu && operatörü ile kontrol ettik
                pwd.length() > 5) {
               // en az 6 karakter olma durumunu kontrol ediyoruz
            System.out.println("Password başarıyla oluşturuldu..");
        }else {
            System.out.println("Tekrar deneyiniz!");
        }


    }//main
}
