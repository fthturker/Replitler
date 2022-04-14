package day36_inheritance;

public class SurekliIsciler extends Isci{


    public static void main(String[] args) {

        SurekliIsciler surIc1= new SurekliIsciler();

        surIc1.perNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas=surIc1.maasHesapla();
        System.out.println(surIc1);

    }
    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", perNo=" + perNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}
