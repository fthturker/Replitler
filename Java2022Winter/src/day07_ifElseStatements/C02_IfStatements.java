package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){
            System.out.println("istediginiz gerceklesecek");
            System.out.println("body ıcındeki tum kodlar calısır");
        }
        if (a<0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

        //bir if cumlesinin daha anlasılır olmasını ıstıyorsanız
        //if body'sini {} icine yazmalısınız
        //body'i {} icine yazmazsak da if cumlesi calısır
        //ancak ilk ; gordugunde if cumlesi bitmis olur

        //21. satırdaki kod 13. satırdaki if dogru olsada calisir false olsa da calısır
        System.out.println("2. satırda calıstı");


        }
}
