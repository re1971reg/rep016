import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    @Test
    public void testSize() {
        IndexStorage indexStorage = new IndexStorage(10);
        int expected = 10;
        int actual = indexStorage.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        IndexStorage indexStorage = new IndexStorage(5);
        int[] expected = {0, -1, 2, -3, 4};
        int[] actual = new int[5];
        for (int i = 0; i < 5; i++) {
            actual[i] = indexStorage.get(i);
        }
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverse() {
        IndexStorage indexStorage = new IndexStorage(5);
        int[] expected = {4, -3, 2, -1, 0};
        int[] actual = indexStorage.reverse();
        Assertions.assertArrayEquals(expected, actual);
    }
}