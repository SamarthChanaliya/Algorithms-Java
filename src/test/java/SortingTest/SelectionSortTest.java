package SortingTest;

import Sorting.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    int[] input = {64,25,12,22,11};
    int[] expected = {11,12,22,25,64};

    @Test
    void selectionSortingTest1(){
        assertArrayEquals(expected, SelectionSort.sort(input));
    }
}