package stringmanipulations;

public class G_LastIndexOf {
    public static void main(String[] args) {

        //lastIndexOf() --> istenen indexin String'teki son görünümünü verir

        String s = "Tekrar et tekrar unutma";

        System.out.println(s.lastIndexOf('e')); //11

        System.out.println(s.lastIndexOf("rar")); //13

        //String bloğu arattığımızda son görünümünün ilk indexini verir

        System.out.println(s.lastIndexOf('r', 16)); //15

        //bu şekilde kullandığımızda indexOf() methodunun tersini yapar
        //İkinci parametreden öncesinde 'a' nın son görünümüne bakar, tersten alır

        System.out.println(s.lastIndexOf("k", 14)); //12

        //char ve String ile kullanılabilir, son görünümü verir




    }
}
