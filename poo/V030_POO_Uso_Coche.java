package poo;

public class V030_POO_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar una clase
		// mi_coche es un ejemplar de la clase Coche
		V030_POO_Coche mi_coche = new V030_POO_Coche();

		System.out.println(mi_coche.dime_color());

		mi_coche.establece_color();

		System.out.println(mi_coche.dime_largo());
		System.out.println(mi_coche.dime_color());

	}

}
