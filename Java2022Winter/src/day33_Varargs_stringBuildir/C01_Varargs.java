package day33_Varargs_stringBuildir;

public class C01_Varargs {
    public static void main(String[] args) {
        // kac tane string verilirse verilsin iclerinden
        // en uzun olani yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";

        // yazilan argument sayisi sabitse her zamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa varrags tercih edilir.
        enUzunKelime(str1,str2,str3);
    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each : str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("en uzun kelime : " +enUzunStr); // en uzun kelime : Oguzhan
    }
}
