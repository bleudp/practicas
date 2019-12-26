// Referencias:
//
// Video 075
// Eventos de foco
// Interfaz FocusListener
// Invalidar layout
// Cuadros de texto
// Eventos de foco en ventanas (no en componentes)

package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V075_FocoVentana extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V075_FocoVentana miv = new V075_FocoVentana();
		miv.iniciar();
	}

	public void iniciar() {

		marco1 = new V075_FocoVentana();
		marco2 = new V075_FocoVentana();

		marco1.setVisible(true);
		marco2.setVisible(true);

		marco1.setBounds(300, 100, 600, 350);
		marco2.setBounds(1200, 100, 600, 350);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco");
		} else {
			marco2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == marco1) {
			marco1.setTitle("");
		} else {
			marco2.setTitle("");
		}

	}

	V075_FocoVentana marco1;
	V075_FocoVentana marco2;

}
