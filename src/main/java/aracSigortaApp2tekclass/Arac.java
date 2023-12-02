package aracSigortaApp2tekclass;

import java.util.Scanner;

public class Arac {//POJO class:fields,getter-setter,constructor,toString
    //data hiding:encapsulation

    private String type;//aracın tipi, kullanıcıdan alacağız

    private int prim;//tarife dönemine göre biz hesaplıyoruz

    //getter-setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrim() {
        return prim;
    }
//    Tarife dönemi:Aralık 2023,Haziran 2023
//  1.dönem :Haziran 2023               2.dönem:Aralık 2023
//    otomobil: 2000                       otomobil: 2500
//    kamyon:   3000                       kamyon:   3500
//    otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
//    motosiklet: 1500                     motosiklet: 1750

    public void setPrim(int term) {

        //aracın tipine ve tarife dönemine göre
        switch (this.type){
            case "otomobil":
                this.prim=term==1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim=term==1 ? 3000 : 3500;
                break;
            case "otobüs":
                countBusPrim(term);
                break;
            case "motosiklet":
                this.prim=term==1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatalı giriş!");
                this.prim=0;
                break;
        }


    }

    private void countBusPrim(int term) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Otobüs tipini seçiniz: ");
        System.out.println("1. (18-30) Koltuk arası");
        System.out.println("2. 31 Koltuk ve üzeri");
        int busType=inp.nextInt();
        switch (busType){
            case 1://18-30 koltuk arası
                this.prim=term==1 ? 4000 : 4500;
                break;
            case 2://31 koltuk üzeri
                this.prim=term==1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatalı giriş:(");
                this.prim=0;
                break;
        }

    }


}