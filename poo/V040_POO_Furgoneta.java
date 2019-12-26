// Referencias:
// Vídeos 040, 041
// Herencia de clases

package poo;

public class V040_POO_Furgoneta extends V032_POO_Coche {

	private int plazas_extra;
	private int capacidad_carga;

	public V040_POO_Furgoneta(int plazas_extra, int capacidad_carga) {

		super();

		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}

	public String dimeDatosFurgoneta() { // getter
		return "La capacidad de carga es: " + capacidad_carga + " y las plazas extra son: " + plazas_extra + ".";
	}
}
