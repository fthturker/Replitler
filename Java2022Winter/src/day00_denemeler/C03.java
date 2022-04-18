package day00_denemeler;

import java.util.LinkedList;

public class C03 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(10);
        list.addFirst(11);
        list.addLast(20);

        System.out.println(list);
        list.add(0,70);
        System.out.println(list);


        }
    }

