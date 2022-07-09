import java.util.Arrays;
import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: In this assignment you should write the program that create a new array int[n][m], fill it with random integers and displays it");
        System.out.println("Please enter row count for new array");
        int n = scanner.nextInt();
        System.out.println("Please enter column count for new array");
        int m = scanner.nextInt();
        int[][] array = createArray(n, m);
        printArray(array);
        otherPrintArray(array);
        System.out.println("Task 2: Implement the method that takes int[][] array and row number and checks that the average of the elements in a row is greater than 0");
        System.out.println("Enter row number");
        int row = scanner.nextInt();
        if (row >= array.length || row < 0) {
            System.out.println("Wrong row number");
        } else {
            System.out.println("Average in row " + row + " is positive: " + isAveragePositive(array, row));
        }

    }

    private static int[][] createArray(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (-5 + Math.random() * 10);
            }
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static void otherPrintArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isAveragePositive(int[][] array, int row) {
        double avg = 0;
        for (int j = 0; j < array[row].length; j++) {
            avg += array[row][j];
        }
        avg /= array[row].length;
        System.out.println(avg);

        return avg > 0;
    }
}
