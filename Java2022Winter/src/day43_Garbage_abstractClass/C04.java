package day43_Garbage_abstractClass;

public abstract class C04 {
    /*
    bir abstract class'da abstract veya concrete method'lar bulunabilir
    Child class'ların abstract method'lari override etmesi MECBURI iken
    concrete method'larin override edilmesi OPSIYONEL'dir
     */

    public abstract void absMethod();

    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
        abstract class'lar constructor'a sahiptir ancak
        abstract class'lardan OBJE OLUSTURULAMAZ

        abstract class'lar OBJE BARİNDRMAYAN,
        sadece child class'lar icin
        UYULMASISART OLAN veyaOPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir
         */
        // C04 obj=new C04();
        System.out.println("bu class abstract");

    }
}
