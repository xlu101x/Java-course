import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private List<List<Integer>> matrix;
    private int numberOfColumns;
    private int numberOfRows;

    public Matrix(int rows, int cols){
        this.numberOfRows = rows;
        this.numberOfColumns = cols;
        List<List<Integer>> outer = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                inner.add(0);
            }
            outer.add(inner);
        }
        this.matrix = outer;
    }

    public int getElement(int rowN, int colN) {
        boolean notBiggerThanMatrixDim = ((rowN > this.numberOfRows) && (colN > this.numberOfColumns));
        boolean dimNotLessThanZero = ((rowN < 0) && (colN < 0));
        if (notBiggerThanMatrixDim && dimNotLessThanZero) {
            return 1;
        } else return this.matrix.get(rowN).get(colN);
    }

    public void setElement(int rowN, int colN, int value) {
        boolean notBiggerThanMatrixDim = ((rowN > this.numberOfRows) && (colN > this.numberOfColumns));
        boolean dimNotLessThanZero = ((rowN < 0) && (colN < 0));
        if (!(notBiggerThanMatrixDim && dimNotLessThanZero)) {
            this.matrix.get(rowN).set(colN, value);
        }
    }

    public List<List<Integer>> getMatrix() {
        return this.matrix;
    }

}
