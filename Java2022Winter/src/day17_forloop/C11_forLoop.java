package day17_forloop;

public class C11_forLoop {
    public static void main(String[] args) {
        // SORU 8) Kullanicidan bir String isteyin ve
        // Stringi tersine ceviren bir method yazin.

        String isim= "yavuz";
        cevir(isim);
    }

    private static void cevir(String isim) {
        String ekle="";
        for (int i = isim.length()-1 ; i >=0 ; i--) {
            ekle+=isim.substring(i,i+1);

        }
        System.out.println("Tersten yazilis : " + ekle);
    }
}
    /*
        String isim="fatih";
        cevir(isim);

    }
    private static void cevir(String isim) {
        String ekle="";
        for (int i =isim.length()-1 ; i >=0 ; i--) {
            ekle+=isim.substring(i,i+1);
        }
        System.out.println("tersten yazılıs: "+ekle);
    }
}
    */