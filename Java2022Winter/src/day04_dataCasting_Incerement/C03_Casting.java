package day04_dataCasting_Incerement;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2); //2

        sayi2=3;

        System.out.println(sayi1/sayi2); //2.66666666 =>2 verir

        sayi1=22;
        System.out.println(sayi1/sayi2); //7.3333333 =>7 verir
        //java iki integer sayıyı birbirine bolerse soncu da integer olarak verir
        //eger virgulden sonra kusurat varsa siler

        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2; //478.6
        System.out.println(sayi1); //478

        sayi1=sayi1/sayi2;
        System.out.println(sayi1); //47

        sayi1=sayi1/sayi2; //4.7
        System.out.println(sayi1); //4

        sayi1 = sayi1 / sayi2; //0.4
        System.out.println(sayi1); //0

        sayi1 = 4895;
        double sayi3 = 10;

        //sayi1 = sayi1 / sayi3;
        //iki farklı sayı data turune ısleme koydugumuzda Java kucuk olan data turu ıcın auto widening yapar
        //bu ıslemi dusunursek sayi1/sayi3=> islemin sonucunu double kabul eder

        System.out.println(sayi1/sayi3); //489.5

        System.out.println(sayi3/sayi1); //0.0020429009193054137
    }
}
