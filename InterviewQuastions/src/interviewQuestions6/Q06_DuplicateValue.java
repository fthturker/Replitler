package interviewQuestions6;


import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */
       public static void main(String[] args) {
           String str="Javaisalsoeasy";
           char[] arr = str.toCharArray(); // her bir karakteri bir arraye donusturur
           System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
           //Arrays.toString(arr) = [J, a, v, a, i, s, a, l, s, o, e, a, s, y]

           ArrayList<Character> output = new ArrayList<>(); //istenilen cikti icin

           for (int i = 0; i <arr.length; i++){ //arr deki her bir elemana bakar
               for (int j = i+1; j < arr.length; j++){ //her bir elemana bakarken bir sonraki ile karsilastir
                   if(arr[i] == arr[j] && !output.contains(arr[j])) { //ayni elemandan varsa ve istedigin output da yoksa
                       System.out.println(arr[j]); // o elemani yazdir
                       output.add(arr[j]); //output a ekle
                   }
               }
           }
           System.out.println("output = " + output); //output = [a, s]

       }

}

/*
String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        List<String> duplications = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    if (!duplications.contains(arr[i])) {
                        duplications.add(arr[i]);
                    }
                }
 */
/*
String str= "Javaisalsoeasy";

        String arr[]=str.split(""); // tüm harfleri arrayin içine attık
        Arrays.sort(arr);  // alfabetik sıralamaya koyduk
        List<String> list = new ArrayList<String>();//tekrarlayanları atacağımız yeni list oluşturduk
        for (int i=1; i<arr.length ; i++) { //tekrarlayanlar'ı yeni listemize ekledik
            if(!list.contains(arr[i]) && arr[i-1].equalsIgnoreCase(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println("Tekrarlanan karakterler = "+list);

 */
/*
String kelime = "Javaisalsoeasy";
String tekrarliHarfler = "";
for (int i = 0; i < kelime.length(); i++) {
    for (int j = i+1; j < kelime.length(); j++) {
        if (kelime.charAt(j)==kelime.charAt(i) && !tekrarliHarfler.contains(kelime.charAt(i)+"")){
            tekrarliHarfler+=kelime.charAt(j);
        }
    }
}
System.out.println(tekrarliHarfler);
 */