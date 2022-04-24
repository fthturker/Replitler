import java.lang.reflect.Constructor;

public class Soru_35_Constructor {

    int count;

    public void Constructor(){
        count=4;
    }

    public static void main(String[] args) {
        Constructor cns =new Constructor();
        System.out.println(cns.count);
    }
}
/*
A.0
B.4
C.7. satirdan dolayi calismaz
D.8. satirdan dolayi calismaz
E.12. satirdan dolayi calismaz
F.13. satirdan dolayi calismaz
 */