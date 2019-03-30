package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        Initializer fibonacciInit   = new FibonacciInitializer();               
        Initializer randomInit      = new RandomInitializer(-50, 50);
        Sort         bubbleSort     = new BubbleSort();
        Sort         selectionSort  = new SelectionSort();
        Sort         shellSort      = new ShellSort();
        
        fibonacciInit.initialize(array);
        System.out.print("Fibonacci: ");
        printArr(array);
        printSep();
        
        /*  TODO (Проверка№1 ЛР№3)
            - Вывести последовательность чисел Фибоначи и их сумму!
        */
        
        randomInit.initialize(array); 
        printArr(array);
        printSort(bubbleSort, array);
        printSep();
        
        randomInit.initialize(array);
        printArr(array);
        printSort(selectionSort, array);
        printSep();
        
        randomInit.initialize(array);
        printArr(array);
        printSort(shellSort, array);       
        printSep();
        
        

 	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел 
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
    
    static void printArr( int[] array ){                        //метод вывода массива
        
            int sum = Arrays.stream(array).sum();
            
            for( int i = 0; i < array.length; i++ ){
                System.out.print(array[i]+ ", ");
            }
            System.out.println("cумма = " + sum);
            
        }
    static void printSort(Sort sort, int[] array) {             //метод вывода сортировки
        
        sort.sort(array);
        
            System.out.print(sort.getName() + ": ");
            for( int i = 0; i < array.length - 1; i++ ){
                System.out.print(array[i]);
                System.out.print(", ");
            }
            System.out.println(array[array.length-1]);
            
            /*  TODO (Проверка№1 ЛР№3)
                - При выоде отсортированного массива выводится 19 чисел, хотя их 20!
                Исправить!
                - Добавить комментарии к полям и методам класса
            */
            System.out.println("");
    
    }
    
    static void printSep(){                                     //метод вывода разделителя
        System.out.println("------------------------------------------------");
    }
    
}


