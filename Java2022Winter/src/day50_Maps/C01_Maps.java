package day50_Maps;

import day49_Maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        // sinif daki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifList = MapOlustur.myMap();
        System.out.println(sinifList);

        /*
         eger key'lere tek tek ulasmak istersek
         index yapisina ihtiyacimiz var
         ancak map index yapisini desteklemez
         bunun icin key'leri once bir set'e
         sonra da set'in tum elemenlerini bir list'e ekledik
         */
        Set<Integer> sinifKeySet = sinifList.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySet);

        System.out.println(keyList.get(1));
    }
}