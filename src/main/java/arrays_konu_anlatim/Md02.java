package arrays_konu_anlatim;

import java.sql.Array;
import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir arrayi tek boyutlu bir array e ceviriniz
        //int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}
        int numbers[][] = {{5, 4}, {2, 3, 2}};
        System.out.println(Arrays.deepToString(numbers));//[[5, 4], [2, 3, 2]]
        int toplamElemanSayisi=0;
        for (int[] w:numbers) {
            toplamElemanSayisi+=w.length;
        }
        System.out.println(toplamElemanSayisi);
        int [] newArr =new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr));
        int idx=0;
        for (int[] w:numbers) {
            for (int k:w) {
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]



    }
}
