package day22_Arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        // verilen bir array'i buyukten kucuge siralayip yaazdiran bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        terstenSiralaYazdir(arr);

        // en buyuk sayiyi yazdir
        System.out.println(arr[0]); // 0

    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[] = new int[arr.length];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {  //[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

            tersArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(tersArr));
    }
}
