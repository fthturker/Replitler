package day01;

import java.util.Arrays;
import java.util.Scanner;

public class C00 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        System.out.println("Lutfen bir harf giriniz : ");
        String harf = scan.next().substring(0,1);

        int sayac=0;

        String arr[]=cumle.split("");
        Arrays.sort(arr);

        for (String each : arr
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        System.out.println("girdiginiz metinde istediginiz harf " +sayac+ " kullanilmistir" );


    }
}