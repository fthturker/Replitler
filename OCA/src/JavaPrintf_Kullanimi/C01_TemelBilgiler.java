package JavaPrintf_Kullanimi;

public class C01_TemelBilgiler {
    public static void main(String[] args) {
        int sayi=123;
        String str="Ah";
        double dob=1.0205030456;

        System.out.println(sayi+"-"+ str+"-"+dob+"-");

        System.out.printf("sayi : %d, str : %S, dob : %f",sayi,str,dob);
    }
}
