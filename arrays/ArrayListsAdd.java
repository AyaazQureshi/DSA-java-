package arrays;

import java.util.ArrayList;

public class ArrayListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(50);
        System.out.println(list);
        list.add(60);
        System.out.println(list);
        list.add(-40);
        System.out.println(list);
        list.add(90);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
