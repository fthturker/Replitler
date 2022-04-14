package day11_stringManipulation;

import java.util.Scanner;

public class C00_Odev1 {
    //kullanıcıdam bir cumle ve bir harf isteyin cumlede
    // var olup olmadıgını yazdırın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (cumle.indexOf(harf) == -1) {
            System.out.println("girdiginiz harf cumlede yoktur");
        } else {
            System.out.println("girdiginiz harf cumlede vardır");
        }


    }
}
