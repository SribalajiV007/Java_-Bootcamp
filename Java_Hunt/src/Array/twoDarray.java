package Array;

import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2 , 4 , 6},
                {3, 4, 8},
                {3, 6, 7, 2}
        };

        //1st way to print 2d array using for
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //2nd way to print using toString()
        for (int row = 0; row < arr.length; row++) {
             System.out.println(Arrays.toString(arr[row]));
        }

        //3rd way to print using for each
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
