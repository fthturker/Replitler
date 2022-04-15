public class Soru_16_DoWhileLoop {
    public static void main(String[] args) {

        int m=9, n=1, x=0;                  // m    n   x
        do {                                // 9    1   0
            m--;                            // 8    3   11
            n+=2;                           // 7    5   23 (11+12)
            x+=m+n;                         // 6    7   36

        }while(m>n);
        System.out.println(x);
    }
}
/*
A. 11
B. 13
C. 23
D. 36 DOGRU
E. 50
F. 10. satirdan dolayi kod calismaz
 */