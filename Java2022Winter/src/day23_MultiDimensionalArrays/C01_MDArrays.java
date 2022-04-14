package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]= {{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);

        // ilk inner array'in tum elementlerini yazdirin
        System.out.println(arr[0]); //arr[0] bir array oldugundan direk yazdırılamaz
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]

        System.out.println(Arrays.toString(arr)); // [[I@1b28cdfa, [I@eed1f14]
        //MDArray de tum elementleri bir array olarak yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]]




    }
}
