package Array.InterviewQues;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 33 , 7 ,45, 6, 9};
        System.out.println("Before swap: "+ Arrays.toString(arr));

         swap(arr,0,4);
         swap(arr,2,5);
        System.out.println("After swap: "+ Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }
}
