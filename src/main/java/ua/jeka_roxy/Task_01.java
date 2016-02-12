package ua.jeka_roxy;


/**
 * Created by wojda on 10.02.2016.
 */
public class Task_01 {
    public static void main(String[] args) {
        int n = 10;
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] a3 = new int[n];
        int[] a4 = new int[n];
        int[] a5 = new int[n];

        for (int i = 0; i < n ; i++) {
            a1[i] = (int) (Math.random() * 20);
            a2[i] = (int) (Math.random() * 20);
            a3[i] = (int) (Math.random() * 20);
            a4[i] = (int) (Math.random() * 20);
            a5[i] = (int) (Math.random() * 20);
        }

        System.out.println("a1: ");
        for (int b1 : a1 ) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na2: ");
        for (int b1 : a2 ) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na3: ");
        for (int b1 : a3 ) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na4: ");
        for (int b1 : a4 ) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na5: ");
        for (int b1 : a5 ) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\nreverse output: ");
        for (int i = a1.length - 1; i >= 0; i--) { // int i = a1.length - 1; - нужно начать отсчет с последнего элемента, так как количество элементов 0-9, то все образно "сдвигается на 1"
            System.out.print(a1[i] + "\t");
        }
    }
}
/*
создать пять одномерных массивов

все массивы заполнить рандом числами
Массив:
1) вывести с конца
2) найти макс число в массиве
3) найти мин число в массиве
4) сортировать по возрастанию
5) сортировать по спаданию



 */