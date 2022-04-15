public class Soru_15_DoWhileLoop {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result=15, i=10;
        do { // once body calisir sonra kontrol yapilir
            i--;                            //i=9 result=13
            if(i==8) keepGoing=false;       //i=8 result=11
            result -=2;
        }while (keepGoing);
        System.out.println(result);
    }
}
/*
A. 7
B. 9
C. 10
D. 11 //dogru
E. 15
F. 10. satirdan dolayi kod calismaz
 */