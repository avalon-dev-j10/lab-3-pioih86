package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    String name = "Сортировка Шелла";
    
    public void sort(int[] array) {
        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment = increment / 2;
        }
    }
    
        public void insertionSort(int[] array, int startIndex, int increment) {
            for (int i = startIndex; i < array.length - 1; i = i + increment) {
                for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
                    if (array[j - increment] > array[j]) {
                        int tmp = array[j];
                        array[j] = array[j - increment];
                        array[j - increment] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }


    
    public String getName() { return name; }
}
