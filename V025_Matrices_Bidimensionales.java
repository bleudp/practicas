import javax.swing.JOptionPane;

public class V025_Matrices_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[4][5];

		matrix[0][0] = 15;
		matrix[0][1] = 21;
		matrix[0][2] = 18;
		matrix[0][3] = 9;
		matrix[0][4] = 15;

		matrix[1][0] = 10;
		matrix[1][1] = 52;
		matrix[1][2] = 17;
		matrix[1][3] = 19;
		matrix[1][4] = 7;

		matrix[2][0] = 19;
		matrix[2][1] = 2;
		matrix[2][2] = 19;
		matrix[2][3] = 17;
		matrix[2][4] = 7;

		matrix[3][0] = 92;
		matrix[3][1] = 13;
		matrix[3][2] = 13;
		matrix[3][3] = 32;
		matrix[3][4] = 41;

		// System.out.println(matrix[2][3]);

		// Formato impresión 1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
			}
		}
		System.out.println("---------------------------------------------------------------------------------");

		// Formato impresión 2
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + i + "][" + j + "] = " + matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------");

		// Salida a JOptionPane
		String row = "";
		for (int i = 0; i < matrix.length; i++) {
			row += "\n";
			for (int j = 0; j < matrix[i].length; j++) {
				row += "[" + i + "][" + j + "] = " + matrix[i][j] + "  ";
			}
		}
		JOptionPane.showMessageDialog(null, "matrix[][] contiene:" + row);

	}

}
