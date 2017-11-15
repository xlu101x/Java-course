import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {
    @org.junit.jupiter.api.Test
    void getMin() {
        MatrixOperations operations = new MatrixOperations();
        operations.enterMatrix();
        assertEquals(0, operations.getMin());
    }

    @org.junit.jupiter.api.Test
    void getMax() {
        MatrixOperations operations = new MatrixOperations();
        operations.enterMatrix();
        assertEquals(10, operations.getMax());
    }

}