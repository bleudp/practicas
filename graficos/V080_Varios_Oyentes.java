// Referencias:
//
// Video 080
// Múltiples oyentes

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V080_Varios_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V080_Marco_Principal mimarco = new V080_Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class V080_Marco_Principal extends JFrame {

	public V080_Marco_Principal() {

		setTitle("Prueba Varios");
		setBounds(1200, 100, 300, 200);
		V080_Lamina_Principal lamina = new V080_Lamina_Principal();
		add(lamina);
	}
}

class V080_Lamina_Principal extends JPanel {

	// Se declara fuera para que sea accesible en todas las clases y métodos de
	// esta clase
	JButton boton_cerrar;

	public V080_Lamina_Principal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);

		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);

		// Establece el botón como fuente del evento
		V080_OyenteNuevo miOyente = new V080_OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
	}

	// Crea una nueva ventana de clase V080_Marco_Emergente
	private class V080_OyenteNuevo implements ActionListener {

		public V080_OyenteNuevo() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			V080_Marco_Emergente marco = new V080_Marco_Emergente(boton_cerrar);
			marco.setVisible(true);

		}

	}

}

class V080_Marco_Emergente extends JFrame {
	public V080_Marco_Emergente(JButton boton_de_principal) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40 * contador, 40 * contador, 300, 150);

		// Establece el botón de la ventana principal como fuente del evento
		// boton_de_principal llegó como parámetro al constructor
		CierraTodos oyente_cerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyente_cerrar);
	}

	private class CierraTodos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}

	}

	private static int contador = 0;
}
