package ua.jeka_roxy.Easy;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by wojda on 08.02.2016.
 */
public class Task_003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indicate size of an array: ");

        int n = input.nextInt(), j;
        int[] arr = new int[n];
        System.out.print("Fill an array with positive and negative numbers: ");
        int i = 0;
        for ( ; i < arr.length ; i++) {
            j = input.nextInt();
            if ( j != 300 ) { // если j не равно 300, то
                arr[i] = j;   // продолжает ввод
            } else { // новый метод надо сюда
              break;   // если равно 300, то выводим массив рандомных чисел
            }
        }
        inputArray(arr,i);
    }

    public static void inputArray(int[] arr, int i) {
        Random random = new Random();
        for ( ; i < arr.length; i++) {
            arr[i] = (int) (random.nextInt(100) * Math.pow((-1),random.nextInt(3)));
        }
        String word = "";
        for (int j = 0; j < arr.length ; j++) {
            System.out.format(word + " " + "%2d%n",arr[j]);
            word += " ";
        }

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