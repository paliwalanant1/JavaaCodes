package constructor.parameterizeconstructor.staticvalues.parameterizetwofour;

public class MatrixShow {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3);
        System.out.println("Rows: " + m.getRows() + ", Cols: " + m.getCols());
    }
}
