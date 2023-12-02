package ornek_grup;

public class Ornek3 {
    public static void main(String[] args) {
        //ÖRNEK 3 ) Verilen bir string tersten yazan kodu yazınız.

        String s = "Arife Eren";
        String ters ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            ters+=s.charAt(i);
        }
        System.out.println(ters);
        // ÖRNEK 2 ) 100'den 1 'e kadar tüm tam sayıları ekrana aynı satırda aralarına boşluk koyarak yazdırınız
        int sum2=0;
        for (int i = 100; i >0 ; i--) {
            sum2+=i;
        }
        System.out.println(sum2);

    }
}
