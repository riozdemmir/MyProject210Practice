package arrays;

import java.util.Arrays;

public class Ornek02 {
    public static void main(String[] args) {
       /* String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        */
        String[] str={"Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        System.out.println(Arrays.toString(str));// [Kemal, Jonathan, Mark, Angie, Veli]
        int min =str[0].length();
        for (String w:str) {
           min=Math.min(min,w.length());
        }
        System.out.println(min);
        for (String w:str) {
            if (min==w.length()){
                System.out.print(w+" ");
            }

        }



    }//Main..
}
