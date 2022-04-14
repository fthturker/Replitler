import java.util.Scanner;

public class DaireninAlanınıCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz : ");
        int r =scan.nextInt();
        double pi=3.14;
        double alan=pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("Dairenin Alani : " +alan);
        System.out.println("Dairenin Cevresi : " +cevre);

        /*
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        System.out.print("merkez acinin olcusunu giriniz :");
        int aci=scan.nextInt();
        double formul=(pi*(r*r)*aci)/360;
        System.out.print("daire dilim alani :" +formul);

    }//main sonu
}//class sonu
