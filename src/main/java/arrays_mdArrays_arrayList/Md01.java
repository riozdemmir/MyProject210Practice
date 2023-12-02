package arrays_mdArrays_arrayList;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Bir Array in elemanlari Array ise bu Array ler Multidimensional Array dir

        //Multidimensional Array nasil olusturulur ve nasıl yazdırlır?
        int [][] notlar=new int[2][2];
        notlar[0][0]=12;
        notlar[0][1]=20;
        notlar[1][0]=14;
        notlar[1][1]=11;
        System.out.println(Arrays.deepToString(notlar));//[[12, 20], [14, 11]]

        //Kisa yoldan Multidimensional array nasil olusturulur?
        int [][] sayilar={{12,45},{11},{45,75,41}};
        System.out.println(Arrays.deepToString(sayilar));//[[12, 45], [11], [45, 75, 41]]


        //Ornek 1: ogrenci isimlerini içeren bir multiArr olusturun ve toplam kac tane isim oldugun bulunuz.
        String[][] isimler={{"Ahmet","Cumali"},{"Veli","Ferhat"},{"Husnu"}  };
        System.out.println(Arrays.deepToString(isimler));//[[Ahmet, Cumali], [Veli, Ferhat], [Husnu]]
        int sum=0;
        for (String[] w:isimler) {
            sum=sum+ w.length;
        }
        System.out.println(sum);
    }
}
