package day15_methodCreation;

public class C07_methodCreation {
    public static void main(String[] args) {


        //string'i yazdıran method olusturalım
        //hosgeldiniz diyen bir method olusturun
        // kapanma mesajı yazan bir method olusturalım

       hosgeldinYazdir();


    }

    public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
