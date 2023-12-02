package arrays_mdArrays_arrayList;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Ornek : Bir integer multidimensional arraydeki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //int ages[][] = {{15, 4}, {12, 43, 21}};//==> 4 + 43 = 47
        int ages[][] = {{15, 4}, {12, 43, 21}};
        int min=ages[0][1];
        int max=ages[0][1];
        for (int[] w:ages) {
            for (int k:w) {
                min=Math.min(min,k);
                max=Math.max(max,k);
            }
        }

        System.out.println(min+" + "+max+" = "+(min+max));//4 + 43 = 47
    }
}
