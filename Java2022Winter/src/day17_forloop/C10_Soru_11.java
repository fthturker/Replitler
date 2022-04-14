package day17_forloop;

import java.util.Scanner;

public class C10_Soru_11 {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve
        // girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz : ");
        int girilenSayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <=girilenSayi ; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(girilenSayi + "!= " + faktoriyel);
    }
}
