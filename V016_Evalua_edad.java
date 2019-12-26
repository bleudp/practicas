import java.util.*;

public class V016_Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad, por favor:");
		int edad = entrada.nextInt();

		// if / else sencillo
		System.out.println("Primer caso: if/else sencillo.");
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}

		// if / elseif
		System.out.println("Segundo caso: if/elseif múltiple.");
		if (edad < 18) {
			System.out.println("Eres un adolescente.");
		} else if (edad < 40) {
			System.out.println("Eres joven.");
		} else if (edad < 65) {
			System.out.println("Eres maduro.");
		} else {
			System.out.println("Cuídate.");
		}
		System.out.println(">> Fin del programa.");
		System.out.println("");
	}
}
