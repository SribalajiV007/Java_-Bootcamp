package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesnsionArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int[][] arr = new int[3][3];

//        int[][] arr= {
//            {1 , 2 , 3},
//            {4 , 5 , 6 , 8},
//            {7 , 8 , 9}
//        };

//        for(int i =0; i<arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        // To take input
        for(int row =0;row < arr.length; row++) {
            //for each col in every row
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = s.nextInt();
            }
        }
        //Output
//        for(int row =0;row < arr.length; row++) {
//            //for each col in every row
//            for(int col=0; col<arr[row].length; col++){
//                 System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // print same using toString()
//        for(int row =0;row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        
    }
}
