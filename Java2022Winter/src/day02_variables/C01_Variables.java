package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {
        //bir variable olstururken icerisine koyacagım datanın alabilecegi
        //değerlere uygun bir data türü secmeliyiz
        //örnegin bir sehrin nüfusundan bahsediyorsak variable'imizin data türü
        //string,boolean,char veya double olamaz
        //geriye kalan tam sayı türlerinden sehrin nüfusunu içine alabilecek büyüklükte
        //bir data türü secebiliriz
        //biz kurs boyunca genelde tam sayılar icin int,ondalıklı sayılar icin double kullanacagız

        System.out.println("Hello World yazdıran Javayı halleder");

        int level=1;

        System.out.println(level);

        boolean ögrenciMi= true;
        boolean yagisVarmi= false;

        System.out.println(ögrenciMi);

        char sayi1='4';
        char karakter='&';

        System.out.println(karakter);
    }
}
