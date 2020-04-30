import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void should_sort_array() {
        int[] arr = new int[] {7, 5, 2, 3, 0, 10, 2, 5, 13, 55, 1, 22};
        int[] copy = arr.clone();

        QuickSort.sort(arr);
        Arrays.sort(copy);

        assertArrayEquals(copy, arr);
    }
}