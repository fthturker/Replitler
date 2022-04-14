package day29_staticKeyword;

public class Deneme {
    static int count = 0;

    public void increment() {
        count++;

    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();

        Deneme obj2=new Deneme();

        obj1.increment();

        obj2.increment();

        System.out.println("Obj1: count ise="+ obj1.count); // Obj1: count ise=2
        System.out.println("Obj2: count ise="+ obj2.count); // Obj2: count ise=2

    }
}
