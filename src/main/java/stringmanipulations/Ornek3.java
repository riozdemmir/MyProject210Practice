package stringmanipulations;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Tc numaranızı giriniz..");
         String tc = scan.nextLine();
/*        for (int i = 0; i <7 ; i++) {
            System.out.print("*");
        }
        for (int i = 7; i <tc.length() ; i++) {
            String son4hane= String.valueOf(tc.charAt(i));
            System.out.print(son4hane);
        }*/
        /*
        ilk for da 0.indexten 6.index dahil 7 kere dönsün ve her döngude * yazsın dedim
        ikinci for da ise indexi 7. den başlasın dedim kullanıcıdan aldığımız tc nin length i kadar
        gitsin dedim. onları da tek tek char olarak charAt() methodu ile aldık
        ama aldığımız charları Valueof methodu ile Stringe çevirdik. son4hane adlı stringe atadık.
        yanyana yazsın diye prinln değil print taptık
         */

        for (int i = 0; i < tc.length(); i++) {
            if (i<7){
                System.out.print("*");
            }else {
                String son4Hane= String.valueOf(tc.charAt(i));
                System.out.print(son4Hane);
            }

        }


    }
}
