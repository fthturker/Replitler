package day29_staticKeyword;

public class Deneme_2 {
    int x;
    static int y;

    Deneme_2 (int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new Deneme_2(2);

        Deneme_2 dnm=new Deneme_2(3);

        System.out.println(dnm.x + "," + dnm.y);
    }
}
