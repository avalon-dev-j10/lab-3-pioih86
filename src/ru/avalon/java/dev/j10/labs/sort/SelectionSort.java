package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */

//Класс сортировки выбором
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    String name = "Сортировка выбором";
    
    public void sort(int[] array) {
        if ( array == null ) return;  
        for (int i = 0; i < array.length - 1; i++) 
        {  
            int min = i; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) 
                    min = j;
                }
            int buff = array[min]; 
            array[min] = array[i]; 
            array[i] = buff; 
        } 
        
        
        /*  TODO (Проверка№1 ЛР№3)
        - Перед обращением к массиву следует делать проверку на правильность массива,
        если array = null, возникает ошибка!Исправить!
        - Добавить комментарии к полям и методам класса
        - Это сортировка выбором, и сортируется в убывающем порядке. Сделать в возрастающем!!
        - Удалить ненужный метод test.
    */
    }
        
    public String getName() { return name; }
}
