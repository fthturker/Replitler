package day36_inheritance;

public class Parent {

   protected Parent(){

       System.out.println("Parent parametresiz cons. calisti");
    }

    protected Parent(int sayi3, int sayi4){
        System.out.println("parent iki parametreli constructor");
    }

    protected int sayi;

}
