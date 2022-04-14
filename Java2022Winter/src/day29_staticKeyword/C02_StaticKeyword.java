package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        //baska class'daki static class uyelerine
        //ulasabilmek icin sadece clasIsmi.staticUyeIsmi
        //yazmamiz yeterlidir

        System.out.println(C01_static.okulTelefonu); // 3124567689
        C01_static.okulTelefonu="3434656766";

        System.out.println(C01_static.okulTelefonu); // 3434656766

        // Baska class'daki static olmayan class uyelerine ancak
        // o class'dan obje olusturarak ulasabiliriz
        //ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_static obj1=new C01_static();
        C01_static obj2=new C01_static();

        System.out.println(obj2.okulIsmi); //Yıldiz Koleji
        obj2.okulIsmi="Sabir Koleji";
        System.out.println(obj1.okulIsmi); // Yildiz Koleji

    }
}
