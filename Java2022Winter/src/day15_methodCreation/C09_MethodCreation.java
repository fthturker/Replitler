package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim = "fatih";
        String soyisim ="TURKER";
        String kKNo = "1234567890125469";

        // eger bir method'dan bir islem yapmasını
        // ve yaptıgı islemi biz getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmadır
        String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        //bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo=krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);

    }

    public static String krediKartiGizle(String kKNo) {
        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        //method olusturmada 3. adım
        //method calısınca sadece bir sey mi yazdıracak
        //yoksa bize bir data mı dondurecek buna karar vermektir
        //Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        //return Type'i void degil String sectik
        //ve method'un sonuna return edilecek datayı yazdik
        return yeniIsim+" "+yeniSoyisim;
    }
    }

