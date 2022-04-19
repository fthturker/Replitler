package day00_denemeler;

import java.util.Arrays;
import java.util.LinkedList;

public class C03 {

        public static void main(String[] args) {
            int[] useThisArray = {2, 4, 1, 5, 9,};
            Arrays.sort(useThisArray);
            int min = useThisArray [0];
            int max = useThisArray[useThisArray.length -1];
            System.out.println("Min Value = " + min);
            System.out.println("Max Value = " + max);
            System.out.println(max-min);
        }
    }


