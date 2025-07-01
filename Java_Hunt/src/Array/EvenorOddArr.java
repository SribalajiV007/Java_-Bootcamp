package Array;

public class EvenorOddArr {
    public static void main(String[]args){
        int[] arr = {23,34,54,35,67,45,78};
        String even= " ";
        String odd = " ";


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0){
                even += arr[i]+", ";
            } else if (arr[i] %2 != 0) {
                odd += arr[i]+", ";
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);

    }
}

// Using double for loop

//int[] arr = {23, 34, 54, 35, 67, 45, 78};
//
//        System.out.print("Even numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] % 2 == 0) {
//        System.out.print(arr[i] + " ");
//            }
//                    }
//
//                    System.out.println();
//
//        System.out.print("Odd numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] % 2 != 0) {
//        System.out.print(arr[i] + " ");
//            }
//                    }
