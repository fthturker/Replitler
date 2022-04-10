package day01;

public class C01 {
    public static void main(String[] args) {
        int sayi= 5;
        char karakter='*';

        for (int i = 0; i <= sayi; i++) {
            for (int j = i; j <=sayi ; j--) {
                System.out.println("");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(karakter);
            }
            System.out.println();
        }


    }
}
