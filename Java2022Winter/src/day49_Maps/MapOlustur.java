package day49_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer, String> myMap() {
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali,Can,Dev");
        sinifList.put(102, "Veli,Yan,QA");
        sinifList.put(103, "Ali,Yan,Dev");

        return sinifList;

    }

}