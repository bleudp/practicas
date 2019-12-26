// Referencias:
// Vídeos 041
// Herencia de clases

package poo;

import javax.swing.*;

public class V040_POO_Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V032_POO_Coche micoche1 = new V032_POO_Coche();
		micoche1.establece_color("rojo");

		V040_POO_Furgoneta mifurgoneta1 = new V040_POO_Furgoneta(7, 580);
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configura_asientos("si");
		mifurgoneta1.configura_climatizador("si");

		System.out.println("Coche1:");
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		System.out.println();

		System.out.println("Furgoneta1:");
		System.out.println(mifurgoneta1.dime_datos_generales() + " " + 
				mifurgoneta1.dime_color() + " " +
				mifurgoneta1.dimeDatosFurgoneta());
		System.out.println();

	}

}
