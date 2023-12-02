package arrays_konu_anlatim;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Bir Array in elemanlari Array ise bu Array ler Multidimensional Array dir

        //Multidimensional Array nasil olusturulur ve nasıl yazdırlır?
        int[][] muliArr=new int[3][2];
        muliArr[0][0]=12;
        muliArr[0][1]=32;
        muliArr[1][0]=12;
        muliArr[1][1]=58;
        muliArr[2][0]=21;
        muliArr[2][1]=47;
        System.out.println(Arrays.deepToString(muliArr));//[[12, 32], [12, 58], [21, 47]]

        //Kisa yoldan Multidimensional array nasil olusturulur?
        int[][] newArr={ {45,20},{74,10} ,{14} ,{42,63,7}};
        System.out.println(Arrays.deepToString(newArr));//[[45, 20], [74, 10], [14], [42, 63, 7]]


        //Ornek 1: ogrenci isimlerini içeren bir multiArr olusturun ve toplam kac tane isim oldugun bulunuz
        String[][] stdNames={{"Ali","Veli"},{"Cafer","Adem","Osman"},{"Feridun"} ,{"Kahraman"} };
        System.out.println(Arrays.deepToString(stdNames));
        int toplam=0;
        for (String[] w:stdNames) {
            toplam+=w.length;
        }
        System.out.println(toplam);


    }
}
