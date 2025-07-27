package SortingTest;

import Sorting.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    int[] input = {6,3,5,4,1,2};
    int[] expected = {1,2,3,4,5,6};

    @Test
    void bubbleSortTest1(){
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

}