package arrays_konu_anlatim;

import java.util.ArrayList;

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
        ArrayList<Integer> arrayList=new ArrayList<>();
        //ArrayList'lere eleman nasil eklenir?
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(14);
        System.out.println(arrayList);//[9, 10, 14]
        //list'te araya eleman eklemek icin index numarasini yazariz
        //overloading
        arrayList.add(1,24);
        System.out.println(arrayList);//[9, 24, 10, 14]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer> yeniList=new ArrayList<>();
        yeniList.add(578);
        yeniList.add(444);
        yeniList.add(777);
        arrayList.addAll(4,yeniList);
        System.out.println(arrayList);
        //ArrayList te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini verir
        System.out.println(arrayList.size());//7

        //ArrayList te specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(yeniList.get(2));//777
        //Arraylist te specific bir elemani nasil degisitirebilir?
        yeniList.set(0,25);
        System.out.println(yeniList);//[25, 444, 777]
        //Bir listte tum elemanlari nasil silebiliriz?
       // yeniList.clear();
        //System.out.println(yeniList);//[]
        //Arraylistte specific bir elemanin var olup olmadigni nasil anlariz?
        boolean result =yeniList.contains(66);
        System.out.println(result);//false
        //Bir Arraylist'in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder.
        boolean result2=yeniList.isEmpty();
        System.out.println(result2);//false
        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Cumali");
        if (isimler.size()==0){
            System.out.println("Evet bu list boştur");
        }else {
            System.out.println("Hayır bu list en az 1 tane eleman içerir.");
        }
        //2.yol
        isimler.clear();
        if (isimler.isEmpty()){
            System.out.println("Evet boş");
        }else {
            System.out.println("Hayır boş değil..");
        }


    }
}
