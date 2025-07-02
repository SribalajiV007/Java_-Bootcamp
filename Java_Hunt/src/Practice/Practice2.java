package Practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int num : arr){
            if(num > max ){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

//public class MinMaxArray {
//    public static void main(String[] args) {
//        int[] arr = {12, 45, 2, 67, 34, 89, 1, 23};
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int num : arr) {
//            if (num > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//        }
//
//        System.out.println("Maximum element: " + max);
//        System.out.println("Minimum element: " + min);
//    }
//}

