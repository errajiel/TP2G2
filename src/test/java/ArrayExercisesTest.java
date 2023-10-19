import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercisesTest {
    @Test
    public void testOptimizedBubbleSort() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        ArrayExercises.optimizedBubbleSort(arr);
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSearchInRotatedArray() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, ArrayExercises.searchInRotatedArray(arr, 0));
    }

    @Test
    public void testMerge() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, ArrayExercises.merge(intervals));
    }
}
