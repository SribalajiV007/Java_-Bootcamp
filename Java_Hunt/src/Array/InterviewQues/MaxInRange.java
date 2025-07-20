package Array.InterviewQues;

public class MaxInRange {

    static int maxRange(int[] array,int start , int end ){
        if( start < 0 || end >= array.length || start > end){
            throw new IllegalArgumentException("Invalid range");
        }

        int max = array[start];
        for(int i = start; i<=end; i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[]args){
        int[] numbers = {24,36,43,56,43,23,14,67,87};
        int start = 0;
        int end = 2;

       int max =  maxRange(numbers,start,end);
       System.out.println("Maximum number in the given range is: "+max);

    }
}
