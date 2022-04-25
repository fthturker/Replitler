package interviewQuestions8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir

    public static void main(String[] args) {

        ArrayList<Integer>arrList=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("sayi giriniz :");
            arrList.add(scan.nextInt());
        }
        Collections.sort(arrList,Collections.reverseOrder()); // reverseOrder()===> ters siralar. decending
                                                               // sort() siralar
        System.out.println("ters siraladiktan sonra arrList :" +arrList); // ters siraladiktan sonra arrList :[9, 7, 4, 2, 1]

        Collections.shuffle(arrList); // rastgele siralar
        System.out.println("shuffle yaptiktan sonra :" +arrList); // shuffle yaptiktan sonra :[4, 3, 1, 5, 8]

        Collections.rotate(arrList,3); // belirtilen listedeki ogeleri kaydirir
        System.out.println("rotate edildikten sonra : " +arrList);

        Integer max=Collections.max(arrList);
        Integer min=Collections.min(arrList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.replaceAll(arrList,max,min); //
        System.out.println("replaceAll dan sonra : " +arrList); // replaceAll dan sonra : [6, 1, 3, 5, 1]



    }

}
