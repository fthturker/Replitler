package day04_dataCasting_Incerement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10); //30
        //bu satırda sayiyi 10 artirmadım
        //sayının 10 fazlasını yazdırdım

        System.out.println(sayi); //20
        //eger atama yapmazsak sayida yaptıgımız artırma veya azaltma kalici olmaz

        sayi=sayi+10;
        System.out.println(sayi); //30

        System.out.println(sayi=sayi+=10); //40
        System.out.println(sayi);   //40
        //bir variable'ın degerini kalici olarak artirmak veya azaltmak isterseniz assigment sarttir

        System.out.println("22.satır " + sayi++); //50
        System.out.println("23.satır " + sayi); //51

        System.out.println("25.satır " + ++sayi); //42
        System.out.println("26.satır " + sayi); //42
    }
}
