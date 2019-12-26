// Referencias:
//
// Video 068
// Eventos de ventana
// Interfaz WindowListener

package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class V069_EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V069_MarcoVentana mimarco = new V069_MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(300, 300, 500, 350);

		V069_MarcoVentana mimarco2 = new V069_MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(1000, 300, 500, 350);

	}

}

class V069_MarcoVentana extends JFrame {

	public V069_MarcoVentana() {
		setVisible(true);

		// V069_M_Ventana oyente_ventana = new V069_M_Ventana();
		// addWindowListener(oyente_ventana);

		// Se puede simplificar instanciando directamente:
		addWindowListener(new V069_M_Ventana());
	}
}

// Al heredar de WindowAdapter deja de ser necesario desarrollar
// cada uno de los métodos de la interfaz. Solo los realmente necesarios.
// class V069_M_Ventana implements WindowListener {
class V069_M_Ventana extends WindowAdapter {

	// Hay que implementar todos los métodos de la interfaz WindowsListener,
	// aunque no se vayan a usar
	// public void windowActivated(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - " + "Ventana activada.");
	// }
	//
	// public void windowClosed(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - Ventana cerrada.");
	// }
	//
	// public void windowClosing(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - " + "Ventana cerrándose.");
	// }
	//
	// public void windowDeactivated(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - " + "Ventana desactivada.");
	// }
	//
	// public void windowDeiconified(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - " + "Ventana restaurada.");
	// }
	//
	public void windowIconified(WindowEvent e) {
		JFrame frame = (JFrame) e.getWindow();
		String title = frame.getTitle();
		System.out.println(title + " - " + "Ventana minimizada.");
	}

	// public void windowOpened(WindowEvent e) {
	// JFrame frame = (JFrame) e.getWindow();
	// String title = frame.getTitle();
	// System.out.println(title + " - " + "Ventana abierta.");
	// }

}