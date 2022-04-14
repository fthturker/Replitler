package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // iki variable'ın degerlerini toplayan bir method olusturalım
        // 1. adim : method adını yazalim
        // 2. adim : method'a göndermem gereken arguman var mi?

       ikiSayiTopla(30,57);

       C04.besHarfiTersineCevir("fatih");

    }
    //bir method'u olusturmak calıstırması ıcın yeterli degildir
    //method ancak cagrılırsa calısırız
    //aynı class veya farklı class'da olmasının hic bir öonemi yoktur
    //Java main method'da yukarıdan asagıya dogru calısır
    //ve geldigi satırı calıstırır

    public static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami :" + (a+b));
    }
}
