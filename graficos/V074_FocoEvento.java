// Referencias:
//
// Video 074
// Eventos de foco
// Interfaz FocusListener
// Invalidar layout
// Cuadros de texto

package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V074_FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco() {
		setVisible(true);
		setBounds(300, 300, 600, 450);

		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Invalida el layout para poder colocar los elementos libremente
		setLayout(null);

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		// Posición y tamaño
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);

		// Añadir los cuadros de texto a la lámina
		add(cuadro1);
		add(cuadro2);

		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
		cuadro2.addFocusListener(elFoco);

	}

	// Se declara como clase interna para que pueda acceder a los objetos de la
	// clase LaminaFoco
	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			String s = e.paramString();
			System.out.println("Foco ganado.");
			System.out.println(s);
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String s = e.getSource().toString();
			System.out.println("He perdido el foco.");
			System.out.println(s);
		}

	}

	JTextField cuadro1;
	JTextField cuadro2;

}
