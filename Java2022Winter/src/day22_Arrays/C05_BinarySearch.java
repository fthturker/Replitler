package day22_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // verilen array'de istenen bir elementin var olup olmadıgını true/false
        // yazdirarak gosteren bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 10;

        istenenElemanVarMi(arr, istenenSayi);

        // eger java da Binarysearch ile yapmak isterseniz
        // once sort method'unu kullanıp, sonra Binarysearch yapmaliyiz

    }

    public static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenenSayi) {
                sonuc = true;

                break;
            }
        }
        System.out.println(sonuc);
    }
}
