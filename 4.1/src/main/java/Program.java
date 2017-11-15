class Program {
    public static void main(String[] args) {
        MatrixOperations operation = new MatrixOperations();
        operation.enterMatrix();
        System.out.println("Min element: " + operation.getMin());
        System.out.println("Max element: " + operation.getMax());
    }
}