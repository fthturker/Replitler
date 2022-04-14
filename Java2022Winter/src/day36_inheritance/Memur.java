package day36_inheritance;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas='" + maas + '\'' +
                ", perNo=" + perNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Memur memur1= new Memur();
        //memur1 objesi Memur class'inin objesi olmasina ragmen
        //inherit ettigi Muhsebe ve onun da Parent'i olan Personel
        //class 'larindaki tum datalari alabilir

        // personel class'indan
        memur1.perNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Izmir";
        memur1.tel="3124536789";

        //muhasabe class'indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.perNo=1002;
        memur2.saatUcreti=10;
        memur2.maas=memur2.maasHesapla();
        System.out.println(memur2);
    }

}
