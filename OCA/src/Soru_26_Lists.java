import java.util.ArrayList;

public class Soru_26_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
    }
}
/*
A. 4
B. 5
C. 6
D. 46
E. 45
F. exception olusur
G. kod calismaz
 */