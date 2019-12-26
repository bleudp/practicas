package poo;

public class V031_POO_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar una clase
		// mi_coche es un ejemplar de la clase Coche
		V031_POO_Coche mi_coche = new V031_POO_Coche();

		System.out.println(mi_coche.dime_color());

		mi_coche.establece_color("amarillo");

		System.out.println(mi_coche.dime_datos_generales());
		System.out.println(mi_coche.dime_color());

		mi_coche.configura_asientos("no");
		System.out.println(mi_coche.dime_asientos());
	}

}
