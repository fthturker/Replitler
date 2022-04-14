package day06_Concatenation_Operators;

public class C02_MantikOperatorleri {

    public static void main(String[] args) {
        System.out.println(5+2==8); //false

        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc1); //true

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc2); //false

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3); //false

        // && ile & arasındaki fark

        int sayi3=15;

        //sayi3'un 10 ile 20 aralıgunda oldugunu true diyerek dondurelim
        //java uclu karsılastırma kabul etmez
        //ikili karsılastırmalar yapıp mantıksal operatorlerle birlestirmeliyiz

        System.out.println(10<sayi3 && sayi3<20);//true

        int sayi4=5;
        // sayi4 un 10 ile 20'in arasında olmadıgınıtrue diyerek dondurelim

        System.out.println(sayi4<10 || sayi4>20);//true
    }
}
