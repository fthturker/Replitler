package day33_Varargs_stringBuildir;

public class C02_Varargs {
    public static void main(String[] args) {
        // parametre olarak bir integer ve istedigimiz kadar string alan
        // en uzun kelimenin harf sayisi ile integer'i parametre degerini carpip
        // sonucu yazdiran bir method olusturun

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpim(sayi, str1, str2, str3);
        // Bir method'da varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip varargs'i en sona yazmaliyiz
        // bu sebeple bir method'da birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("Istenen deger : " + sayi * enUzunStr.length());
    }
}       // Istenen deger : 30
        // varargs esasinda bir array'dir
