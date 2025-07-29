package SortingTest;

import Sorting.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    int[] input = {5,4,3,1,2};
    int[] expected = {1,2,3,4,5};

    @Test
    void insertionSortingTest1(){
        assertArrayEquals(expected, InsertionSort.sort(input));
    }


}