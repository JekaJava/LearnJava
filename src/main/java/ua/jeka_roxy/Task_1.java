package ua.jeka_roxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by wojda on 07.02.2016.
 */
public class Task_1 {
    public static void main(String[] args) throws IOException {
        int rowSize, columnSize;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input rowSize: ");
        rowSize = Integer.parseInt(reader.readLine());
        System.out.print("Input columnSize: ");
        columnSize = Integer.parseInt(reader.readLine());
        int matrix[][] = new int[rowSize][columnSize];
        printMatrix(matrix(inputMatrix(matrix),0));
    }

    public static int[][] inputMatrix ( int[][] a) {  //заполняем матрицу числами
        Random random = new Random();
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                a[i][j] = random.nextInt(100);
            }
        }
        return a;
    }

    public static int[][] matrix ( int [][] a, int c ) {  //меняем числа в диагонале на любое число
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                if ( j == i) {
                    a[i][j] = c;
                }
            }
        }
        return a;
    }

    public static void printMatrix ( int [][] a) {   //вывод любой матрицы
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                System.out.print(a[i][j] + "\t"); //OR System.out.format("%3d ",matrix[row][column])
            }
            System.out.println(" ");
        }
    }

}
/*создать матрицу х * х( размер указывает пользователь ) заполнить рандомными числами, но значение елементов по диагонале совпадает


добивил блок try ... catch, если запускать в иде то ввод пропускаеться ( ошибка ArrayIndexOutOfBoundsException )
если с консоли то будет работать твой вариант, а если с идеа - мой

прикольная идея: ты не делала отдельно цикл для вывода, а сразу выводила - прогрес на лицо

(int) (Math.random() * 100) - избавился от преобразования типа ( создал объект класса рандом, вызвал метод nextInt ( аргумент - макс число ) )

насчет диагонали - это елемент у которого совпадают значение  row и column, можно заменить на заданное число \ первое число которое выпадет из рандома

 сделай так, что - бы вывод был ровным


 Пример
 ввод:
 5
 5
 вывод:
0	14	8	38	49
38	0	21	81	69
90	25	0	24	2
61	78	4	0	72
20	29	26	44	0
*/
