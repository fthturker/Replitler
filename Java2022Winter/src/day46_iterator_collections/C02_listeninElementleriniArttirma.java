package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_listeninElementleriniArttirma {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); //[5, 7, 6, 6, 9]
        /*
        listenin tum elementlerini bize getirmesi icin
        iterator'ın hasNext() ve next() methodlarini kullanacagiz

         */

        ListIterator itr = liste.listIterator();
        while (itr.hasNext()){ // yaninda element oldugu muddetce calisacak
            Object sayi = itr.next();
            itr.set((Integer)sayi+3);

        }
        System.out.println(liste); // [8, 10, 11, 9, 12]

    }

}
