package day23_MultiDimensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        //Soru 2)


        int arr[][]={{1,2,3},{4,5},{6,0,2}};
        int carpim=1;


        for (int i = 0; i < arr.length; i++) {
            carpim *=arr[i][arr[i].length-1];

            }
        System.out.println("son elementlerin carpimi : " + carpim);
        }

    }

