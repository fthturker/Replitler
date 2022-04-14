package day17_forloop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız

        char ilkHarf='a';
        char sonHarf='z';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " ");
        }

        double baslangıc=10;
        double bitis=20;
        double artis=0.2;
        //baslangıc ve bitis sayıları arasında artıs miktarı ıle olusacak
        // tum sayıları yazdirin.

        for (double i = baslangıc; i <=bitis ; i+=artis) {
            System.out.print(i + " ");
        }

    }
}
