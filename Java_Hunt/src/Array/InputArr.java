package Array;
import java.util.Arrays;

import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr= new int[7];

        // 1st method to print using for
        for(int i=0;i<arr.length; i++){
             arr[i] = s.nextInt();
        }

        // using for each
        for (int j : arr) {
            System.out.print(j + " ");
        }

        //using toString() method
        System.out.println(Arrays.toString(arr));

    }
}
