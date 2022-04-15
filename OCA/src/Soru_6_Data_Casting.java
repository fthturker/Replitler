public class Soru_6_Data_Casting {
    public static void main(String[] args) {
        //kod'da yapacagimiz hangi degisiklik kodun calismasini saglar
        //uyan tum siklari isaretleyin

        long x=10;
        //int y =2*x;

        //primitive ve sayisal data turlerindeki verileri birbirine cevirmek
        // byte short int long float double
        byte sayi1=15;
        short sayi2=sayi1; // sayi2 'ye 15 degerini atadik
        long sayi3=1500;
        double sayi4=sayi3;

        int sayi5=65;
        short sayi6=(short)sayi5;

        sayi5=150;
        byte sayi=(byte)sayi5;
        System.out.println("sayi = " + sayi); // sayi = -106
        /*
        A. No change; it compiles as is. Y
        B. Cast x on line 9 to int. // int y =2*(int)x; D
        C. Change the data type of x on line 8 to short. D
        D. Cast 2 * x on line 9 to int.   int y =(int)(2*x); D
        E. Change the data type of y on line 9 to short. Y
        F. Change the data type of y on line 9 to long. D
         */
    }

}
