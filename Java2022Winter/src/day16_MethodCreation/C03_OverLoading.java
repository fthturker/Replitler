package day16_MethodCreation;

public class C03_OverLoading {
    public static void main(String[] args) {
        //verilen iki sayıyı toplayıp yazdıran bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        ikiSayiTopla(sayi1, sayi2);

        //iki double sayinin toplamini yazdıran bir method olusturalım

        double sayi3 = 15.2;
        double sayi4 = 10.3;

        ikiSayiTopla(sayi3, sayi4);

        // eger variable olusturmadan direk sayıları yazarak method call yaparsam

        ikiSayiTopla(15, 25); //int toplamı verir
        ikiSayiTopla(10.1, 12.3); // double toplam verir

        //bir integer ile bir double toplamını yazdıran bir method olusturalım

        int sayi5 = 3;
        double sayi6 = 3.2;

        ikiSayiTopla(sayi5, sayi6);


    }
    private static void ikiSayiTopla(int sayi3, double sayi4) {
        System.out.println("bir integer bir double toplamı : " + (sayi3 + sayi4));
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplamı : " + (sayi3 + sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1+ sayi2));
    }

    private static void ikiSayiTopla(double sayi1, int sayi2) {
        System.out.println("bir double bir integer toplami : " + (sayi1 + sayi2));
    }
}
