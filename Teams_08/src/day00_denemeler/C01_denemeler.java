package day00_denemeler;

import java.util.Scanner;

public class C01_denemeler {
    /* TASK :
       Kullanicidan bir String isteyin. Kullanicinin girdigi
       String’in palindrome olup olmadigini kontrol eden bir program yazin.

        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine();


        String terstenKelime ="";
        for (int i = kelime.length()-1; i >= 0; i--) {
            terstenKelime += kelime.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi : " +terstenKelime);
        if (kelime.equalsIgnoreCase(terstenKelime)) {
            System.out.println("yazdıgınız kelime Polindrome dur");
        } else {
            System.out.println(" yazdıgınız kelime polindrome degildir");
            System.out.println("Tekrar deneyiniz...");
        }
    }
}

