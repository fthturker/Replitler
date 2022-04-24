

public class  Soru_35_Constructor {

    int count;

    public void Constructor(){  // void oldugundan return type vardir bu bir const. degil method'dur
        count=4;
    }

    public static void main(String[] args) {
        Soru_35_Constructor cns =new Soru_35_Constructor(); // default const. gorunmez hicbir ekstra ozellik kabul edilmez
        System.out.println(cns.count); // instance bir variable dir deger atamak zorunda degiliz  java  otomatik atama yapar
    }
}
/*
A.0 // DOGRU
B.4
C.7. satirdan dolayi calismaz
D.8. satirdan dolayi calismaz
E.12. satirdan dolayi calismaz
F.13. satirdan dolayi calismaz
 */