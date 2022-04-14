package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day42_exceptions/dosya";

        try {
            FileInputStream fis =new FileInputStream(dosyaYolu);
            int k =0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Exceptions'lar icinde parent child iliskisi mevcuttur
        Bir kod icin birden fazla exceptions olusma ihtimali varsa
        Oncelikle olasi exceptions'lar parent child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent child iliskisi yoksa, istedigimiz sirada cathc cumleleri olusturabiliriz

        Eger parent child iliskisi varsa sadece parent exceptions'u yazabiliriz
        veya ikisini de yazmak istersek child'i once paret'i sonra yazmaliyiz
         */


        /*
        alti cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altıni cizer
        biz bugune kadar tamamina CTE diyorduk ancak exceptions'la birlikte
        Compile Time Exception kavrami da hayatimiza girdi
         */


    }
}
