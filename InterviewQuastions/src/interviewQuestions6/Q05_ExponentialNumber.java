package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve ust giriniz :");
        int taban = scan.nextInt();
        int ust = scan.nextInt();

        int sonuc = 1;
        while (ust != 0) {
            sonuc *= taban;
            ust--;
        }
        System.out.println("while ile sonuc : " +sonuc);

        for (int i = 1; i <ust ; i++) {
            sonuc *=taban;
        }
        System.out.println("for ile sonuc : " +sonuc);
    }
    /*
    Scanner scan = new Scanner(System.in);
        System.out.println("Sayi1");
    int sayi1= scan.nextInt();
        scan.nextLine();           //Dummy
        System.out.println("sayi2");
    int sayi2= scan.nextInt();
        scan.nextLine();        //dummy
        System.out.println(Math.pow(sayi1,sayi2));
        */

}