package aracSigortaApp;

import java.util.Scanner;

public class TekrarArac {
  /*  Tarife dönemi:Aralık 2023,Haziran 2023
            1.dönem :Haziran 2023               2.dönem:Aralık 2023
    otomobil: 2000                       otomobil: 2500
    kamyon:   3000                       kamyon:   3500
    otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
    motosiklet: 1500                     motosiklet: 1750*/
    public String type;//otobus
    public int prim;

    public void hesaplaPrim(int donem){
      //tipine göre hesaplama
      switch (this.type){
        case "otomobil":
          this.prim=donem==1 ? 2000:2500;
        case "kamyon":
          this.prim=donem==1 ? 3000:3500;
        case "otobus":
        case "motosiklet":
          this.prim=donem==1 ? 1500:1700;
        default:
      }

    }
    public void hesaplaOtobusPrim(int donem){
      Scanner scan =new Scanner(System.in);
      System.out.println("Otobüs tipini seciniz");
      System.out.println("1. 18-30 arasi koltuk sayisi");
      System.out.println("2. 31 ve uzeri koltuk sayisi");
      int otobusTipi = scan.nextInt();
      switch (otobusTipi){
        case 1:
          this.prim=donem==1?4000:5000;break;
        case 2:
          this.prim=donem==1?4500:5500;break;
        default:
          System.out.println("Hatalı giriş yaptınız..");
          this.prim=0;
      }

    }
}
