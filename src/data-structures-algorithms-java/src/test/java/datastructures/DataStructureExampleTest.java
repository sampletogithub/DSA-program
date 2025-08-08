import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataStructureExampleTest {

    @Test
    void testArrayExample() {
        DataStructureExample example = new DataStructureExample();
        int[] result = example.arrayExample();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void testLinkedListExample() {
        DataStructureExample example = new DataStructureExample();
        List<Integer> result = example.linkedListExample();
        assertEquals(5, result.size());
        assertEquals(Integer.valueOf(1), result.get(0));
    }

    @Test
    void testTreeExample() {
        DataStructureExample example = new DataStructureExample();
        TreeNode root = example.treeExample();
        assertNotNull(root);
        assertEquals(10, root.value);
    }
}