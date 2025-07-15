package Array;

public class DuplcateArr {

    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        System.out.println("is any duplicate present in array? :"+duplicate(arr));
    }
    public static boolean duplicate(int[] nums){
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
