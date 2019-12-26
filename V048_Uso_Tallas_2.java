import java.util.Scanner;

public class V048_Uso_Tallas_2 {

	// enum Talla {
	// MINI, MEDIANO, GRANDE, MUY_GRANDE
	// };

	enum Talla {

		// Se declara el parámetro a pasar
		MINI("S"), MEDIANO("S"), GRANDE("L"), MUY_GRANDE("XL");

		// private porque los tipos enumerados no admiten la construcción de
		// objetos
		// En este ejemplo el propio constructor actúa como setter
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;

		}

		public String dameAbreviatura() { // getter
			return (abreviatura);
		}

		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

		// Ojo: El utilizar un valor no permitido provoca una excepción
		String entrada_datos = entrada.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

		System.out.println("Talla=" + la_talla);
		System.out.println("Abreviatura=" + la_talla.dameAbreviatura());

	}

}
