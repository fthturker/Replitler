package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {

        /*
        Soru 1 ) Verilen bir String’deki harfleri ve
        harflerin kacar kez kullanildigini return eden bir method yaziniz
        Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
         */
        String input="Helloooo";
        String harflerArr[]=input.split("");

        Map<String,Integer> kullanilanSayilar=new HashMap<>(); // bos map olusturduk

        for (String each:harflerArr
             ) {
            if (kullanilanSayilar.containsKey(each)){
                kullanilanSayilar.put(each , kullanilanSayilar.get(each)+1);
            }else{
                kullanilanSayilar.put(each,1);
            }
        }
        System.out.println(kullanilanSayilar); // {e=1, H=1, l=2, o=4}

    }
}
