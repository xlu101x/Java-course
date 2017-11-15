import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Matrix {
    private Author author;
    private List<List<Integer>> matrix;
    private int numberOfColumns;
    private int numberOfRows;

    public Matrix() {}

    public Matrix(int rows, int cols, String name, int age, String sex){
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
        this.matrix = outer;
        this.author = new Author(name, age, sex);
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

    @Override
    public boolean equals(Object var1) {
        if (var1 instanceof Matrix) {
            Boolean matricaIsEqual = true;
            for (int i = 0; i < this.matrix.size(); i++) {
                for (int j = 0; j < this.matrix.size(); j++) {
                    if (this.matrix.get(i).get(j) != ((Matrix) var1).matrix.get(i).get(j)) {
                        matricaIsEqual = false;
                    }
                }
            }
            return (this.numberOfRows == ((Matrix) var1).numberOfRows) &&
                    matricaIsEqual &&
                    (this.author.getAge() == ((Matrix) var1).author.getAge()) &&
                    (this.author.getSex() == ((Matrix) var1).author.getSex()) &&
                    (Objects.equals(this.author.getName(), ((Matrix) var1).author.getName())) &&
                    (this.numberOfColumns == ((Matrix) var1).numberOfColumns);
        } else return false;
    }

}
