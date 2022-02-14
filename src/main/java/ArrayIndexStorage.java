import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayIndexStorage extends IndexStorage {
    /**
     * Создайте ему наследника `ArrayIndexStorage`, который бы принимал в конструкторе один параметр - массив интов,
     * в котором хранил бы все данные. `get(int index)` должен возвращать значение ячейки массива под номером
     * этого индекса. Обеспечьте корректную работоспособность всех методов, причём сделайте оба класса так,
     * чтобы для этого не пришлось переопределять `reverse` в `ArrayIndexStorage`
     */
    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

}