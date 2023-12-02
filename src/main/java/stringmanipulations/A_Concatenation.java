package stringmanipulations;

public class A_Concatenation {
    public static void main(String[] args) {
        //Concatenation: String'leri birleştirmek için kullanılır

        String s1 = "Java";
        String s2 = "Kolaydır";
        System.out.println(s1+" " +s2);

        //String data olduğunda "+" işaretini Java concat kabul eder
        //Concat'ın sonucu her zaman String'tir

        int g = 2;
        int h = 3;
        String i = "Java";

        System.out.println(i + g + h); //Java23
        System.out.println(g + "" + h + i); //5Java
        System.out.println(i + g * h); //Java6

        //Java soldan okumaya başlar --> String gördüğü ifadeden itibaren her şeyi String kabul eder
        //İşlem önceliğini dikkate alır
    }
}
