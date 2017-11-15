public class Matrix {
    private int[][] matrix;
    private int numberOfColumns;
    private int numberOfRows;

    public Matrix(int rows, int cols) {
        this.numberOfRows = rows;
        this.numberOfColumns = cols;
        this.matrix = new int[this.numberOfRows][this.numberOfColumns];
    }

    public int getElement(int rowN, int colN) {
        boolean notBiggerThanMatrixDim = ((rowN > this.numberOfRows) && (colN > this.numberOfColumns));
        boolean dimNotLessThanZero = ((rowN < 0) && (colN < 0));
        if (notBiggerThanMatrixDim && dimNotLessThanZero) {
            return 1;
        } else return this.matrix[rowN][colN];
    }

    public void setElement(int rowN, int colN, int value) {
        boolean notBiggerThanMatrixDim = ((rowN > this.numberOfRows) && (colN > this.numberOfColumns));
        boolean dimNotLessThanZero = ((rowN < 0) && (colN < 0));
        if (!(notBiggerThanMatrixDim && dimNotLessThanZero)) {
            this.matrix[rowN][colN] = value;
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }


}
