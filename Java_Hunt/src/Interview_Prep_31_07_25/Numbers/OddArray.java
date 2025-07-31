package Interview_Prep_31_07_25.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddArray {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);


        int[] arr = {2,4,3,6,7,8,4,9};
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                odd.add(arr[i]);
            }
        }

        System.out.println("Odd numbers in the array is: "+odd);
    }
}
