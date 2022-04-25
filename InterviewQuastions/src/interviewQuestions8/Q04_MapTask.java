package interviewQuestions8;

import java.util.*;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>>grupIsimUyeleri=new HashMap<>();

        ArrayList<String> devTeam=new ArrayList<>(Arrays.asList("Abdullah","kutay","Yasin"));
        ArrayList<String> qATeam=new ArrayList<>(Arrays.asList("Fatih","Yavuz","Gokhan"));

        grupIsimUyeleri.put("Development Team",devTeam);
        grupIsimUyeleri.put("QA Team",qATeam);

        System.out.println("groupIsimUyeler = " +grupIsimUyeleri);

        //Bolum 2
        //1. YOL value lardan giderek
        Collection<ArrayList<String>> values=grupIsimUyeleri.values();
        for (ArrayList<String> kisi:values
             ) {
            System.out.println(kisi.size()); //ikisi icin de 3

            // 2. YOL key'lerden giderek

            Set<String> keys=grupIsimUyeleri.keySet(); // keySet() key'leri set olarak dondurur
            for (String key: keys
                 ) {
                ArrayList<String>grupList =grupIsimUyeleri.get(key);
                System.out.println("grupdaki uye sayisi : " +key+ " "+grupList.size());
                //  grupdaki uye sayisi : QA Team 3
                //  grupdaki uye sayisi : Development Team 3

            }

        }

    }
}
