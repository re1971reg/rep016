import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTest {
    @Test
    public void testGet() {
        int[] arr = new int[] {0, 1, 2, 3, 4};
        IndexStorage indexStorage = new ArrayIndexStorage(arr);
        int[] expected = {0, 1, 2, 3, 4};
        int[] actual = new int[5];
        for (int i = 0; i < 5; i++) {
            actual[i] = indexStorage.get(i);
        }
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        int[] arr = new int[] {0, 1, 2, 3, 4};
        IndexStorage indexStorage = new ArrayIndexStorage(arr);
        int[] expected = {4, 3, 2, 1, 0};
        int[] actual = indexStorage.reverse();
        Assertions.assertArrayEquals(expected, actual);
    }

}