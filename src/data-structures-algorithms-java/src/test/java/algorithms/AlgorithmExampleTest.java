import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmExampleTest {

    @Test
    void testBubbleSort() {
        AlgorithmExample algorithm = new AlgorithmExample();
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, algorithm.bubbleSort(input));
    }

    @Test
    void testQuickSort() {
        AlgorithmExample algorithm = new AlgorithmExample();
        int[] input = {7, 2, 1, 6, 8, 5};
        int[] expected = {1, 2, 5, 6, 7, 8};
        assertArrayEquals(expected, algorithm.quickSort(input));
    }

    @Test
    void testBinarySearch() {
        AlgorithmExample algorithm = new AlgorithmExample();
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int expectedIndex = 3;
        assertEquals(expectedIndex, algorithm.binarySearch(sortedArray, target));
    }

    @Test
    void testBinarySearchNotFound() {
        AlgorithmExample algorithm = new AlgorithmExample();
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        int target = 7;
        assertEquals(-1, algorithm.binarySearch(sortedArray, target));
    }
}