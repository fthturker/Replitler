public class Soru_17_Scope {

    public static void main(String[] args) {
        int y=1; //yazdigimizda hata ortadan kalkar...
        do {
            //int y=1;// y suslu parantezin icerisinde olusturuldugundan y<=10 dısarida oldugundan hata verir
            System.out.println(y++ + " ");
        }while(y  <=10);

    }
}
/*
A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. 10. satirdan dolayi kod calismaz. (DOGRU)
E. kod sonsuz bir donguye girer.
 */
/*
SCOPE=class icerisinde olusturulan variable'larin kapsamini
(nereden erisebilecegini) belirler

Temel olarak 4 Scope'dan bahsedebiliriz
Class level'da olusturulan variable'lar class'in tamamindagecerlidir,
ancak direk erisim icin static keyword belirleyicidir
1- static olarak tanimlanan variable'lara tum method'lardan ulasilabilir
2- static olarak tanimlanmayan (instance) variable'lara sadece static olmayan method'lardan ulasilabilir

Local olarak olusturulan variable'lar sadece tanimlandiklari scope'da gecerlidir.
(Herkes oturdugu mahallede taninir)
3- bir method'da olusturulan variable'lara sadece o method'dan ulasilabilir
4- Loop icerisinde olusturulan variable'a loop disindan erisilemez

 */