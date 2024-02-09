package de.telran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(findMaxElement(new int[]{2, 5, 7, 8, 2, -8}));
        System.out.println(findMaxElementWithEvenIndex(new int[]{4, 8, 7, 1, 2, -8}));
        System.out.println(sumEvenPositivElem(new int[]{1, -8, 3, 4, -8, 21, 3, 6, 2, -7}));
        System.out.println(findAverageArrayElem(new int[]{2, 3, 5}));
        System.out.println(Arrays.toString(findElementsLessThanAverage(new int[]{5, 6, 7, 2, 7, -9})));
        System.out.println(Arrays.toString(findTwoMinElement(new int[]{1, 6, 78, 10})));
    }

    //В массиве найти максимальный элемент
    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //В массиве найти максимальный элемент с четным индексом
    public static int findMaxElementWithEvenIndex(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && i % 2 == 0) {
                max = arr[i];
            }
        }
        return max;
    }

    //    В массиве, содержащем положительные и отрицательные целые числа,
//    вычислить сумму четных положительных элементов
    public static int sumEvenPositivElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                sum = sum + arr[i];
            }

        }
        return sum;

    }

    //Найти среднее арифметическое от всех элементов массива
    public static double findAverageArrayElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    //    Найти в массиве те элементы, значение которых меньше среднего арифметического,
//    взятого от всех элементов массива
    public static int[] findElementsLessThanAverage(int[] arr) {
        int average = (int) findAverageArrayElem(arr);
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                result[count] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);

    }

    //    В массиве целых чисел определить два наименьших элемента. Они могут быть
//    как равны
//    между собой (оба являться минимальными), так и различаться
    public static int[] findTwoMinElement ( int [] array){
        int [] result = new int[2];
        int min1 = array[0];
        int min2 = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i <array.length; i++){
            if ( array[i] < min1 ){
                min1 = array[i];
                minIndex = i;


            }
        }
        for (int i = 0; i <array.length; i++ ){
            if ( array[i] < min2 && i != minIndex){
                min2 = array[i];
            }

        }
        result[0] = min1;
        result[1] = min2;
        return result;
    }
}



Задача
        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива, вернув новый массив нужной длинны.

        Задача
        Напишите программу которая выводит на конслоь простые числа в промежутке от 2 до 100 включительно.

        Задача
        В массиве из целых чисел найти индекс минимального из четных положительных элементов, при их отсутствии вывести -1.

        Задача
        Вычислить сумму положительных элементов массива А после первого нуля (при наличии нуля).

        Задача
        Отсортировать массив а[0..n] по возрастанию и по убыванию. Без использования Arrays.sort()

        Задача
        Дано два массива. Сравнить их.