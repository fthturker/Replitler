package day18_nestedForLoop;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        // Soru12) kullaniciden pozitif bir rakam girmesini isteyin
        // ve girilen rakama göre asagidaki sekli cizdirin
        //  *
        //  * *
        //  * * *
        //  * * * *

        int input=5;


        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                //nested for loop ya dikdortgen formatında olabilir veya ucgen formatında olabilir
                //dıkdortgen formatında istedigimizde iki loop icin de bagımsiz en point belirleriz
                //ucgen sekli vermek icin inner loop 'un end point'ini olarak outer degiskene baglı yaparız

                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
