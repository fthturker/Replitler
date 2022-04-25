package day26_forEachLoop_constructor;
public class Araba {
    /*
        java'da her class olusturdugumuzda
        java o class dan ileride objeler uretmek gerekecegini bilir
        ve biz ozellikle de belirtmesek de java
        her olusturdugu class'a bir constructor koyar

        Java 'nin class olustururken class'a koydugu constructor'a
        DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

        Eger biz gorunur bir constructor'umuz olsun istersek
        default constructor ile ayni gorevi yapan bir constructor 'da olusturabiliriz
        veya istersek ayni kaliptan farkli desenlerde olusturmak icin
        farkli ozelliklerde constructor'larda olusturabiliriz

        constructor'lari birbirinden farklilastiran tek ayricalik
        kullanilan parametre sayisi ve parametre data turudur
     */

    public Araba(){
        System.out.println("parametresiz constructor calisti");
    }
    /*
     bir kod blogunun method veya constructor olmasından emin olmak istiyorsaniz
     iki seye dikkat etmelisiniz
     1- Constructor'larin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar,
     2- Constructor'ların return type 'i olmaz

     ozetle : constructor'ın adi class adi ile ayni olmak zorunda ve
              return type'i olmamali
     */

    public Araba(String renk){
        System.out.println(renk + "renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + "yilinda bir araba uretildi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil + " model " + renk + " renkli bir araba uretildi");
    }
}
