package arrays_konu_anlatim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList04 {
    public static void main(String[] args) {
            /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

   String class kullanmak tercih edilir cunku string class method acisindan cok zengindir
    */

    List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("R");
        harfler.add("S");
        System.out.println(harfler);//
        Scanner input =new Scanner(System.in);
        int sayac=0;

        do {
            if (sayac==3){
                System.out.println("Oyun bitti..");break;
            }
            System.out.println("Lütfen bir harf giriniz.");
            String girilenHarf=input.next().toUpperCase().substring(0,1);
            if (harfler.contains(girilenHarf)){
                harfler.set(harfler.indexOf(girilenHarf),"Buldum!" );
            }else {
                harfler.add(girilenHarf);
            }
            System.out.println(harfler);
            sayac++;

        }while (true);



    }
}
