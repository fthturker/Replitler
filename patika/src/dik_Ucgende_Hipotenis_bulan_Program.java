import java.util.Scanner;
public class dik_Ucgende_Hipotenis_bulan_Program {
    /*
    Dik Üçgende Hipotenüs Bulan Program
    Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {

        int a,b;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("a kenari giriniz : ");
        a= scan.nextInt();

        System.out.print("b kenari giriniz : ");
        b= scan.nextInt();

        c=Math.sqrt((a*a)+(b*b)); // kare kokunu bulmak icin kullandik

        System.out.println("Hipotenus : " +c);

        double u,cevre,alan;

        u=(a+b+c)/2;
        cevre=2*u;
        System.out.println("Ucgenin cevresi : " +cevre);

        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Ucgenin alani : " + alan);

    }
}
