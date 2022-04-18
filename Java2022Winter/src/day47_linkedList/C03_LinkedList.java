package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {


        Deque<Integer> ll1 = new LinkedList<>();
        System.out.println(ll1.peek()); // bosken kullanrsak null dondurur

        //System.out.println(ll1.element()); // bosken kullanirsak exception verir

        System.out.println(ll1.poll()); // bos kullanirsak null dondurur
        System.out.println(ll1.pollFirst()); //
        System.out.println(ll1.pollLast()); //

        // ll1.pop(); // ilk elementi silip bize dondurur
        // ilk elementi bulamazsa exception firlatir

        ll1.push(30); // Listenin basina element ekler
        ll1.push(20);
        System.out.println(ll1);// [20, 30]

        ll1.remove(); // ilk elementi siler ve bize dondurur // 20

        System.out.println(ll1.remove());
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50); // object olarak 50 yi siler
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);

    }
}
