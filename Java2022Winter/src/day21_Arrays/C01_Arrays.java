package day21_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //array'i nasil declare ederiz
        //data turu, array'in ismi ve koseli parantez yazarak array declare edilir
        int arr1[] = {1,3,5};
        int[] arr2 = {2,3,5};
        int [] arr3 = {1,6,8};

        double arr4[]= {10.2,10.5};

        String arr5[]={"ali","Veli","Ayse"};

        //assingn mecburi midir ?
        int sayi;

        int arr6[]; // deger ataması yapılmadı

        //kullanmadan once mutlaka deger atamasi yapmamiz gerekir

        // hem declare edip hem de atama yapacaksask nasıl yapabilirim?
        //1- declare edip  esitligin karsısına suslu parantez icerisinde degerleri yazabilirim
        String arr7[]={"ali","Veli","Ayse"};

        //2- icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir

        int arr8[]= new int[5]; // java icinde 5 tane default deger olan bir array oluturur
                                // [0,0,0,0,0]


    }
}
