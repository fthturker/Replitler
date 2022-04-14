package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};
        // arr[3]=8; array'de olmayan bir index'e atama yapamayiz

        // arr={1,3,5,6};  // var olan bir array'e ayni boyutta bile olsa direk yeni degerler iceren bir

        arr = new int[4];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        int arrYeni[] = new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arrYeni)); // [0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr)); // [2, 0, 0, 5, 0]

        // bir array'e icinde hazir elementlerin oldugu yeni bir deger atamak isterseniz
        // bunu {1,2,3} seklinde yazarak degil
        //new int[3] diyerek olusturup sonra deger atayarak tamamladıgımız bir array'i
        // assing ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]


    }
}
