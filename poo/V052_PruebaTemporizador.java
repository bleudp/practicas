// Referencias:
// Vídeo 052
//
// Temporizador
// Interfaz pasada como parámetro
// Retrollamada

package poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class V052_PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El segundo parámetro de Timer es una interfaz.
		// Obliga a crear una clase que la implemente.

		DameLaHora oyente = new DameLaHora();
		Timer mitemporizador = new Timer(5000, oyente);

		mitemporizador.start();

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");

		System.exit(0);

	}

}

class DameLaHora implements ActionListener {
	// Desarrollar todos los métodos de la interfaz
	// Solo hay uno

	public void actionPerformed(ActionEvent e) {

		Date ahora = new Date();
		System.out.println("Te pongo la hora cada cinco segundos: " + ahora);
	}
}
