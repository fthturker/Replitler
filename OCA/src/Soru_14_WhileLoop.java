public class Soru_14_WhileLoop {
    public static void main(String[] args) {
        int x = 1, y=15;
        while(x<10)      // while dan sonra java boolean bir sonuc gormek ister While(true) yazilsaydi calisirdi
            y--;
            x++;        // x hep 1 olacak ve sonsuz bir donguye girecek
        System.out.println(x+", "+y);
    }
}
/*
A. 10,5
B. 10,6
C. 11,5
D. 5. satirdan dolayi kod calismaz
E. 6. satirdan dolayi kod calismaz // Dogru
F. kod sonsuz bir donguye girer
 */