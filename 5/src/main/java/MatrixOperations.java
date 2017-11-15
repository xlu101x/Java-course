import java.util.stream.IntStream;

public class MatrixOperations {
    private Matrix matrix;
    private int n;
    public void enterMatrix() {
        this.n = 3;
        this.matrix = new Matrix(this.n, this.n);
        int [][] testMatrix = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 10}
        };
        IntStream.range(0, this.n)
                .forEach((int i) -> {
                    IntStream.range(0, this.n)
                            .forEach((int j) -> {
                                this.matrix.setElement(i, j, testMatrix[i][j]);
                            });
                });
        System.out.println(this.matrix.getMatrix());
    }

    public int getMin() {
        final int[] min = {this.matrix.getElement(0, 0)};
        IntStream.range(0, this.n)
                .forEach((int i) -> {
                    IntStream.range(0, this.n)
                            .forEach((int j) -> {
                                if (this.matrix.getElement(i, j) < min[0]) {
                                    min[0] = this.matrix.getElement(i, j);
                                }
                            });
                });
        return min[0];
    }
    public int getMax() {
        final int[] max = {this.matrix.getElement(0, 0)};
        IntStream.range(0, this.n)
                .forEach((int i) -> {
                    IntStream.range(0, this.n)
                            .forEach((int j) -> {
                                if (this.matrix.getElement(i, j) > max[0]) {
                                    max[0] = this.matrix.getElement(i, j);
                                }
                            });
                });
        return max[0];
    }
}