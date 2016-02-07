package ua.jeka_roxy;

import java.io.IOException;

/**
 * Created by wojda on 07.02.2016.
 */
public class Learn {
    public static void main(String[] args) throws IOException {
        /*создать матрицу х * х( размер указывает пользователь )
        заполнить рандомными числами, но значение елементов по диагонале совпадает
        */
        int rowSize = Integer.parseInt(args[0]);
        int columnSize = Integer.parseInt(args[1]);
        int matrix[][] = new int[rowSize][columnSize];

        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(" ");
        }
    }
}
