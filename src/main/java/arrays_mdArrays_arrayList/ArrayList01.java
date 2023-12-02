package arrays_mdArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Array List Nedir?

        /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplarlar
         */
        //ArrayList nasil olusturulur?
        ArrayList<Integer> sayilar =new ArrayList<>();
        //ArrayList'lere eleman nasil eklenir?
        sayilar.add(12);
        sayilar.add(24);
        sayilar.add(25);
        System.out.println(sayilar);//[12, 24, 25]


        //list'te araya eleman eklemek icin index numarasini yazariz
        //overloading
        sayilar.add(1,35);
        System.out.println(sayilar);//[12, 35, 24, 25]


        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz.
        List<Integer> yeni=new ArrayList<>();
        yeni.add(555);
        yeni.add(666);
        yeni.add(888);
        System.out.println(yeni);
        sayilar.addAll(sayilar.size(),yeni);
        System.out.println(sayilar);//[12, 35, 24, 25, 555, 666, 888]

        //ArrayList te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini verir
        System.out.println(yeni.size());


        //ArrayList te specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(sayilar.get(sayilar.size() - 1));

        //Arraylist te specific bir elemani nasil degisitirebilir?
        //set() methodu ile
        sayilar.set(0,102);
        System.out.println(sayilar);

        //Bir listte tum elemanlari nasil silebiliriz?
        yeni.clear();
        System.out.println(yeni);

        //Arraylistte specific bir elemanin var olup olmadigni nasil anlariz?
        //contains();
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Adem");
        isimler.add("Veli");
        isimler.add("Cem");
      boolean result =isimler.contains("Mehmet");
        System.out.println(result);

        //Bir Arraylist'in bos olup olmadigini nasil kontrol ederiz?
        if (isimler.size()==0){
            System.out.println("bu array boş");
        }else {
            System.out.println(" bu array boş değil "+isimler.size()+" tane eleman vardır");
        }

        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder.
        if (yeni.isEmpty()){
            System.out.println("boş");
        }else {
            System.out.println("boş değil");
        }


        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.


    }
}
