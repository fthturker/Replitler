package day17_forloop;

public class C09_Soru_10 {
    public static void main(String[] args) {

        //Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz

        int sayi1=1;
        int sayi2=5;

        int sayilerinToplami=0;

        for (int i = sayi1; i <=sayi2 ; i++) {
            sayilerinToplami += i;
        }
        System.out.println("sayilerinToplami = " + sayilerinToplami);
    }
}
