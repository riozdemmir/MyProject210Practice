package arrays_konu_anlatim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Kısa yoldan list nasıl olusturulur?
        List<Integer> list=List.of(45,12,78,46,12,46);
        System.out.println(list);//[45, 12, 78, 46]
        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        for (Integer w:list) {
            if (list.indexOf(w)==list.lastIndexOf(w)){
                System.out.println(w);
            }
        }
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10
        List<Integer> number=new ArrayList<>();
        number.add(12);
        number.add(23);
        number.add(10);
        number.add(19);
        Collections.sort(number);
        System.out.println(number);//[10, 12, 19, 23]
        int minFark=number.get(1)-number.get(0);
        for (int i = 1; i <number.size() ; i++) {
            minFark=Math.min(minFark,number.get(i)-number.get(i-1));

        }
        System.out.println("Minumum Fark : "+minFark);

        for (int i = 1; i <number.size() ; i++) {
            if (number.get(i)-number.get(i-1)==minFark){
                System.out.println(number.get(i-1)+" ve "+number.get(i));
            }


        }


    }
}
