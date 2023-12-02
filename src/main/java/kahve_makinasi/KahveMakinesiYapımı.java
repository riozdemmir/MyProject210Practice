package kahve_makinasi;

import java.util.Scanner;

public class KahveMakinesiYapımı {




    public static void main(String[] args) {

        String kahvecesitleri =
                "1 :  Türk Kahvesi\n" +
                        "2 :  Filtre Kahve\n" +
                        "3 :  Espresso";


        System.out.println( kahvecesitleri);
        System.out.println("kac numaralı kahveyı almak istersiniz");
        Scanner input = new Scanner(System.in);
        int kahvesecimi = input.nextInt();



        String seker =
                " a ) sekerli\n"
                        + " b ) sekersiz\n"
                        + " c ) orta sekerli\n"
                        + " d ) az sekerli";

        System.out.println(seker);
        System.out.println("kahvenizin kahve durumunu seciniz:");

        input.nextLine();// biz daha öncesinden int veri sakladığım için bu komudu yazarak ben artık strıng saklamak istiyorum diyoruz
        String sekerdurumu =input.nextLine();

        String secim ="";
        if (sekerdurumu.equals("a")){
            secim = "Sekerli";
        } else if (sekerdurumu.equals("b")) {
            secim = "Sekersiz";

        } else if (sekerdurumu.equals("c")) {
            secim = "Orta sekerli";
        } else if (sekerdurumu.equals("d")) {
            secim = "Az sekerli";

        }else {
            System.out.println("seker seciminiz gecersizdir");


        }



        String sut =
                "* ) sütlü \n"
                        + "# ) sütsüz ";

        System.out.println(sut);
        System.out.println("kahvenizin süt durumunu seciniz");

        input.nextLine();
        String sutdurumu = input.nextLine();

        String secim1 ="";

        if (sutdurumu.equals("*")){
            secim1 = "sütlü";

        } else if (sekerdurumu.equals("#")) {
            secim1 = "sütsüz";

        }else {
            System.out.println("gecersiz süt secimi");
        }
        String boyut =
                " B ) Büyük Boy\n" +
                        " K ) Kücük Boy\n" +
                        " O ) Orta Boy";
        System.out.println(boyut);
        System.out.println("lütfen bardak boyudunuzu seciniz");
        String bardakboyudu = input.nextLine();
        String secim2 = "";
        if (bardakboyudu.equals("B")){
            secim2 = "Büyük Boy";
        } else if (bardakboyudu.equals("K")) {
            secim2 = "Kücük Boy" ;
        } else if (bardakboyudu.equals("O")) {
            secim2 = "Orta Boy";
        }else {
            System.out.println("gecersiz bardak secimi");
        }

        switch (kahvesecimi){
            case 1 :
                System.out.println("Kahveniz hazırlanıyor");
                String bildirim1 = secim+secim1+secim2+" Türk Kahveniz Hazır \n Afiyet olsun ";
                System.out.println(bildirim1);
                break;
            case  2 :
                System.out.println(" Kahveniz hazırlanıyor ");
                String bildirim2 = secim+secim1+secim2+" Filtre Kahveniz Hazır \n Afiyet olsun ";
                System.out.println(bildirim2);
                break;
            case 3 :
                System.out.println(" Kahveniz hazırlanıyor ");
                String bildirim3 = secim+secim1+secim2+" Esprossonuz Hazır \n  Afiyet olsun ";
                System.out.println(bildirim3);
            default:
                System.out.println("Kahve seciminiz hatalıdır");
        }











    }
}