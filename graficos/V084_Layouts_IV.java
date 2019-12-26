// Referencias:
//
// Video 084
// Layouts
// GridLayout
// Calculadora

package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V084_Layouts_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V084_Marco_Calculadora marco = new V084_Marco_Calculadora();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}
}

class V084_Marco_Calculadora extends JFrame {

	public V084_Marco_Calculadora() {

		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);

		V084_Lamina_Calculadora milamina = new V084_Lamina_Calculadora();
		add(milamina);
	}
}

class V084_Lamina_Calculadora extends JPanel {

	public V084_Lamina_Calculadora() {

		principio = true;

		setLayout(new BorderLayout());

		pantalla = new JButton("0");

		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);

		// Segunda lámina. Tipo Grid
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4, 4));

		ActionListener insertar = new InsertaNumero();

		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		// ponerBoton("/");

		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		// ponerBoton("*");

		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", insertar);

		ponerBoton("0", insertar);
		// ponerBoton(".");
		// ponerBoton("=");
		// ponerBoton("+");

		add(milamina2, BorderLayout.CENTER);

	}

	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
	}

	private class InsertaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String entrada = e.getActionCommand();
			if (principio) {
				pantalla.setText("");
				principio = false;
			}
			pantalla.setText(pantalla.getText() + entrada);

		}

	}

	// Se saca la declaración de milamina2 fuera del constructor, para que esté
	// disponible en todos los métodos de la clase
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
}
