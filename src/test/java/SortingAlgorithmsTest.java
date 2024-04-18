import org.junit.Test;
import ru.mirea.SortingAlgorithms;

import static org.junit.Assert.assertArrayEquals;

public class SortingAlgorithmsTest {
    @Test
    public void testBubbleSort_emptyArray() {
        int[] array = {};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testBubbleSort_singleElement() {
        int[] array = {1};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testBubbleSort_sortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testBubbleSort_reverseArray() {
        int[] array = {5, 4, 3, 2, 1};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testBubbleSort_unsortedArray() {
        int[] array = {3, 1, 4, 5, 2};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testInsertionSort_emptyArray() {
        int[] array = {};
        SortingAlgorithms.insertionSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testInsertionSort_singleElement() {
        int[] array = {1};
        SortingAlgorithms.insertionSort(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testInsertionSort_sortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        SortingAlgorithms.insertionSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testInsertionSort_reverseArray() {
        int[] array = {5, 4, 3, 2, 1};
        SortingAlgorithms.insertionSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testInsertionSort_unsortedArray() {
        int[] array = {3, 1, 4, 5, 2};
        SortingAlgorithms.insertionSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}