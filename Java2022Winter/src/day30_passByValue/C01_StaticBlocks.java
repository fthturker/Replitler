package day30_passByValue;

public class C01_StaticBlocks {

    static { // class calismaya baslamadan yapmaniz gereken on atamalar varsa onlari yapar
        /*
        static blok class ilk calısmaya basladigindfa devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktıur, class icerisinde istenen yerde yazilabilir
        static blok bir den fazla olursa , bloklar yukaridan asagiya dogru calisir
         */
        System.out.println("static blok calisti");
    }

    static {
        System.out.println("static blok2 calisti");
    }

    C01_StaticBlocks() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");
    }
}
/*
static blok calisti
static blok2 calisti
main method baslangici
Constructor calisti
main method sonu
 */
