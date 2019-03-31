package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    int min;
    int max;

    public RandomInitializer(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    /*  TODO (Проверка№1 ЛР№3)
        - Перед обращением к массиву следует делать проверку на правильность массива,
        если array = null, возникает ошибка! Исправить!
        - Добавить комментарии к полям и методам класса
    */
    
    /*  TODO (Проверка№2 ЛР№3)
        - Два прошлых замечания не исправленны!
    */
    
    public void initialize(int[] array) {
        for( int i = 0; i < array.length; i++ ){
            array[i] = (int)(Math.random()*( max - min + 1 ) - max);
        }
    }
}
