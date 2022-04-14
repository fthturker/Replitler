package day19_DoWhileLoop;

public class C01_WhileLoop {
        //Kullaniciden bir sayi alin ve
        //bu siyinin rakamlari toplamini yazdirin

    public static void main(String[] args) {
        int input=100;

        //for loop lada yapabiliriz ama biz
        //while loop ile yapalim

        int bolen=1;
        int sayac=0;  //kac tane oldugu nu gormek icin sayac koyduk

        while (bolen<=input){

            if (input % bolen == 0 ){
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;

        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " +sayac + " adet sayi vardir");
    }
}
