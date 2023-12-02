package arrays_mdArrays_arrayList;

import java.util.Arrays;
import java.util.Collections;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String[] isimler ={"Ali","Veli","Ahmet","Cafer"};
        System.out.println(Arrays.toString(isimler));//[Ali, Veli, Ahmet, Cafer]
        String a="Melih";
        int sayac=0;
        for (String w:isimler) {
            if (w.equals(a)){
                sayac++;break;
            }
        }
        if (sayac<=0){
            System.out.println(a +" ismi array de yoktur");
        }else {
            System.out.println(a+" ismi arra de vardır");
        }
        String b ="Cafer";
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ahmet, Ali, Cafer, Veli]
        int result = Arrays.binarySearch(isimler,b);

        System.out.println(result);//2


        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String cumle ="Ah java vah java sen ne kolaysın be java! :)";
        String[] kelimeler = cumle.replaceAll("[\\p{Punct}]","").split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Ah, java, vah, java, sen, ne, kolaysın, be, java]
        System.out.println(kelimeler.length);

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int[] arr={0, 2, 3, 0, 12, 0};
        int [] yeni=new int[arr.length];
        System.out.println(Arrays.toString(yeni));//[0, 0, 0, 0, 0, 0]
        int idx=0;
        for (int w:arr) {
            if (w!=0){
                yeni[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));//[2, 3, 12, 0, 0, 0]
    }
}
