package day02_variables;

public class C03_Variables {

    public static void main(String[] args) {

        String ogrenciIsmi="Mehmet";
        ogrenciIsmi="Furkan";

        //bir variable deckare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak declare edilen bir variable tekrar declare edilemez
        //String ogrenciIsmi="Abdullah";

        String isim,soyisim,dogumYeri;
        isim="Fatih";
        soyisim="Turker";
        dogumYeri="Almanya";

        String tcNo="12345678901";
        String hiclik="";
        //String non-primitive oldugu icin biz sadece data saklamak icin degil
        //ekstra bazı özellikleri de kullanabiliyoruz
        //eger Tc No, okul numarası veya telefon numarası gibi
        //kendisi sayısal olan ancak matematiksel bir islemde kullanılmayan
        //degerler icinde String kullanılabilir

        String harf="A";
        char harf2='A';
        //bu ikisi icinde aynı durm gecerli
        //ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        //eger sadece saklayacaksak char kullanılabilir ama
        //String'in özelliklerinden istifade etmek icin String olarak tanımlamak daha avantajlı olabilir
    }
}
