package day07_ifElseStatements;

import java.util.Scanner;

public class C11_IfElseStatementsSoru2 {
    public static void main(String[] args) {
        //Soru2: Kullaniciden bir karakter girmesini isteyin ve
        //girilen karakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz:");
        char karakter= scan.next().toLowerCase().charAt(0);

        if (Character.isDigit(karakter)){
            System.out.println("girdiginiz karakter rakamdır");
        }else if (Character.isLetter(karakter)) {
            System.out.println("girdiginiz karakter harftir");
        } else {
            System.out.println("girdiginiz karakter semboldur");
        }
    }
}
