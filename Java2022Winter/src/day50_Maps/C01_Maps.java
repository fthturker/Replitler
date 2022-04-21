package day50_Maps;

import day49_Maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // sinif daki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*
         eger key'lere tek tek ulasmak istersek
         index yapisina ihtiyacimiz var
         ancak map index yapisini desteklemez
         bunun icin key'leri once bir set'e
         sonra da set'in tum elemenlerini bir list'e ekledik
         */
        Set<Integer> sinifKeySet = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySet);

        System.out.println(keyList.get(1));

        // simdi de value'leri index ile ulasabilecegimiz bir sekle sokalim
        Collection<String> sinifValueCollection = sinifListMap.values();
        System.out.println(sinifValueCollection);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueCollection);

        System.out.println(sinifValueList);

        /*
         herbir value bir den fazla bilgiyi iceriyor
         onun icin value'leri multidimensional bir array'e atmak mantikli duruyor
         ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var
         */

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut); // 3

        // inner array'lerin boyutunu bulmak biraz kompleks olacak

        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue); // Ali,Can,Dev
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDA[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDA[i][j]=temp[j];

            }

        }
        System.out.println(Arrays.deepToString(valueMDA)); // [[Ali,Can,Dev], [Veli,Yan,QA], [Ali,Yan,Dev]]
        // bu satira kadar key'leri index ile ulasabildigim KeyList' e atadim
        // value'leri valueMDA'e atadim
        // simdi bu key ve value'leri istedigim gibi manuple edebilirim

        System.out.println("Numara  Isim   Soyisim   Brans");
        System.out.println("===============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "     ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDA[i][j]+"    ");
            }
            System.out.println("");
        }

    }
}