package stringmanipulations;

public class B_CharAt {
    public static void main(String[] args) {
        //charAt(); --> indexe göre karakteri alır

        String ch = "Study hard stay humble"; //çok çalış mütevazı ol

        System.out.println(ch.charAt(0)); //S --> ilk indexi çıktı verir

        //7. karakteri ekrana yazdırın
        System.out.println(ch.charAt(6)); //h --> 6. index, 7. karakteri çıktı verir (length)

        //son karakteri ekrana yazdırın
        //System.out.println(ch.charAt(21)); //e

        //dinamik bir şekilde yapacak olursak
        //değişimlere göre doğru çalışan kodlara dinamik kod denir
        System.out.println(ch.charAt(ch.length()-1)); //e --> son karakteri yazdırır
        //ch.charAt(ch.length()-1) --> son karakterin indexi = karakter sayısı - 1
        //String'in uzunluğunun (length'inin) 1 eksiği, o String'in toplam index sayısıdır
        //index 0'dan, length 1'den saymaya başlar

        //ortadaki karakteri ekrana yazdırınız
        System.out.println(ch.charAt((ch.length()-1)/2)); //space
        //22 karakter var, ikiye bölüyor 22/2=11 --> 11. karakteri yazdırıyor

        if (ch.length()%2 != 0){
            System.out.println(ch.charAt((ch.length()-1)/2));
        }else {
            System.out.println("Orta karakter yok"); //Orta karakter yok
        }
        //çift sayıların orta karakteri yoktur

        //System.out.println(ch.charAt(38));
        //charAt() methodunda olmayan bir index kullandığınızda, programı çalıştırdıktan sonra
        //console'da kırmızı hata mesajı alırız
        //String index out of range: 38 --> 'String'in indexi aralığın dışında' şeklinde hata verdi


        /*
        Java'da iki tür hata vardır;
        1)Compile Time Error: Kod yazarken alınan kırmızı alt çizgiler
        2)Run Time Error: Yazılan kod çalıştırıldıktan sonra console'da görünen kırmızı mesajlar
                          Run Time Error oluştuğunda sonraki kodlar çalışmaz
                          Java kod çalıştırmayı (execution) bırakır
         */


    }
}
