package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */

//Класс сортировки пузырьком
public class BubbleSort implements Sort {

    /**
     * {@inheritDoc}
     */
    String name = "Сортировка пузырьком";
    
    public void sort(int[] array) {
        if (array == null) return;
//        for( int i = 0; i < array.length - 1; i++ ){
//            for ( int j = i + 1 ; j < array.length; j++ ){
//                if (array[i] > array[j]){
//                    int buff = array[j];
//                    array[j] = array[i];
//                    array[i] = buff;
//                } 
//            }
//        }
        for( int i = 1; i < array.length; i++ ){
            int buff;
            for(int j = 0; j < array.length - i; j++ ){
                if ( array[j+1] < array[j] ){
                    buff = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buff;                    
                }
            }
        }
    }
    
    /*  TODO (Проверка№1 ЛР№3)
        - Перед обращением к массиву следует делать проверку на правильность массива,
        если array = null, возникает ошибка!Исправить!
        - Добавить комментарии к полям и методам класса
        - Это не пузырьковая сортировка, и сортируется в убывающем порядке. Сделать пузырьковой!
    */
    
    public String getName() { return name; }
}
