package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //verilen bir array i listeye cevirme

        String arr[] = {"A", "B", "C"};
        List<String> arraydenList = Arrays.asList(arr);

        // arreyden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        //dolayısıyla yeni list ile add(), remove(), clear() gibi method'lar calıstirmak
        //istedigimizde Exeption olusur

        // arraydenList.add("J"); // .UnsupportedOperationException
        System.out.println("18.satirda list : " + arraydenList); // 18.satirda list : [A, B, C]

        arr[1] = "F";

        System.out.println("23 satirda Array : " + Arrays.toString(arr)); // 23 satirda Array : [A, F, C]
        System.out.println("24 satirda list : " + arraydenList); // 24 satirda list : [A, F, C]

        arraydenList.set(0, "Y");
        System.out.println("26 satirda Array : " + Arrays.toString(arr)); // 26 satirda Array : [Y, F, C]
        System.out.println("27 satirda list : " + arraydenList); // 27 satirda list : [Y, F, C]

    }
}