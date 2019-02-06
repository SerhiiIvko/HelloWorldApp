package sortAlgorythms.task3;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Selection sort array
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        randomFillArray(array);
        selectionSort(array);
        Arrays.stream(array).mapToObj(anArray -> anArray + " ").forEach(System.out::print);
    }

    private static void randomFillArray(int[] array) {
        IntStream.range(0, array.length).forEach(i -> {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        });
        System.out.println();
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int tmp1 = i;
            for (int j = tmp1 + 1; j < array.length; j++) {
                if (array[j] < array[tmp1]) {
                    tmp1 = j;
                }
            }
            int tmp2 = array[i];
            array[i] = array[tmp1];
            array[tmp1] = tmp2;
        }
    }
}
