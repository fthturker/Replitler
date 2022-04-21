package JavaPrintf_Kullanimi;

public class C03_MarketFis {
    /*
    toplam tutarlarda virgulden sonra 2 basamak alinacak, sonrasi dikkate alınmayacaktir
    urunler = Domates, biber, patlican, elma, armut
    miktarlar= 1,2,3.5,2.5,6
    birim fiyatlari=2.3,2.29,4.1,2,3
    satis fisi
    Urun    miktar  br_fiyat    urun_top
    ====================================
    Domates
    biber
    patlican
    elma
    armut
    ===================================
    Genel toplam    15.50kg     35.56$

     */
    public static void main(String[] args) {
        String urun[] = {"Domates", "biber", "patlican", "elma", "armut"};
        double brFiyat[] = {2.3, 2.29, 4.1, 2, 3};
        double miktar[] = {1, 2, 3.5, 2.5, 6};

        System.out.println("Urun      miktar  br_fiyat urun_top");
        System.out.println("====================================");
        for (int i = 0; i <urun.length ; i++) {
            System.out.printf("%-8s %5.2fkg   $%05.3f  $%05.3f\n",urun[i],miktar[i],brFiyat[i],miktar[i]*brFiyat[i]);
        }
        System.out.println("====================================");

        double toplamUrunMiktar=0;
        for (int i = 0; i <miktar.length ; i++) {
            toplamUrunMiktar+=miktar[i];
        }

        double toplamOdenecekPara=0;
        for (int i = 0; i <miktar.length ; i++) {
            toplamOdenecekPara+=miktar[i]*brFiyat[i];
        }
        System.out.printf("Genel toplam    %5.2fkg     $%5.2f",toplamUrunMiktar,toplamOdenecekPara);

    }
}
