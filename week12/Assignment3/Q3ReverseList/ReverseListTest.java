package week12.Assignment3.Q3ReverseList;

import java.util.ArrayList;

public class ReverseListTest {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(9);
        l1.add(16);
        l1.add(25);
        System.out.println("List: " + l1);
        ReverseList.reverse(l1);
        System.out.println("Reversed list: " + l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Ant Man");
        l2.add("Batman");
        l2.add("Captain America");
        System.out.println("List: " + l2);
        ReverseList.reverse(l2);
        System.out.println("Reversed list: " + l2);
    }
}