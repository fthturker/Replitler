import java.util.ArrayList;
import java.util.List;

public class Soru_25_Lists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
A. onetwo
B. onetwo7
C. onetwo yazar ve sonra exeption olusur
D. 12. satirdan dolayi kod calismaz
E. 14. satirdan dolayi kod calismaz
 */