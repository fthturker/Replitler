package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K \nErkek icin E \nharfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();


        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("Emekli olamazsın \nDaha " + (60-yas) + " yıl calısman gerekir");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else if (cinsiyet=='E'){

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("Emekli olamazsın \nDaha " + (65-yas) + " yıl calısman gerekir");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else{

            System.out.println("Lutfen cinsiyet icin gecerli bir Harf giriniz");
        }
    }
}
