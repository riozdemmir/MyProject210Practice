package stringmanipulations;

public class O_Trim {
    public static void main(String[] args) {

        //trim(); --> tıraş etmek, kırpmak, kırıkları aldırmak
        //String'in başındaki ve sonundaki space'leri silmek için kullanılır
        //String'in içindeki space'lere dokunmaz

        String t = "      Java kullanmayı öğreniyorum          ";

        System.out.println("Trim kullanmadan önce :" + t); //      Java kullanmayı öğreniyorum
        System.out.println("Trim kullandıktan sonra :" + t.trim()); //Java kullanmayı öğreniyorum

    }
}
