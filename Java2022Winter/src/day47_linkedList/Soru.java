package day47_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Veli");
        ll1.add("Can");
        ll1.add("Ayse");

        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz:");
        String isim = scan.nextLine();

        System.out.println(ll1);

        if (ll1.remove(isim)) {
            System.out.println("bu isim LinkedList'de vardi ve silindi");
            System.out.println(ll1);

        } else {
            System.out.println("bu isim LinkedList'de yok bu yuzden silinemedi");
            System.out.println(ll1);
        }

    }
}
