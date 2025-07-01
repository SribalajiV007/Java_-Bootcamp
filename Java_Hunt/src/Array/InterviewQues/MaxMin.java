package Array.InterviewQues;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56,76,543};

        int maxArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }

        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minArr){
                minArr = arr[i];
            }
        }

        System.out.println("Maximum number in an Array: "+maxArr);
        System.out.println("Minimum number in an Array is: "+minArr);
    }
}
