package arrays_konu_anlatim;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String[] isimler ={"Ali","Veli","Ahmet","Cafer"};
        String a ="Ali";
        int sayac =0;
        for (String w:isimler) {
           if (w.contains(a)){
               sayac++;
               break;
           }
        }
        if (sayac<0){
            System.out.println(a+" ismi array de yoktur");
        }else {
            System.out.println(a+" ismi array de vardır..");
        }
        //2. yol
        Arrays.sort(isimler);
        int sonuc=Arrays.binarySearch(isimler,a);
        if (sonuc<0){
            System.out.println(a+" ismi array de yoktur.");
        }else {
            System.out.println(a+" ismi array de vardır..");
        }


        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String cumle ="Ah java vah java sen ne kolaysın öyle canım java!";
        String[] kelimeler =cumle.replaceAll("[\\p{Punct}]","").split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler.length);


        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int[] sayilar ={0, 2, 3, 0, 12, 0};
        int[] newSayilar=new int[sayilar.length];
        int idx=0;
        for (int w:sayilar) {
            if (w!=0){
                newSayilar[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newSayilar));



    }
}
