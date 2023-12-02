package arrays;

import java.util.Arrays;

public class Ornek01 {
    public static void main(String[] args) {
    /*
    Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
     */
        int[] a ={12,5,8,13,};
        System.out.println(Arrays.toString(a));//[12, 5, 8, 13]
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[5, 8, 12, 13]
        if (a.length%2!=0){
            int ortadakiIndex = a.length/2;
            System.out.println(a[ortadakiIndex]);
        }else {
            int ortadakiIndex = a.length/2;
            int ortadaki = (a[ortadakiIndex]+a[ortadakiIndex-1])/2;
            System.out.println("ortadaki = " + ortadaki);
        }





    }//Main..
}
