package poo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main() {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        IO.println(arr[0]);

        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList<>();

        arrayList.add(20);
        linkedList.add(20);
        linkedList.add(4,50);
    }
}
