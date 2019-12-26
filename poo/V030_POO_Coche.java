package poo;

public class V030_POO_Coche {

	private int ruedas; // Número
	private int largo; // cm
	private int ancho; // cm
	private int motor; // cc
	private int peso_plataforma; // Kg

	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;

	// Constructor
	public V030_POO_Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	// Método Getter
	public String dime_largo() {
		return ("El largo del coche es " + largo + ".");
	}

	// Método Setter
	public void establece_color() {
		color = "azul";
	}

	// Método Getter
	public String dime_color() {
		return ("El color del coche es " + color + ".");
	}
}
