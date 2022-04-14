package day19_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullaniciden bir pozitif tam sati alıp
        // While loop ile 'sayidan kucuk pozitif tamsayılari yazdirin

        int input=5;
        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }
        //aynı soruyu do While Loop ile yapalım

        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);
    }
}
