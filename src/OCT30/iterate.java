package OCT30;

import java.util.Arrays;

public class iterate {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length); // 1
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks); // {51,87,90,91,100};
        int item_index = Arrays.binarySearch(marks, 100); //after sorting to get the index of given key we user binarysearch

        System.out.println(item_index);
    }
}