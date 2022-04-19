import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Soru_27_Lists {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,4,-1,5);
        Collections.sort(list);
        Integer array[]=list.toArray(new Integer[4]);
        System.out.println(array[0]);

    }
}
/*
A. -1
B. 10
C. 10. satirdan dolayi kod calismaz
D. 11. satirdan dolayi kod calismaz
E. 12. satirdan dolayi kod calismaz
F. Kod exception olusturur

 */