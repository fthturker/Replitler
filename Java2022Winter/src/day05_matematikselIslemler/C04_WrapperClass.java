package day05_matematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {
        //primitive data turu ile non-primitive arasındaki farkler nelerdir?

        String str= "Java";
        int sayi=10;

        System.out.println(str.toUpperCase()); //JAVA
        System.out.println(str);

        //non-primitive data turleri data depolamak yanında bircok faydalı methoda sahiptir
        // ancak primitive data türlerinin boyle bir ozelligi yoktur
        //primitive data turleri sadece degerleri saklar (container)
        //primitive data turleri icin de bazı method'lar gerekli oldugnda
        //java bir cozum retmistir
        //java her bir primitive data turunu, non-primtive olarak kullanabilmek icin
        //ozel Class'lar olusturmus ve bunlara Wrapper Class adını vermistir

        double sayi2=2.25;
        //sayi2 primitive oldugundan sayi2. dedigimizde hic bir metod gelmez

        Double sayi3=3.5;

        //sayi3 wrapper class olan Double class'ini kullandıgından
        //sayi3. dedigimizde bircok method gelir








    }

}
