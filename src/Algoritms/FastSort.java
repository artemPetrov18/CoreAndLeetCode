package Algoritms;

import java.util.Arrays;
import java.util.HashMap;

public class FastSort {


    //
    /* Принцы работы ,разделяй и властвуй,
        1.Выбираем опорный элемент из массива. Как правило, это средний элемент.
        2.Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
        3.Рекурсивно применяем сортировку к обоим подмассивам.
    *

    В худшом случае имеет сложность алгоритма O(n^2) в среднем o(nlogn) но средний случай встречаеться на много чаще худшого
    то есть быстрая сортировка быстрее сортировки слиянием с сложностьюO(nlogn)
    *
    * */
    public static void quickSort(int[] array, int low, int high) {
        HashMap hs=new HashMap<>();

        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
