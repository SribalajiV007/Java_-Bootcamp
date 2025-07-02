package Practice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //reverse of array
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        //sum of array
        System.out.println("Sum of the given array is: "+sum(arr));

    }

    //Reverse of array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;

             start++;
             end--;
        }
    }

    //sum of array
    static int sum(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
