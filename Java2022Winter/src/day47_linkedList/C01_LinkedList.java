package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /* LinkedList'in iki tane parent interface'i vardir
            LinkedList olustururken data turu olarak ;
            LinkedList secersek : iki parent'deki tum method'lar
            List secersek : sadece List Interface'indeki method'lar
            Deque/Queu secersek : Deque 'deki methodlari kullaniriz

         */
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10); // LinkedList

        // sadece List interface'inden ozellikler kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        // sadece Deque den gelen ozellikleri kullanalim
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3); // [15, 20]
    }
}
