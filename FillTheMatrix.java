import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {


    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        int rows = Integer.parseInt(split[0]);
        int cols = Integer.parseInt(split[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }

        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);

        int[][] intMatrix = new int [rows][cols];
        int currentNumber = 1;


        if (input[1].equals("A")) {
            for (int col = 0; col < cols; col++) {
                for (int row = 0; row < rows; row++) {
                    intMatrix[row][col] = currentNumber;
                    currentNumber++;
                }
            }
        } else {
            for (int col = 0; col < cols; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < rows; row++) {
                        intMatrix[row][col] = currentNumber;
                        currentNumber++;
                    }
                } else {
                    for (int row = rows - 1; row >= 0 ; row--) {
                        intMatrix[row][col] = currentNumber;
                        currentNumber++;
                    }
                }
            }
        }

        printMatrix(intMatrix);

    }



}
