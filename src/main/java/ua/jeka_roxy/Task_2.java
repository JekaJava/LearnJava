package ua.jeka_roxy;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by wojda on 08.02.2016.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indicate size of an array: ");

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (input.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                arr[i] = input.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную/массив
                System.out.print("Fill an array with positive and negative numbers: ");
            } else {
                System.out.println("Invalid input");
            }
            System.out.println(Arrays.toString(arr)); 
            /*while (input.hasNextInt()) {
                if (arr[i] == 300) {
                    input.close();


                }
            }*/
        }
    }

    public static int[] inputArray(int[] arr, int i) {
        Random random = new Random();
        for ( ; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}

/*
создать массив чисел произвольной длины
пользователь заполняет массив, при вводе числа "300" ввод чисел заканчиваеться и остальные клетки заполняются рандомными числами и не только > 0, но и < 0
вывести массив ввиде ступенек
для считывания данных воспользываться с классом Scanner

Пример:
ввод:
20
1
2
-23
300
вывод:
   1
     2
     -23
       207
         570
            76
             795
              -240
                 599
                   -60
                    -862
                      -218
                         408
                          -635
                             296
                               430
                                 -51
                                   842
                                    -909
                                      -649

 */