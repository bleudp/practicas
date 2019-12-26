import javax.swing.JOptionPane;

public class V024_Matrices_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz_aleatorios = new int[150];

		// Cargar matriz con números aleatorios
		for (int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
		}

		// Imprimir la matriz
		for (int numeros : matriz_aleatorios) {
			System.out.print(numeros + " ");
		}
		System.out.println("");

	}

}
