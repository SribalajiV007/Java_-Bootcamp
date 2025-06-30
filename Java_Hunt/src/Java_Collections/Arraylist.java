package Java_Collections;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print(list);

        list.add(6);
        System.out.print(list);

        list.add(2,4);
        System.out.print(list);

        list.get(3);
        list.remove(4);
        System.out.print(list);

        list.set(4,6);
        System.out.print(list);

        list.contains(2);
        list.size();
        list.clear();

        System.out.print(list);

    }
}
