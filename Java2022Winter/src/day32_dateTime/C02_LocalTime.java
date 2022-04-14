package day32_dateTime;

import java.time.LocalTime;
public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 22:08:50.108972600

        // bir islemin ne kadar surede bittigini bulmak istersek islemden once ve sonra
        // birer time objesi olusturup aradaki farki hesaplayabiliriz

        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }
        LocalTime tmLoopSonrasi = LocalTime.now(); // yeni bir obje olusturmamiz gerrekir
        System.out.println(tmLoopSonrasi); // 22:12:48.590983200

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2 - nano1) + " nano saniyede bitti"); // islem 3001500.0 nano saniyede bitti

        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // 1000 dk sonrasini ogrenmek icin 14:58:39.810567200

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
