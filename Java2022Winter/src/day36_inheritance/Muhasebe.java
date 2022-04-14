package day36_inheritance;

public class Muhasebe extends Personel{
    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected int maasHesapla(){
        // return type int oldugu icin return type 'i maas yazdik
        int maas =saatUcreti*8*30;
        return maas;

    }



}
