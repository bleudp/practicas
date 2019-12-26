package poo;

public class V031_POO_Coche {

	private int ruedas; // N�mero
	private int largo; // cm
	private int ancho; // cm
	private int motor; // cc
	private int peso_plataforma; // Kg

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	// Constructor
	public V031_POO_Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	// M�todo Getter
	public String dime_datos_generales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. " + "Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
	}

	// M�todo Setter con parámetros
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

		if (asientos_cuero == "si") {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche no tiene asientos de cuero de serie";
		}
	}
}
