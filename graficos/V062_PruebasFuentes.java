// Referencias:
//
// Video 062
// Fonts

package graficos;

import java.awt.*;
import javax.swing.*;

public class V062_PruebasFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean estalafuente = false;
		String fuente = JOptionPane.showInputDialog("Introduce nombre de fuente;");

		// Obtener nombres de fuentes instaladas
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String nombredelafuente : nombresDeFuentes) {
			System.out.println(nombredelafuente);
			if (nombredelafuente.equals(fuente)) {
				estalafuente = true;
			}
		}

		System.out.println();

		if (estalafuente) {
			System.out.println("La fuente " + fuente + " está instalada.");
		} else {
			System.out.println("La fuente " + fuente + " no está instalada.");
		}

		System.out.println();
		System.out.println("Fuentes instaladas: " + nombresDeFuentes.length);
	}

}
