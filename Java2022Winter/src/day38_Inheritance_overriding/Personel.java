package day38_Inheritance_overriding;

public class Personel {

    public String statu="Personel";
    public String haklar="Tum personel esit haklara sahiptir";
    public String izin="tum personel 1 yilda 4 kere izin yapabilir";

    public void mesai(){
        System.out.println("Tum personel 5 gun, gunde 8 saat calisir");
    }

    public void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 10 euro = " + (30*8*10) + " Euro maas alir");
    }

}
