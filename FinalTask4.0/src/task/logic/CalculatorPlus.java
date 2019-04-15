package task.logic;

import task.model.Matrix;

public class CalculatorPlus {

    public static int reverse(Matrix matrix) {

        int result = -1;

        if (matrix == null || matrix.getCountRows() == 0) {
            return result;
        }

        int rows = matrix.getCountRows();
        int columns = matrix.getCountColumns();

        int maxGl = matrix.getElement(0, 0);
        for (int i = 0; i < rows - 2; i++) {
            if (matrix.getElement(i, i) < matrix.getElement(i + 1, i + 1)) {
                maxGl = matrix.getElement(i + 1, i + 1);
            }

        }
        int maxPb = matrix.getElement(0, columns - 1);
        for (int i = 1; i < rows - 1; i++) {
            if (matrix.getElement(i, columns - i) < matrix.getElement(i + 1, columns - i - 1)) {
                maxPb = matrix.getElement(i + 1, columns - i - 1);
            }

        }
        int max = matrix.getElement(0, 0);
        if (maxGl >= maxPb) {
            max = maxGl;
        }
        if (maxGl < maxPb) {
            max = maxPb;
        }

        return maxGl;
    }
}
