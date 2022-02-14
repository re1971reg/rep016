import java.util.Arrays;

public class Main {
    /**
     * Описание задания
     * Возьмите код из второго домашнего задания (про классы с `reverse()`), создайте мавен проект с этим кодом,
     * подключите JUnit и напишите 2-3 теста. Пришлите проект либо в виде архива, либо в виде ссылки на
     * публичный гитхаб-репо.
     *
     * Пример pom.xml прикреплён к заданию
     */

    public static final int MAX_SIZE = 11;

    public static void main(String[] args) {

        IndexStorage indexStorage = new IndexStorage(MAX_SIZE);
        System.out.printf("indexStorage.length=[%d]\n", indexStorage.size());
        for (int i = 0; i < indexStorage.size(); i++) {
            System.out.printf("indexStorage[%d]=%d\n", i, indexStorage.get(i));
        }
        System.out.println("reverse()=" + Arrays.toString(indexStorage.reverse()));

        int[] arr = {0, -10, 20, -30, 40, -50, 60, -70, -80, -90, 100, -110, 120, -130, 140};

        IndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        System.out.printf("arrayIndexStorage.length=[%d]\n", arrayIndexStorage.size());
        System.out.println("reverse()=" + Arrays.toString(arrayIndexStorage.reverse()));
    }
}