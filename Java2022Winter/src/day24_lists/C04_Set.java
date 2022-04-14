package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("Fatih");
        isimler.add("Yavuz");
        isimler.add("Zeynep");
        isimler.add("Ayse");
        System.out.println(isimler); // [Fatih, Yavuz, Zeynep, Ayse]

        isimler.set(1,"Seckin"); // yavuz gitti yerine seckin geldi
        System.out.println(isimler);  // [Fatih, Seckin, Zeynep, Ayse]

        // daha onceden listede var olanları da arsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler);  // [Fatih, Seckin, Cosmos, Ayse]
        System.out.println(logListesi);  // [Zeynep]

    }
}
