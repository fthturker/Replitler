package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden elementleri silip
        //unit elementlerden olusan bir array haline donduren bir method yaziniz
        Integer arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};

        arr = benzersizYap(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8]
    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet = new TreeSet<>();
        for (Integer each : arr
        ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet); // [1, 2, 3, 4, 5, 6, 7, 8]
        // Set'de index yapisi yoktur. dolayisiyla for loop kullanmayiz

        Integer arrBenzersiz[] = new Integer[benzersizSet.size()];
        int index = 0;
        for (Integer each : benzersizSet
        ) {
            arrBenzersiz[index] = each;
            index++;
        }

        return arrBenzersiz;
    }
}
