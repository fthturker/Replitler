package day16_MethodCreation;

public class C02_OverLoading {
    public static void main(String[] args) {

        String str="Bu da gecer ya Huu";
        str.indexOf("d");
        System.out.println(str.indexOf("d")); //3
        System.out.println(str.indexOf("a",5)); // 13
        System.out.println(str.indexOf('a',5));

        //bir class da aynı ısımde birden fazla method olmasına overloading denilir
        //ya parametre sayisi farkli olmalı
        // veya parametre sayisi aynı ise argumentlerin data turleri farklı olmalı
    }
}
