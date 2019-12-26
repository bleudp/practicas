import javax.swing.*;

public class V015_Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Imprimir con formato: Dos decimales
		double x = 10000.0;
		System.out.println(x/3);
		System.out.printf("%1.2f", x/3);
		System.out.println();
		
		
		// Convertir String a double
		String num1=JOptionPane.showInputDialog("Introduce un número");
		double num2=Double.parseDouble(num1);
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
	}

}
