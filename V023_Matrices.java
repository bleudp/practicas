
public class V023_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sintaxis 1 para declarar matrices
		int[] mi_matriz1 = new int[5];

		// Sintaxis 2 para declarar matrices
		int mi_matriz2[] = new int[5];

		// Inicialización
		mi_matriz1[0] = 5;
		mi_matriz1[1] = 38;
		mi_matriz1[2] = -15;
		mi_matriz1[3] = 92;
		mi_matriz1[4] = 71;

		// Otro formato para inicialización, en la propia declaración
		int[] mi_matriz3 = { 5, 38, -15, 92, 71 };

		// Otro formato para inicialización, en la propia declaración
		int mi_matriz4[] = { 5, 38, -15, 92, 71 };

		System.out.println("Resultado para mi_matriz1");
		for (int i = 0; i < mi_matriz1.length; i++) {
			System.out.println("mi_matriz1[" + i + "]=" + mi_matriz1[i]);
		}

	}

}
