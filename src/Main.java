
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        EntranceQueue<Integer> queue = new EntranceQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        System.out.println(queue.peek());

    }
    public static void printArr(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";

        System.out.println(str);
    }

}