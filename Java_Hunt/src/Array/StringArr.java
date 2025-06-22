package Array;
import java.util.*;

public class StringArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] arr = new String[5];

        System.out.println("Enter words below");

        for(int i=0;i< arr.length; i++){
            arr[i] = s.next();
        }

        System.out.println(Arrays.toString(arr));


    }
}
