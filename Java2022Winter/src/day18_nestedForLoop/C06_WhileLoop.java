package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Kullaniciden iki tam sayi alip
        // bu sayileri ve aralarindaki tun say,ileri yazdiren bir kod olusturun

        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //ayni soruyu While Loop ile yapalım
        int i=baslangic;

        while (i<=bitis){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

    }
}
