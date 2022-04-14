package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(5);
        sayilar.add(2,3);

        sayilar.remove(1); // index olarak 1 elementi siler

        //sayilardan olusan bir liste obje yi vererek element silme method'u calısmaz
        //sayi degeri girdigimizde java otomatik olarak sayiyi index olarak kabul eder

       // int sayi=5;
        // sayilar.remove(sayi); // IndexOutOfBoundsException

        Integer sayi=5; // Integer wrapper class'ı kullaninca sayi obje oldugundan bu method calisti
        sayilar.remove(sayi);
        System.out.println(sayilar); // [4, 3]

    }
}
