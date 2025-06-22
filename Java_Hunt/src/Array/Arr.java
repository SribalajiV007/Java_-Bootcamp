package Array;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[7];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 20;
        arr[6] = 56;

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }



    }
}
