package algorithms.sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = { 4, 2, 6, 5, 1, 3 };
        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
