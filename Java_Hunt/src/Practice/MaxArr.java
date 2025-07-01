package Practice;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr1 = {29, 43, 56, 54, 78 , 97};

        System.out.println("Maximum number in the array: "+max(arr1));
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
}
