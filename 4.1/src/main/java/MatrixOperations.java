import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class MatrixOperations {
    private Matrix matrix;
    private int n;
    public void enterMatrix() {
        Random r = new Random();
        this.n = r.ints(2, 3).findFirst().getAsInt();
        this.matrix = new Matrix(this.n, this.n);
        IntStream.range(0, this.n)
                .forEach((int i) -> {
                    IntStream.range(0, this.n)
                            .forEach((int j) -> {
                                this.matrix.setElement(i, j, r.ints(1, 10).findFirst().getAsInt());
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