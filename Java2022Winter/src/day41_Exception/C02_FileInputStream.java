package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        /*
        Bir kod yazilirken olasi exception'lar on gorulup
        exception olustugunda java'nin ne yapmasıni istedigimiz belirtilmelidir

        1- eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception 'i declare edebilirz
        2- eger exception olussa da kodun calismaya devam etmesini istiyorsak
        sorun olusturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cıkabilecek kodu
        catch bloguna olusabilecek exception'i ve
        olasi exception durumunda java'nin ne yapmasini istedigimizi yazabiliriz
         */

        String dosyaYolu="src/day41_Exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
