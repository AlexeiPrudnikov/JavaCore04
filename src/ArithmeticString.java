import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class ArithmeticString {
    private int size;

    public ArithmeticString(int size) {
        this.size = size;
    }

    private boolean isNumber(String value) {
        try {
            Integer.valueOf(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int getSumMyArraySizeException(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (matrix == null) {
            throw new MyArraySizeException(String.format("Ошибка getSumMyArraySizeException: размера массива, размер должен быть %d x %d", size, size));
        }
        if (matrix.length != size) {
            throw new MyArraySizeException(String.format("Ошибка getSumMyArraySizeException: количество строк не равно %d", size));
        }
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length != size) {
                throw new MyArraySizeException(String.format("Ошибка getSumMyArraySizeException: количество элементов %d-ой строки не равно %d", i, size));
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (isNumber(matrix[i][j])) {
                    result += Integer.valueOf(matrix[i][j]);
                } else {
                    throw new MyArrayDataException(String.format("Ошибка MyArrayDataException, элемент [%d, %d] не является числом ", i, j));
                }
            }
        }
        return result;
    }
}
