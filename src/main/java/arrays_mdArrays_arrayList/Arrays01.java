package arrays_mdArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a=13;
        //Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur
        //Array nasil olusturulur?
        String[] stdNames=new String[3];

        //Arrayler console a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null]

        //Array e eleman ekleme nasil yapilir?
        stdNames[0]="Abidin";
        stdNames[1]="Meltem";
        stdNames[2]="Mehmet";
        System.out.println(Arrays.toString(stdNames));//[Abidin, Meltem, Mehmet]


              /*
        Arrayler diger collectionlardan cok cok daha hizlidir (superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar
         */



        //Ornek 1: Integer bir array olusturunuz, icine 4 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
        Integer arr[] =new Integer[4];
        arr[0]=12;
        arr[1]=44;
        arr[2]=37;
        arr[3]=13;
        System.out.println(Arrays.toString(arr));//[12, 44, 37, 13]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[12, 13, 37, 44]
        System.out.println(arr[0]+arr[arr.length-1]);//56
        //2.yol
        int min =arr[0];
        int max =arr[0];
        for (Integer w:arr) {
            min=Math.min(min,w);
            max=Math.max(max,w);
        }
        System.out.println(min+max);//56


        //Ornek 3: Notlar adında Integer bir Array olusturunuz içine 6 tabe not yerşetiriniz ve not
        // ortalamasını
        Integer[] notlar=new Integer[6];
        notlar[0]=45;
        notlar[1]=60;
        notlar[2]=70;
        notlar[3]=65;
        notlar[4]=100;
        notlar[5]=90;
        System.out.println(Arrays.toString(notlar));//[45, 60, 70, 65, 100, 90]
        int sum=0;
        for (Integer w:notlar) {
            sum=sum+w;
        }
        double ortalama = sum/notlar.length;
        System.out.println("Ortalama : "+ortalama);//Ortalama : 71.0

        //Arrayleri kisa yoldan nasil olusturabiliriz?
        String[] isimler={"Ahmet","Cem","Cumali","Vefa","Hüsnü"};
        System.out.println(Arrays.toString(isimler));//[Ahmet, Cem, Cumali, Vefa, Hüsnü]

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        //Integer[] notlar=new Integer[6];
        //[45, 60, 70, 65, 100, 90]
        int sayac =0;
        for (Integer w:notlar) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("Bu notlar array inde "+sayac+" tane çift sayı ve "+(notlar.length-sayac)+" tane de tek sayı vardır");
        //Bu notlar array inde 4 tane çift sayı ve 2 tane de tek sayı vardır

        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz.
        String[] names=new String[4];
        names[0]="Veli";
        names[1]="Adil";
        names[2]="Cemre";
        names[3]="Fatma";
        System.out.println(Arrays.toString(names));//[Veli, Adil, Cemre, Fatma]
        for (String w:names) {
            if (w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println("--------------------");
        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz.
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[Adil, Cemre, Fatma, Veli]
        for (String w:names) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }



    }//Main
}
