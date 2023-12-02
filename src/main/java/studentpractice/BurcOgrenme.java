package studentpractice;

import java.util.Scanner;

public class BurcOgrenme {
        /* Burç Bulan Program - Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
     */
        public static void main(String[] args) {
                Scanner input =new Scanner(System.in);
                int ay, gun;
                System.out.println("Lütfen doğduğunuz ayı rakam olarak giriniz.. (1-12)");
                ay = input.nextInt();
                System.out.println("Lütfen doğduğunuz günü rakam olarak giriniz.. (1-31)");
                gun = input.nextInt();
                String burc ="";
                if (ay<=0 || ay>12){
                        System.out.println("Girilen ay numarası hatalıdır..");
                        return;
                }
                if (gun<=0 || gun>31){
                        System.out.println("Girilen gun numarası hatalıdır..");
                        return;
                }
                switch (ay){
                        case 1:
                                if (gun<=21){
                                     burc = "Oğlak";
                                }else {
                                    burc = "Kova";
                                }
                                break;

                        case 2:
                                if (gun<=19){
                                        burc = "Kova";
                                }else {
                                        burc = "Balık";
                                }
                                break;

                        case 3:
                                if (gun<=20){
                                        burc = "Balık";
                                }else {
                                        burc = "Koç";
                                }
                                break;

                        case 4:
                                if (gun<=20){
                                        burc = "Koç";
                                }else {
                                        burc = "Boğa";
                                }
                                break;

                        case 5:
                                if (gun<=21){
                                        burc = "Boğa";
                                }else {
                                        burc = "Ikizler";
                                }
                                break;

                        case 6:
                                if (gun<=22){
                                        burc = "Ikizler";
                                }else {
                                        burc = "Yengeç";
                                }
                                break;

                        case 7:
                                if (gun<=22){
                                        burc = "Yengeç";
                                }else {
                                        burc = "Aslan";
                                }
                                break;

                        case 8:
                                if (gun<=22){
                                        burc = "Aslan";
                                }else {
                                        burc = "Başak";
                                }
                                break;

                        case 9:
                                if (gun<=22){
                                        burc = "Başak";
                                }else {
                                        burc = "Terazi";
                                }
                                break;

                        case 10:
                                if (gun<=22){
                                        burc = "Terazi";
                                }else {
                                        burc = "Akrep";
                                }
                                break;

                        case 11:
                                if (gun<=21){
                                        burc = "Akrep";
                                }else {
                                        burc = "Yay";
                                }
                                break;

                        case 12:
                                if (gun<=21){
                                        burc = "Yay";
                                }else {
                                        burc = "Oğlak";
                                }
                                break;

                }
                System.out.println("Girilen ay ve gun numaralarına göre burcunuz = "+burc+"'dir..");

        }//Main..
}
