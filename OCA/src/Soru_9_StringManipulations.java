public class Soru_9_StringManipulations {
    public static void main(String[] args) {
    String s = "purr";
    s.toUpperCase(); // PURR (ne konsolda birsey yazdirir
                     // ne de atama olmadıgında s 'nin degeri degismez)
    s.trim();
    s.substring(1,3); // ur ne yazdirma ne de atama var calisir ama sonuc yok
    s +=" two"; // atama var var olan String'e s eklenecek "purr" +" two" eklenir "purr two"olur
    System.out.println(s.length()); //8


    }
}
    /*
    A. 2
    B. 4
    C. 8 Dogru
    D. 10
    E. Kod exception olusturur
    F. Kod calismaz
     */