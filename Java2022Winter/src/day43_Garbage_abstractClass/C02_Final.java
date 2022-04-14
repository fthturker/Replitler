package day43_Garbage_abstractClass;

public class C02_Final{



    public static void main(String[] args) {



        System.out.println(C01_Final.okulIsmi);

        // C01_Final.okulIsmi="Hasan Koleji";
    }
    /*
        Override parent class'daki methodu child class'a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak paret class'daki method final olarak tanimlandigindan
        Java method'un uyarlanmasina izin vermiyor
        System.out.println("parent class final method1");
        }
         */
}
