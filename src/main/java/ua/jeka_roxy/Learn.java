package ua.jeka_roxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by wojda on 07.02.2016.
 */
public class Learn {
    public static void main(String[] args) throws IOException {
        int rowSize, columnSize;
        try {
             rowSize = Integer.parseInt(args[0]);
            columnSize = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input rowSize");
            rowSize = Integer.parseInt(reader.readLine());
            System.out.println("Input columnSize");
            columnSize = Integer.parseInt(reader.readLine());
        }
        int matrix[][] = new int[rowSize][columnSize];

        Random random = new Random();
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                matrix[row][column] = random.nextInt(100);
                System.out.print(matrix[row][column] + " ");
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

 сделай так, что - бы вывод был ровным ( табуляция )
*/
