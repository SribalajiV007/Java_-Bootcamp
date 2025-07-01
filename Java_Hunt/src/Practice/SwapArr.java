package Practice;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,6, 4, 5};

        System.out.println("Before Swapping: "+Arrays.toString(arr));

        swap(arr,3,4);
        swap(arr,4,5);

        System.out.println("After Swapping: "+Arrays.toString(arr));

        revArr(arr);
        System.out.println("Reverse of array: "+Arrays.toString(arr));



    }
    static void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
