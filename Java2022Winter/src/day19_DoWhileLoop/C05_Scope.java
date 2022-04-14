package day19_DoWhileLoop;

public class C05_Scope {

    //1-  Bir method icerisinde olusturulan variable'lar sadece olusturuldukları method'da kullanılabilir
    //    baska method'larda kullanılamazlar
    //2-  Tum methodların kullanabilmesini istedigimiz variable'lari class level'da olustururuz
    //    class level'da olussturdugumuz variable'ları
    // ---statik yaparsak tum method'lar kullanılabilir
    // ---statik olmazsa (instance) o zaman sadece statik olmayan method'lar kullanılabilir
    //3-  Loop icinde olustyurulan variable'lar Loop icerisinde kullanılabilir
    //    ama Loop'un dısında kullanılamaz


    static String kurs="Java";
    int level=10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi=10;
        //isim="Vali Yan";
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i <10; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
         // System.out.println(i);
        // loopSayi=30;
            int sayi2;

        sayi4++; //class seviyesinde olusturup deger atanadıgım sayi4 'u arttırmama Java itiraz etmiyor
        // sayi2++; ama min method icerisinde olusturup deger atamadıgım sayiyi arttırmama Java izin vermiyor

    }
    public static void method1(){
        //sayi=20;
        String isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level);
    }
    public void method2(){
        //sayi=30;
        //isim="Ayse San";
        System.out.println(kurs);
        System.out.println(level);
    }
}
