package atm_app;

import java.util.Scanner;

public class Atmm {
     /* Q01
  Bakıye (başlangıç bakıyesi 1000 tl)
  öğrenme,
  para yatırma
  cekme,
  çıkışşş
  işlemlerinin yapıldıgı bir ATM app. method create ediniz.
  */
    double bakiye = 1000;
    double para;
    int secenek;

    String sifre ="123a";
    String girilenSifre;

    Scanner input =new Scanner(System.in);

    public void sifreGir(){
        System.out.println("Lütfen şifrenizi giriniz..");
        girilenSifre = input.nextLine();
        if (girilenSifre.equals("123a")){
            System.out.println("Hesabınıza hoşgeldiniz..");
        }else {
            System.out.println("Hatalı bir şifre girdiniz..Lütfen yeniden deneyiniz..");
            sifreGir();
        }
    }
    public void bakiyeOgren(){
        System.out.println("Hesabınızda "+bakiye+" TL bulunmaktadır..");
        basla();
    }

    public double paraCek(){
        System.out.println("Lütfen çekmek istediğiniz miktarı giriniz..");
        para = input.nextDouble();
        if (para<=bakiye){
            bakiye-=para;
        }else {
            System.out.println("Çekebileceğiniz miktar "+bakiye+" 'dir..");
        }
        basla();
        return bakiye;

    }
    public double paraYatir(){
        System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz..");
        para = input.nextDouble();
        bakiye+=para;
        basla();
        return bakiye;
    }
    public void cikis(){
        System.out.println("Teşekkür ederiz.. Iyi günler");
    }
    public void basla(){
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.." +
                "\nPara yatırmak için 1'e basınız.." +
                "\nPara çekmek için 2'ye basınız.." +
                "\nBakiyenizi öğrenmek için 3'e basınız.." +
                "\nÇıkmak için 4'e basınız..");
        secenek = input.nextInt();
        switch (secenek){
            case 1:paraYatir();
            break;
            case 2:paraCek();
            break;
            case 3:bakiyeOgren();
            break;
            case 4:cikis();
            break;
            default:
                System.out.println("Hatalı bir giriş yaptınız.. Lütfen tekrar giriş yapmayı deneyiniz..");
                basla();
        }


    }







}//Class
