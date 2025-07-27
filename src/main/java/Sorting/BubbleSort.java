package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
