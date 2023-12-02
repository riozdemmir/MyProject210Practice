package arrays;

import java.util.Arrays;

public class Ornek03 {
    public static void main(String[] args) {
       /* Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
        */

        int[] arr ={-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-12, -5, -2, 18, 23]
        int minPozitif = arr[arr.length-1];
        int maxNegatif = arr[0];

        for (int w:arr) {
            if (w>0){
                minPozitif=Math.min(minPozitif,w);
            }else {
                maxNegatif=Math.max(maxNegatif,w);
            }

        }
        System.out.println("En küçük pozitif "+minPozitif+" , en büyük negatif "+maxNegatif+" 'tir..");

    }//Main..
}
