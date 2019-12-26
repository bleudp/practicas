import javax.swing.JOptionPane;

public class V026_Matrices_Bidimensionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 10, 15, 87, 19, 21 }, { 4, 6, 2, 45, 34 }, { 65, 45, 32, 4, 32 }, { 34, 67, 34, 23, 87 } };

		for (int[] fila : matrix) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}

	}

}
