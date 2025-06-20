package Methods;

public class LargestofThree {
    public static void main(String[] args) {
        int a = 1980, b=10000, c=10000;

        int largest = a ;

        if(b>largest){
            largest = b;
        }
        if(c>largest){
            largest = c;
        }

        System.out.println("Largest if three is: "+largest);


    }
}
