package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now(); // pbjenin olusturuldugu tarihi trh'ye atar(assign) eder
        LocalDate baskaTrh = LocalDate.of(1972,1,18);
        // istedigimiz yil,ay,gun degerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-03-31
        // get 'li method'larla tarih ile ilgili detay bilgilerini alabiliriz
        System.out.println(trh.getDayOfMonth()); // 31

        System.out.println(trh.getDayOfWeek()); // THURSDAY

        System.out.println(trh.getMonthValue()); // 3

        System.out.println(trh.getYear()); // 2022

        // bir tarihden istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20)); // 2021-11-11

        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01

        // is ile baslayan method'lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false 29 subatlar leap yıllar
        System.out.println(trh.isAfter(baskaTrh)); // true (iki dogum tarihi verim hangisi buyuk oldugunu ogrenebiliriz)

    }
}
