package day05_sorular;

public class C05_soru_1 {
    public static void main(String[] args) {
        //SORU:byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adım adım widening yapın ve yazdırın

        byte sayi1=60;
        System.out.println(sayi1); //60

        short sayi2=sayi1;
        System.out.println(sayi2); //60

        int sayi3=sayi2;
        System.out.println(sayi3); //60

        float sayi4=sayi3;
        System.out.println(sayi4); //60.0

        double sayi5=sayi4;
        System.out.println(sayi5); //60.0

    }
}
