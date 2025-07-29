package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min_index];
            array[min_index] = tmp;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
