import java.util.Arrays;

public class Soru_24_ArrayBinarySearch {
    public static void main(String[] args) {
        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " ");
        }
    }
}
/*
A. apple banana grapes pears    DOGRU
B. pears grapes banana apple
C. banana apple pears grapes
D. Kod calismaz
 */