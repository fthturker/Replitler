package day35_Inheritance;

public class Isci extends Personal{
    public static void main(String[] args) {

        Personal objPers=new Personal();
        objPers.isim="Eren";
        objPers.soyIsim="Terzioglu";
        objPers.adres="Afyon";

        Isci objIsci= new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyIsim="Turker";
        objIsci.adres="Izmir";


    }
}
