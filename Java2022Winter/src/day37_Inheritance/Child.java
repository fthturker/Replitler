package day37_Inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir class'i child class yaptigimizda parent class'daki cons.
    //ulasmasi gerekir bu durumda parent class'daki
    // constructor'in access modifier'i
    //uygun bir modifier yapilmalidir


    Child(){
        super();
        System.out.println("child class parametresiz constructor");
    }
    Child(int s){
        //Child class'da tum cons.'larin ilk satirina java'nin
        //yerlestirdigi cons. parametresizdir super()

        System.out.println("Child class parametreli cons.");
    }
    Child(int sayi1, int sayi2){
        //eger parent class'dan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        // bunu child class'daki coms. ilk satirina yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("iki parametreli constructor");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);

    }
}
