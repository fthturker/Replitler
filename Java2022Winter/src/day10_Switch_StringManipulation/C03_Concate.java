package day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        //Concatenation yapmak ıcın iki ihitimal var
        //istersek daha once yaptıgımız gibi
        //+ operatorunu kullanabiliriz
        //veya String class'ından gelen concat method'unu kullanabiliriz
        String str1="Java";
        String str2="Candir";


        //Java Candir yazdiralim
        System.out.println(str1+" " + str2);

        String cumle= str1.concat(str2); //JavaCandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //concat ıcıne String degil de sayi veya boolean deger yazsak?
        //concat metodu icine String parametre ister
        //String dısında bir data turu yazdıgımızda
        //onu String haline getirmelisiniz

        cumle=str1.concat(""+7);
        cumle=str1.concat(true+"");


    }
}
