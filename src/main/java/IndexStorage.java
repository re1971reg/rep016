public class IndexStorage {
    /**
     * Создайте класс `IndexStorage` с тремя методами - `size()`, `get(int index)` и `reverse`.
     * Пусть размер заполняется конструктором, а `get` возвращает то же, что и в прошлом задании
     * (т.е. индекс или -индекс в зависимости от чётности). Напишите метод `reverse()`, который возвращает массив,
     * заполненный элементами в обратном порядке. Сделайте этот класс без хранения массивов в полях.
     */

    private int length;

    public IndexStorage(int length) {
        this.length = length;
    }

    public int size() {
        return this.length;
    }

    public int get(int index) {
        if (index < 0 || index > this.length - 1) {
            throw new IndexOutOfBoundsException("Элемент отсутсвует по индексу " + index);
        }
        return (index % 2) == 0 ? index : -index;
    }

    public int[] reverse() {
        int result[] = new int[size()];
        for (int i = 1; i < size(); i++) {
            result[size() - 1 - i] = get(i);
        }
        return result;
    }

}