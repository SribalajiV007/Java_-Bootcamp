package Array.InterviewQues;

public class maxArr {
    public static void main(String[] args) {
        int[] arr = {3, 23, 45, 34, 41, 7, 9};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,5));
    }

     static int max(int[] arr){
         int maxVal = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
         }
         return maxVal;
     }
     // for max between range
    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
