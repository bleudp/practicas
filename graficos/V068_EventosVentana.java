// Referencias:
//
// Video 068
// Eventos de ventana
// Interfaz WindowListener

package graficos;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class V068_EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V068_MarcoVentana mimarco = new V068_MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(300, 300, 500, 350);

		V068_MarcoVentana mimarco2 = new V068_MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(1000, 300, 500, 350);

	}

}

class V068_MarcoVentana extends JFrame {

	public V068_MarcoVentana() {
		setVisible(true);

		M_Ventana oyente_ventana = new M_Ventana();
		addWindowListener(oyente_ventana);
	}
}

class M_Ventana implements WindowListener {

	// Hay que implementar todos los métodos de la interfaz WindowsListener,
	// aunque no se vayan a usar
	public void windowActivated(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana activada.");
	}

	public void windowClosed(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - Ventana cerrada.");
	}

	public void windowClosing(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana cerrándose.");
	}

	public void windowDeactivated(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana desactivada.");
	}

	public void windowDeiconified(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana restaurada.");
	}

	public void windowIconified(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana minimizada.");
	}

	public void windowOpened(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana abierta.");
	}

}