import javax.swing.JOptionPane;

public class V026_Matrices_Bidimensionales_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado;
		double interes = 0.10;

		double[][] saldo = new double[6][5];

		for (int i = 0; i < saldo.length; i++) {
			saldo[i][0] = 10000;
			acumulado = 10000;
			for (int j = 1; j < saldo[i].length; j++) {
				acumulado += (acumulado * interes);
				saldo[i][j] = acumulado;
			}
			interes += 0.01;
		}

		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < saldo.length; i++) {
			System.out.println();
			for (int j = 0; j < saldo[i].length; j++) {
				System.out.printf("%1.2f  ", saldo[i][j]);
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");

		
		
		
		
	}

}
