package day35_Inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {
        /*
        Child class hicbir objeye ihtiyac duymadan parent class'daki
        variable ve methodlara ulasabilir
         */

        System.out.println(isim); // Neval
        System.out.println(fabrika); // Yildiz
        method1();
        method2();



    }
}
