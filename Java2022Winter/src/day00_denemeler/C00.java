package day00_denemeler;

public class C00 {
    public static void main(String[] args) {
        /* TASK :
          Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
          Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
        */

        int [] arrSomun= {99,3,9,1,7,5,};
        int [] arrCivata= {1,5,3,9,7,99};

        dizinYap(arrSomun);
        dizinYap(arrCivata);
        for (int i = 0; i < arrCivata.length; i++) {
            System.out.println("arrCivata : "+arrCivata[i] + " = arrSomun : " +arrSomun[i]);
        }
    }

    private static int[] dizinYap(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                if (arrA[i]<arrA[j]){
                    int ab=arrA[i];
                    arrA[i]=arrA[j];
                    arrA[j]=ab;
                }
            }
        }
        return arrA;
    }

}
