package stringmanipulations;

public class L_Replace {
    public static void main(String[] args) {

        //replace() --> bir String'i değiştirmek için kullanılır
        String s = "Tekrar et tekrar unutma";
        System.out.println(s.replace('e', 'E')); //TEkrar Et tEkrar unutma
        //tüm küçük e'leri büyük E ile değiştirdik

        System.out.println(s.replace('x', 'M')); //Tekrar et tekrar unutma
        //Olmayan bir karakteri değiştirmek istersek hata vermez
        //String içinde ne varsa olduğu gibi yazdırır --> değişkenin içini aynen görürüz

        System.out.println(s.replace("krar", "miz")); //Temiz et temiz unutma
        //Değiştirmek istedğimiz harf uzunlukları eşit olmak zorunda değil

        System.out.println(s.replace("a", "")); //Tekrr et tekrr unutm
        //Silme için de kullanılabilir
        //Bir karakteri imha etmek istedğimizde replace() methodu kullanabiliriz
        //Silmek istediğimiz karakterin yerine hiçlik koyuyor
        //Bu durum için String kullanmalıyız, çünkü char'larda "" hiçlik yoktur

        System.out.println(s.replace("", "|")); //|T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|

        System.out.println(s.replaceFirst("e", "X")); //TXkrar et tekrar unutma
        //değiştirilmek istenen karakterin sadece ilkini değiştirir, aynı olan diğer karakterlere dokunmaz


        //"Java hoştur ama zordur" cümlesinde "a" harflerinin yerine $ işareti koyun :)
        //zor olsa da sonu $ cinsinden olabilir unutmayın :)

        String str = "Java hoştur ama zordur";
        //replace() methodunu kullanacağız
        System.out.println(str.replace("a", "$")); //J$v$ hoştur $m$ zordur
        System.out.println(str.replace('a', '$')); //J$v$ hoştur $m$ zordur
        //tek karakter değiştirmek için char kullanılabilir
        //String ve char

    }
}
