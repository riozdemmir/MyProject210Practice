package arrays_mdArrays_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList04 {
    public static void main(String[] args) {
            /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

   String class kullanmak tercih edilir cunku string class method acisindan cok zengindir
    */

        List<String>harfler=new ArrayList<>();
        harfler.add("F");
        harfler.add("G");
        harfler.add("D");
        System.out.println(harfler);//[F, G, D]
        Scanner input=new Scanner(System.in);
        int sayac=0;
        int can =3;

        do {
            if (sayac==can){
                System.out.println("Oyun bitti");break;
            }
            System.out.println("Lütfen bir harf giriniz..");
            String harf = input.next().toUpperCase().substring(0,1);
            if (harfler.contains(harf)){
                harfler.set(harfler.indexOf(harf),"Buldum!");
            }else {
                harfler.add(harf);
            }
            System.out.println(harfler);
            sayac++;
        }while (true);


    }
}
