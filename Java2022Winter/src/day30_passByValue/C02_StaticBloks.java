package day30_passByValue;

public class C02_StaticBloks {

    {
        /*
        static olmayan bloklar ise obje olusturulurken calisir

        static bloklar sadece bir kere en basta calisir ama
        static olmayan bloklar her obje oluturulurken yeniden calisir
         */
        System.out.println("static olmayan blok calisti");
    }
    static{
        System.out.println("static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBloks obj1=new C02_StaticBloks();
        C02_StaticBloks obj2=new C02_StaticBloks();
    }
}
/*
static blok calisti
main method basi
static olmayan blok calisti
static olmayan blok calisti
 */