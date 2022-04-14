package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        bir obje olusturulurken data turu ve constructor aynı class'dan secilmisse
        Java direk o class'a gider hem variable hem method icin
        o class 'da varsa kullanir yoksa o class'in parentlerine bakar
         */
        OverridingChild obj1=new OverridingChild();
        obj1.method1(); //Child class method1
        obj1.method2(); //Parent class method2

        OverridingParent obj3 = new OverridingParent();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Parent class method1

        /*
        eger Data turu Parent, Constructor Child class'dan secildiyse
        variable'larda yukaridaki sekilde calisma devam eder
        ancak method'lar icin data turu'nun oldugu class'daki method
        Child class tarafindan OVERRİDE edilmis mi diye kontrol etmeniz gerekir
        Eger Child class'larda bu method OVERRİDE edilmisse
        override eden method calisir
         */

        OverridingParent obj2 = new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1


    }
}
