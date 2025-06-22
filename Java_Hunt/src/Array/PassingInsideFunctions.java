package Array;
import java.util.Arrays;

public class PassingInsideFunctions {
    public static void main(String[] args) {
        int[] nums = {0 , 1 ,2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
        nums[0] = 77;
    }
}
