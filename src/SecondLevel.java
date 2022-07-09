import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size for square array");
        int n = scanner.nextInt();
        int[][] table = new int [n][n];

        for (int i = 0; i < table.length; i++){
            table[i][i] = 1;
            table[i][table.length-i-1] = 1;

        }

        printArray(table);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
