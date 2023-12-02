package arrays_konu_anlatim;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin

        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(12);
        System.out.println(list);
        for (Integer w:list) {
            if (w%2!=0){
                list.set(list.indexOf(w),11);
            }
        }
        System.out.println(list);//[12, 11, 8, 11]
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.

    ArrayList<Integer>yeni=new ArrayList<>();
        for (Integer w:list) {
            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);//[12, 11, 8]

    }
}
