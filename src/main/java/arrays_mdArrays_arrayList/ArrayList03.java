package arrays_mdArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Kısa yoldan list nasıl olusturulur?
        List<Integer> yeni=List.of(12,4,66,5,47,4,12);
        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(23);
        sayilar.add(10);
        sayilar.add(19);
        System.out.println(sayilar);//[12, 23, 10, 19]
        Collections.sort(sayilar);
        int minFark= sayilar.get(1)- sayilar.get(0);
        for (int i = 1; i < sayilar.size() ; i++) {
        minFark=Math.min(minFark,sayilar.get(i)- sayilar.get(i-1) );
        }
        System.out.println(minFark);//2
        for (int i = 1; i < sayilar.size() ; i++) {
            if (sayilar.get(i)- sayilar.get(i-1)==minFark){
                System.out.println(sayilar.get(i)+" and "+ sayilar.get(i-1));
            }
        }


    }
}
