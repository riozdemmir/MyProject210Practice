package arrays_konu_anlatim;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Array nasil olusturulur?
        String[] stdNames=new String[3];

        //Arrayler console a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));

        //Array e eleman ekleme nasil yapilir?
        stdNames[0]="Veli";
        stdNames[1]="Ali";
        stdNames[2]="Can";
        System.out.println(Arrays.toString(stdNames));//[Veli, Ali, Can]



        //Ornek 1: Integer bir array olusturunuz, icine 4 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
        int[] numbers=new int[4];
        numbers[0]=12;
        numbers[1]=20;
        numbers[2]=24;
        numbers[3]=16;
        System.out.println(Arrays.toString(numbers));//[12, 20, 24, 16]
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//[12, 16, 20, 24]
        System.out.println(numbers[0]+numbers[numbers.length-1]);//36
        //2.yol
        int min=numbers[0];
        int max=numbers[0];
        for (int w:numbers) {
            min=Math.min(min,w);
            max=Math.max(max,w);
        }
        System.out.println("Bu array'deki en küçük eleman : "+min+" ve en buyuk eleman : "+max+" 'dir. Toplam ==> "+(min+max));





        //Ornek 3: Notlar adında Integer bir Array olusturunuz içine 6 tabe not yerşetiriniz ve not
        // ortalamasını
        int[] notlar=new int[6];
        notlar[0]=45;
        notlar[1]=70;
        notlar[2]=50;
        notlar[3]=60;
        notlar[4]=100;
        notlar[5]=90;
        System.out.println(Arrays.toString(notlar));
        int sum=0;
        for (int w:notlar) {
            sum+=w;
        }
        double ortaalama =sum/notlar.length;
        System.out.println(ortaalama);


        //Arrayleri kisa yoldan nasil olusturabiliriz?
        int[] arr={100,52,11,47,58};

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayac=0;
        for (int w:arr) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("arr arrayinde "+sayac+" tane çift "+(arr.length-sayac)+" tane de tek sayı vardır");


        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String[] isimler={"Ali","Veli","Cafer","Suleyman","Feridun"};
        for (String w:isimler) {
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz.
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ali, Cafer, Feridun, Suleyman, Veli]
        for (String w:isimler) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }



    }//Main
}
