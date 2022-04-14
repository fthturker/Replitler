package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        //bu sayıyı bir arttırmak istersek
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println("pre-incrementden once: " + sayi);//12
        //eger 11. ve 12. satirda yaptıgım 2 islwmi tek satirda yaparsam
        //java iki islemden oncw hangisini yapacagini bilmek ister
        //once artırır sonra yazdırırsak javabyeni degeri yazdırır
        //ama once yazdırır sonra artırırsak, bu durumda eski degeri yazdırır

        System.out.println("pre-increment satırında: " + ++sayi);//13 once arttır sonra yazdır
        System.out.println("pre-incrementden sonra: " + sayi);//13

        System.out.println("post-increment satirinde: " + sayi++);//13 once yazdır sonra arttır
        System.out.println("post-increment satirinden sonra: " + sayi); //14


    }

}

