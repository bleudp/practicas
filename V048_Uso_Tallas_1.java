
public class V048_Uso_Tallas_1 {

	enum Talla {
		MINI, MEDIANO, GRANDE, MUY_GRANDE
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String talla2;

		// Se cargan distintos valores a lo largo de la ejecución del programa

		talla2 = "Pequeña";

		talla2 = "Mediana";

		talla2 = "Grande";

		// Se puede cargar un valor sin sentido, incorrecto:
		talla2 = "Azul";

		// Con un tipo enumerado se declaran los valores que se pueden utilizar.

		// No se puede declarar dentro del main. Se declara más arriba, fuera
		// del main

		Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;

	}

}
