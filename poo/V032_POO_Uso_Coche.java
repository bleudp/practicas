package poo;

import javax.swing.*;

public class V032_POO_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar una clase
		// mi_coche es un ejemplar de la clase Coche
		V032_POO_Coche mi_coche = new V032_POO_Coche();

		System.out.println(mi_coche.dime_color());

		mi_coche.establece_color(JOptionPane.showInputDialog("Introduce color:"));

		System.out.println(mi_coche.dime_datos_generales());
		System.out.println(mi_coche.dime_color());

		mi_coche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(mi_coche.dime_asientos());

		mi_coche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(mi_coche.dime_climatizador());

		System.out.println(mi_coche.dime_peso_coche());

		System.out.println("El precio final del coche es: " + mi_coche.precio_coche());

	}

}
