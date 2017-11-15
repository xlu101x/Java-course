import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Program {
    public static void main(String[] args) throws IOException {
        MatrixOperations operation = new MatrixOperations();
        operation.enterMatrix();
        System.out.println("Min element: " + operation.getMin());
        System.out.println("Max element: " + operation.getMax());

        Matrix matrix = new Matrix(3, 3, "Ivan Ivanov", 32, "male");
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("matrix.json");
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.writeValue(file, matrix);
        try {
            Matrix newMatrix = mapper.readValue(file, Matrix.class);
            System.out.println("Is matrix equals?: " + newMatrix.equals(matrix));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}