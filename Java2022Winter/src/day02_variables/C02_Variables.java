package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {
        //Java calismaya main metod'dan baslar
        //sonra yukarıdan asagıya, soldan saga dogru calısır

        //eger istersek bir variable önce declare edip sonra deger atayabiliriz

        String okulIsmi;

        //Java deger ataması yapmadıgımız bir vaiable olusturmamıza itiraz etmez
        //Ancak deger ataması yapıncaya kadar o variable'i kullanmamıza izin vermez
        //System.out.println(okulIsmi);

        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);

        //println ile print arasındaki fark
        //println dedigimizde yazdırma isleminden sonra alt satıra gecerken
        //sadece print dedigimizde yazdırma isleminden sonra alt satıra gecmez
        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);
        System.out.print(okulIsmi);
    }
}
