// Referencias:
//
// Video 068
// Eventos de ventana
// Interfaz WindowListener

package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class V070_CambioEstadoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame {

	public MarcoEstado() {
		setVisible(true);
		setBounds(300, 300, 500, 350);

		CambiaEstado nuevo_estado = new CambiaEstado();
		addWindowStateListener(nuevo_estado);
	}
}

class CambiaEstado implements WindowStateListener {
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana ha cambiado de estado.");

		// System.out.println("Nuevo estado: " + e.getNewState());

		final int newState = e.getNewState();
		if (newState == Frame.MAXIMIZED_BOTH) {
			System.out.println("El nuevo estado es pantalla completa.");
		} else if (newState == Frame.NORMAL) {
			System.out.println("El nuevo estado es pantalla normal.");
		} else if (newState == Frame.ICONIFIED) {
			System.out.println("El nuevo estado es minimizada.");
		} else {
			System.out.println("Nuevo estado no previsto: " + newState);
		}
	}

}