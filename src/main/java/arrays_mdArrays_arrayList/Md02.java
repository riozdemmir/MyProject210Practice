package arrays_mdArrays_arrayList;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir arrayi tek boyutlu bir array e ceviriniz
        //int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}
        int numbers[][] = {{5, 4}, {2, 3, 2}};
        System.out.println(Arrays.deepToString(numbers));
        int elemanSayisi=0;
        for (int[] w:numbers) {
            elemanSayisi+= w.length;
        }
        int[] arr=new int[elemanSayisi];
        int idx=0;
        for (int[] w:numbers) {
            for (int k:w) {
                arr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
