package ua.jeka_roxy.Easy;
import java.util.Arrays;
/**
 * Created by wojda on 10.02.2016.
 */
public class Task_002 {
    public static void main(String[] args) {
        int n = 10;
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] a3 = new int[n];
        int[] a4 = new int[n];
        int[] a5 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = (int) (Math.random() * 20);
            a2[i] = (int) (Math.random() * 20);
            a3[i] = (int) (Math.random() * 20);
            a4[i] = (int) (Math.random() * 20);
            a5[i] = (int) (Math.random() * 20);
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
        System.out.print(Arrays.toString(a5));

        /*System.out.println("a1: ");
        for (int b1 : a1) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na2: ");
        for (int b1 : a2) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na3: ");
        for (int b1 : a3) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na4: ");
        for (int b1 : a4) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\na5: ");
        for (int b1 : a5) {
            System.out.print(b1 + "\t");
        }
        System.out.println("\nreverse output: ");
        for (int i = a1.length - 1; i >= 0; i--) { // int i = a1.length - 1; - нужно начать отсчет с последнего элемента, так как количество элементов 0-9, то все образно "сдвигается на 1"
            System.out.print(a1[i] + "\t");
        }
        */
        System.out.println(getMax(a2));
        System.out.println(getMin(a3));
        bubbleSort(a4);
        System.out.println(Arrays.toString(a4));
        bubbleSort2(a5);
        System.out.println(Arrays.toString(a5));
    }

        static int getMax(int[] a2) {
            int maxValue = a2[0];
            System.out.println("\nmaximum value of a2 is: ");
            for (int i = 1; i < a2.length; i++) {
                if (a2[i] > maxValue) {
                    maxValue = a2[i];
            }
        }
        return maxValue;
        }
        static int getMin(int[] a3) {
            int minValue = a3[0];
            System.out.println("minimum value of a3 is: ");
            for (int i = 1; i < a3.length; i++) {
                if (a3[i] < minValue) {
                    minValue = a3[i];
            }
        }
        return minValue;
        }
        public static void bubbleSort(int[] a4){  // j < i; j++
            System.out.println("Bubble sort: ");
            for(int i = a4.length - 1; i > 0; i--){ // второй цикл выполняет 9 кругов за один круг первого цикла
                for(int j = 0; j < i; j++){  // c каждым кругом второго цикла, уменьшается количество элементом для проверки на 1
                    if( a4[j] > a4[j+1] ){  // если элемент больше, чем его следующий элемент, то меняем местами
                    int tmp = a4[j];
                    a4[j] = a4[j+1]; // = -присвоение
                    a4[j+1] = tmp;   // замена местами
                    }
                }
            }
        }
        public static void bubbleSort2(int[] a5){
            System.out.println("Bubble sort2: ");
            for(int i = 0; i < a5.length; i++){
                for(int j = 0; j < a5.length - i - 1; j++){  //Итерация происходит с j=0, До arr.length-1 и еще -i
                    if( a5[j] < a5[j+1] ){  // i значит круги первого цикла
                    int tm = a5[j];         // - i это значит - один круг первого цикла фор
                    a5[j] = a5[j+1];
                    a5[j+1] = tm;
                    }
                }
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