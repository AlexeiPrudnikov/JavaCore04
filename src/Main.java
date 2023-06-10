import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Main {
    private static void printArray(String[][] matrix) {
        if (matrix == null) return;
        for (String[] line : matrix) {
            for (String cell : line) {
                System.out.print(String.format("%s\t", cell));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        ArithmeticString arithmeticString = new ArithmeticString(4);
        try {
            printArray(matrix);
            System.out.println("Сумма элементов: " + arithmeticString.getSumMyArraySizeException(matrix));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("==========");
        matrix = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        printArray(matrix);
        try {
            System.out.println("Сумма элементов: " + arithmeticString.getSumMyArraySizeException(matrix));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("==========");
        matrix = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        printArray(matrix);
        try {
            System.out.println("Сумма элементов: " + arithmeticString.getSumMyArraySizeException(matrix));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("==========");
        matrix = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "qwe", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        printArray(matrix);
        try {
            System.out.println("Сумма элементов: " + arithmeticString.getSumMyArraySizeException(matrix));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}