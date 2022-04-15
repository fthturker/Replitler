public class Soru_1 {
    /*
    num1 degeri 9 olarak verildiginde output ne olur? (Increment)
     */
    public static void main(String[] args) {
        int num1 = 9;

        int num2 = num1++; //  num1++ post ıncrement sonradan eklenen ++num1 pre increment denir
        /*
        - once atama yapilir ----> num1'in degeri num2'ye atanir num2=9 0lur
        -sonra artırma olur -----> num1'in degeri 1 artar ve num1=10 olur
         */


        if (num2 < 10) {
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }
    }
}
// 9 Hello World