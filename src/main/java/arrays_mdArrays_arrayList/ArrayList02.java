package arrays_mdArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin.
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(21);
        sayilar.add(12);
        sayilar.add(33);
        sayilar.add(21);
        for (Integer w:sayilar) {
            if (w%2!=0){
                sayilar.set(sayilar.indexOf(w),11);
            }
        }
        System.out.println(sayilar);

        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        System.out.println(sayilar);
        ArrayList<Integer> yeni =new ArrayList<>();
        for (Integer w:sayilar) {
            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);



    }
}
