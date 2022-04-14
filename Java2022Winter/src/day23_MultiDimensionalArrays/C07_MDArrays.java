package day23_MultiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        //Soru 5) kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("girdiginiz cumledeki kelime sayisi : " + arr.length);
    }
}
