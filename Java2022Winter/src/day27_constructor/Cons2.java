package day27_constructor;

public class Cons2 {
    public static void main(String[] args) {

        Cons01 obj1= new Cons01(); // default constructor devrede
        /*
        Cons01 class'inda hic constructor olusturmazsak,
        Java default constructor'ı kullandıgından
        obj1'i uretebiliriz

        Ancak biz parametreli veya parametresiz bir constructor yazdıgımızda
        Java default constructor'ı siler

        Dolayisiyla biz herhangi bir constructor olusturdugumuzda
        daha once baska class veya kullanicilerin
        olusturmus olabilicegi objeleri kullanabilmeleri icin
        default constructor'un islevini gerceklestirecek
        parametresiz bir constructor olusturmakta fayda var

         */
        Cons01 obj2 = new Cons01("Java");

    }
}
