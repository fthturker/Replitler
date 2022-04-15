public class Soru_8_StringManipulations {
    public static void main(String[] args) {
        String numbers = "012345678";

        System.out.println(numbers.substring(1,3));// ilk index dahil son index'e ama son index haric
        System.out.println(numbers.substring(7,7)); // 0123456 olur ve bos satir olur
        System.out.println(numbers.substring(7)); // 7. index'den sona kadar yani 78 olur


    }
}

/*
A. 12 Dogru
B. 123
C. 7
D. 78 Dogru
E. Bos bir satir Dogru
F. Kod exception olusturur
G.Kod calismaz
 */