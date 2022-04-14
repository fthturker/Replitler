package day14_StringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //Soru 7) Kullanıcıdan ismini, soyismini ve
        //ktedi kart bilgisini isteyin ve asagidaki gibi yazdirin.
        //  isim -soyisim : M****** B*******
        // kart no : **** **** **** 1234


        String isim= "fatih";
        String soyisim="TURKER";
        String kKNo="1234567890125469";

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                         isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo= "**** **** **** " + kKNo.substring(12);

        System.out.println("isim - soyisim : " +yeniIsim+" "+yeniSoyisim+
                            "\nkart no : " + yeniKKNo);

    }
}
