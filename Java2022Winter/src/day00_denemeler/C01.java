package day00_denemeler;

public class C01 {
    public static void main(String[] args) {
         /* TASK :
          Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
          Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
        */

        String[] somun = {"m7", "m20", "m6", "m10", "m12", "m5", "m11"};
        String[] civata = {"m6", "m4", "m8", "m12", "m10 ", "m20"};

        for (int i = 0; i < somun.length; i++) {
            for (int j = 0; j < civata.length; j++) {
                if (civata[j].contains(somun[i])) {
                    System.out.println(civata[j] + "=civata ile " + ", " + somun[i] + " =somun uyumludur ");

                }
            }
        }
    }
}
