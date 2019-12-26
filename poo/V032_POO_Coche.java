package poo;

public class V032_POO_Coche {

	private int ruedas; // N�mero
	private int largo; // cm
	private int ancho; // cm
	private int motor; // cc
	private int peso_plataforma; // Kg

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	// Constructor
	public V032_POO_Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	// Método Getter
	public String dime_datos_generales() {
		return "La plataforma del veh�culo tiene " + ruedas + " ruedas. " + "Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
	}

	// Método Setter con parámetros
	public void establece_color(String color_coche) {
		// color = "azul";
		color = color_coche;
	}

	// M�todo Getter
	public String dime_color() {
		return ("El color del coche es " + color + ".");
	}

	// M�todo Setter para asientos_cuero
	public void configura_asientos(String asientos_cuero) {
		// "this.asientos_cuero" se refiere a la variable de clase, y
		// "asientos_cuero" al parámetro o argumento pasado.
		// this.asientos_cuero = asientos_cuero;

		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero.";
		} else {
			return "El coche tiene asientos de serie.";
		}
	}

	public void configura_climatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dime_climatizador() {
		if (climatizador == true) {
			return ("El coche incorpora climatizador.");
		} else {
			return ("El coche lleva aire acondicionado.");
		}
	}

	// Método Setter y Getter a la vez.- No recomendado.
	public String dime_peso_coche() {
		int peso_carrocería = 500;
		peso_total = peso_plataforma + peso_carrocería;
		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total + ".";
	}

	public int precio_coche() {
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
}
