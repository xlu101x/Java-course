import java.util.Comparator;
import java.util.stream.IntStream;

public class MatrixOperations {
    private Matrix matrix;
    private int n;
    public void enterMatrix() {
        this.n = 3;
        this.matrix = new Matrix(this.n, this.n, "test", 1, "male");
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
        return this.matrix.getMatrix().stream()
                .min(Comparator.comparing(p -> p.stream().min(Integer::compareTo).get())).get()
                .stream().min(Integer::compareTo).get();
    }

    public int getMax() {
        return this.matrix.getMatrix().stream()
                .max(Comparator.comparing(p -> p.stream().max(Integer::compareTo).get())).get()
                .stream().max(Integer::compareTo).get();
    }
}