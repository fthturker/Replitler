package day29_staticKeyword;

public class C01_static {
    String okulIsmi="Yildiz Koleji";
    static String okulTelefonu="3124567689";

    public static void staticMethod(){
        System.out.println("Static method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("Static olmayan Method");
    }
}
