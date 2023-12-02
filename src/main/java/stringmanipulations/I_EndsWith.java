package stringmanipulations;

public class I_EndsWith {
    public static void main(String[] args) {
        //endsWith() --> method içine yazdığımız String ifade ile bitiyor mu?

        String s = "Testi çöz kendini gör";

        System.out.println(s.endsWith("r")); //true

        System.out.println(s.endsWith("gör"));//true

        System.out.println(s.endsWith("kendini gör")); //true

        System.out.println(s.endsWith("")); //true

        //boolean return eder --> true, false
        //Bu method sadece String ile çalışır, char kabul etmez

        String str = "Java kolaydir";

        System.out.println(str.endsWith("")); //true

        System.out.println(str.endsWith("r")); //true

        System.out.println(str.endsWith("Java kolaydir")); //true

        System.out.println(str.toLowerCase().endsWith("dir")); //true

        System.out.println(str.endsWith("dır")); //false
    }
}
