package arrays_konu_anlatim;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Ornek : Bir integer multidimensional arraydeki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //int ages[][] = {{15, 4}, {12, 43, 21}};//==> 4 + 43 = 47

        int yaslar[][] ={{15, 4}, {12, 43, 21}};
        System.out.println(Arrays.deepToString(yaslar));//[[15, 4], [12, 43, 21]]
        int buyuk =yaslar[0][0];
        int kucuk =yaslar[0][0];
        for (int[] w:yaslar) {
            for (int k:w) {
                buyuk=Math.max(buyuk,k);
                kucuk=Math.min(kucuk,k);
            }

        }
        System.out.println("Bu array deki en büyük eleman :"+buyuk+" ile en kucuk eleman "+kucuk+" toplamı ==> "+(buyuk+kucuk)+" dir.");


    }
}
