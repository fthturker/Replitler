package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullanıcıya derse katılıp katılmak istemedigini sorun
        //ever derse, cevabını ve "derse katılımınız alınmıstır" yazdırın
        //hayır derse, cevabını ve "Sonraki derslerimize bekleriz" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Derser katılmak ister misiniz ? \nEvet veya Hayir yazınız");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız : " + cevap + "\nderse katılımınız onaylanmıstır ");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabınız : " + cevap + "\nSonraki derslerimize bekleriz");
        } else {
            System.out.println("lutfen evet veya hayir yazınız");
        }
    }
}
