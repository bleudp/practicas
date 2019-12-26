import java.util.*;

public class V019_Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		// Puede fallar si aleatorio es 0 
		while (numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un número, por favor.");
			numero = entrada.nextInt();

			if (aleatorio < numero) {
				System.out.println("Es más bajo. Prueba otra vez.");
			} else if (aleatorio > numero) {
				System.out.println("Es más alto. Prueba otra vez.");
			}
		}
		System.out.println("Correcto! Lo has conseguido en " + intentos + " intentos.");
	}
}
