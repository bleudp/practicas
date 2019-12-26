import javax.swing.JOptionPane;

public class V022_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long resultado = 1L;

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));

		resultado = numero;

		for (int i = numero; i > 1; i--) {
			Long valor_ant = resultado;
			resultado *= (i - 1);
			System.out.printf("i=%4d\t" + "Valor anterior=%20d\t" + " * %4d\t" + " = %20d%n", i, valor_ant, (i - 1),
					resultado);
		}
		System.out.printf("Factorial de %6d=\t%6d\n", numero, resultado);
	}

}
