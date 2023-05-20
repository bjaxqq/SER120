package Coding Assignments.Assignment 3;

import java.util.ArrayList;

public class Q3ReverseList {
    public static <E> void reverse(ArrayList<E> list) {
        int size = list.size();
        for (int index = 0; index < size / 2; index++) {
            E temp = list.get(index);
            list.set(index, list.get(size - 1 - index));
            list.set(size - 1 - index, temp);
        }
    }
}