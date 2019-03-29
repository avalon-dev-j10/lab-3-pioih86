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
    
    public void initialize(int[] array) {
        for( int i = 0; i < array.length; i++ ){
            array[i] = (int)(Math.random()*( max - min + 1 ) - max);
        }
    }
}
