public class Soru_4_StringManipulation {

    public static void main(String[] args) {
        // kod blogunun 10. satirina seceneklerden hangisi eklenirse konsolda "Equals" yazdirir?
        String str1="Java";
        String str2=new String("java"); // Java'da new kelimesi ile baslayan hersey yeni bir referans degeri alir

        // 10. satir
        str1.toLowerCase(); // str1'e atama olmadigi icin burada str1 kalici olarak degismez
        System.out.println(str1); // Java

        // (str1==str2 de hem referanslari farklı hem de degerleri farklidir yani false olur
        // A-) if (str1==str2) // String'de == kulanmamayi tercih ederiz
                        // String'de bunun yerine equals methodunu kullaniriz
                        // equals methodu sadece String'lerin icerigine bakarken
                        //== icerige hem de referans'a bakar
        if (str2.equals(str1.toLowerCase())) // Equals
        //   equals sadece icerik olarak karsilastirir ama referanslara bakmaz
        {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
