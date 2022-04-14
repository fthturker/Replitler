package day09_Ternary;

public class C06_NestedSorular {
    public static void main(String[] args) {

        //kullaniciden iki sayi alın ve buyuk olmayan sayiyi yazdirin
        int x=5;
        int y=10;

        System.out.println(x<y ? x : y);


        // kullaniciden bir tam sayi alın ve sayinin tek veya cift oldugunu yazdirin

        int z =10;

        String sonuc= (z/2==0 ? "Cift sayi" : "Tek sayi");
        System.out.println(sonuc);

        // Kullaniciden bir sayi alın ve sayinin mutlak degerini yazdıralım

        int sayi=-5;

        System.out.println(sayi>=0 ? "sayi" : ((-1*sayi)));

        //Kullaniciden bir sayi alin. sayi pozitifse "Sayi pozitif" yazdirin,
        // negatifse sayinin karesini yazdirin

        int t=-2;

        System.out.println(t>=0 ? "Sayi Pozitif" : "t * t");

        int d=8;

        System.out.println((d>5) ? (d<10 ? 2*d : 3*d) : (d>10 ? 2*d : 3+d));

    }
}
