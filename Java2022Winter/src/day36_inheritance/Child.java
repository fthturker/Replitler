package day36_inheritance;

public class Child extends Parent {

    Child() { // constructor
        super();
        System.out.println("Child cons. calisti");
    }

    // tum class'larda biz gormesek bile
    // java'nın olusturdugu default constructor vardir

    //Extends keyword kullanan class'lardaki
    // tum CONSTRUCTOR larin ilk satirinda
    // biz gormesek bile super()
    //constructor call vardir
    //yani parent class'in parametresiz constructor call
    public static void main(String[] args) {

        Child child = new Child();
    }
}
