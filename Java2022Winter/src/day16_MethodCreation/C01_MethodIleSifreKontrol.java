package day16_MethodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        //Soru 6) Kullaniciden bir sifre girmesini isteyin
        //Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
        //sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
        // ilk harf buyuk harf olmali
        //son harf kucuk harf olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali
        //bu dort kontrolu method ile yapın

        String sifre = "Abc1234a";
        boolean ilkHarfKontrol = ilkHarfKontrolet(sifre);
        boolean sonHarfKontrol= sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol= uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol ){
            System.out.println("Sifre basarılı tamamlandı");
        }else{
            System.out.println("Islem basarısız, lutfen tekrar deneyin");
        }
    }

    private static boolean ilkHarfKontrolet(String sifre) {char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf >= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
            ilkHarfSonuc=false;
        }
        return ilkHarfSonuc;
    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc=false;
        }
        return uzunlukKontrolSonuc;
    }
    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=true;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }
        return boslukKontrolSonuc;
    }
    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
            sonHarfSonuc=false;
        }
        return sonHarfSonuc;
    }

}
