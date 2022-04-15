public class Soru_5_NullPointer {
    public static void main(String[] args) {
        // yazilan kod blogunun output'u nedir?

        int x=0;
        String s= null;
/*
        if (x==s){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
*/
        /*
        int sayi=null;
        boolean bl=null;
        primitive data turleri icin null pointer kullanilamaz
         */
        // non primitive tum data turlerinde null pointer kullanilabilir
        Integer sayi=null;
        Boolean bl=null;

        String str1;
        String str2=new String();
        String str3="";
        String str4=null;

        // bir string'e deger atayabiliriz
        // bu 4 variable atama acisindan ayni durumdadir
        // hepsine yeni deger atanabilir ve yeni hali kullanilabilir
        //str4="java";
        //System.out.println(str4); // java

        // bir String'i yazdirabilirim
        //System.out.println(str4); // null

        // null atamasi yaptigimiz String yazdirildiginde null sonucunu goruruz
        // bu bir String degil sadece str4'e null atandiginin isaretidir

        // bir String ile manipulation yapabilirim

        //System.out.println("java " + str1);
        //str1 deger atamasi yapilmadigindan kullanilamaz, alti kirmizi cizilir, kod calismaz
        //str4 icin Java null yazdirir, islem yapilmasina itiraz etmez ama
        //str4'un null olarak isaretlendigini bize bildirir

        System.out.println(str4.length());
        //str1 deger atamasi yapilmadigindan kullanilamaz, alti kirmizi cizilir, kod calismaz
        //str4 icin NullPointerException verir

        // yazilan kod calismaz...

    }
}
