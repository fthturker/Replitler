public class Soru_3 {
    public static void main(String[] args) {

        final char a = 'A', d = 'D'; // final keyword variable'in son degerini belirler
        char grade = 'B';

        switch (grade) {
            case a:
            case 'B':
                System.out.println("great");
            case 'C':
                System.out.println("good");
                break;
            case d:
            case 'F':
                System.out.println("not good");
        }
    }
}
// great
// good