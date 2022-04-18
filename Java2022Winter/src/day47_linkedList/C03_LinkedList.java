package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {


        Deque<Integer> ll1=new LinkedList<>();
        System.out.println(ll1.peek()); // bosken kullanrsak null dondurur

        //System.out.println(ll1.element()); // bosken kullanirsak exception verir

        System.out.println(ll1.poll()); // bos kullanirsak null dondurur
        System.out.println(ll1.pollFirst()); //
        System.out.println(ll1.pollLast()); //

        // ll1.pop(); // ilk elementi silip bize dondurur
                      // ilk elementi bulamazsa exception firlatir

        ll1.push(30);


    }
}
