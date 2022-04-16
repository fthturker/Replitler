import java.util.Scanner;

public class hesapMakinasiProgrami {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz:");
        n1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.print("Seciminiz:");
        select = scan.nextInt();

        System.out.println(select);
        /*
        if (select == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Cikarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Carpma: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bolme: " + (n1 / n2));
            } else {
                System.out.println("Bir sayi sifira bolunemez");
            }
        } else {
            System.out.println("Yanlis secim yaptiniz... Tekrar deneyiniz");
        }
         */
        switch(select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 !=0){
                    System.out.println("Bolme: " + (n1 / n2));
                }else{
                    System.out.println("Bir sayi sifira bolunemez");
                }
                break;
            default:
                System.out.println("Yanlis secim yaptiniz... Tekrar deneyiniz");
        }
    }
}
