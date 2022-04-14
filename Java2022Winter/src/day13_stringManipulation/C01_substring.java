package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); //ile IT cok guzel
        // yukarıdaki String'i Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));

        System.out.println(str.substring(9));// yazılan index inclusive

        //eger bir inde'den sona kadar olan parcayi degil
        //belirli bir parcayı almak istersek
        //2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi
        //baslangıc indexi==> inclusive/dahil
        //bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5)); //java
        System.out.println(str.substring(0,1)); //J
        String harf=str.substring(5,6);// i bana 6.karakter String olaral bulun
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); //"" (hıclik)

        //System.out.println(str.substring(5,2)); //bitis indexi baslangıc index'inden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); //son harfi verir (r)
        System.out.println(str.substring(str.length()-5)); //son 5 harfi yazdıralım (siyor)
        System.out.println(str.substring(str.length())); //son harften sonraki kısmı yani hiclik verir

    }
}
