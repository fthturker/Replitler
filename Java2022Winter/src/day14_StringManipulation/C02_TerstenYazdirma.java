package day14_StringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //Soru5) kullaniciden 4 harfli bir kelime isteyin
        //ve girilen kelimeyi ilk harfi buyuk
        // digerleri kucuk olarak tersten yazdirin.

        String input="Mavi";

        String tersStr= input.substring(3).toUpperCase() +
                        input.substring(2,3).toUpperCase() +
                        input.substring(1,2).toUpperCase() +
                        input.substring(0,1).toUpperCase();

        System.out.println(tersStr);




    }
}
