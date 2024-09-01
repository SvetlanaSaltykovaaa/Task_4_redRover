package org.example;

public class Task_4 {
    static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

    static void toPrintOddNumbers(int[] array) {
        //Задача №1
        //необходимо вывести все нечетные числа из массива.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }

    static void toPrintNumbersMoreThen5(int[] array) {
        //Задача №2
        //необходимо вывести все значения массива больше 5.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }
    }

    static int[] toIncreaseNumbersFor15(int[] array) {
        //Задача №3
        //необходимо увеличить все значения массива на 15.
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 15;
        }
        return array;
    }
    static int[] toReverseNumbers(int[] array) {
        //Задача со звездочкой
        //Необходимо изменить порядок элементов массива на противоположный

        for (int i = 0; i < array.length / 2; i++) {
            int num = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = num;
        }
        return array;
    }
    public static void main(String[] args) {


            }

        }



