// Referencias:
//
// Video 067
// Botones
// Eventos

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V067_PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V067_MarcoBotones mimarco = new V067_MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V067_MarcoBotones extends JFrame {

	public V067_MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);

		V067_LaminaBotones milamina = new V067_LaminaBotones();
		add(milamina);
	}
}

class V067_LaminaBotones extends JPanel {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	// Evento: Al azar click en el botón "Azul"
	// Objeto origen o fuente: El botón "Azul"
	// Objeto destino o receptor (listener): La lámina

	public V067_LaminaBotones() {

		add(botonAzul);

		add(botonAmarillo);

		add(botonRojo);

		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		ColorFondo Azul = new ColorFondo(Color.BLUE);

		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);

	}

	class ColorFondo implements ActionListener {

		public ColorFondo(Color c) {
			colorDeFondo = c;
		}

		public void actionPerformed(ActionEvent e) {

			// Object botonPulsado = e.getSource();
			// if (botonPulsado == botonAzul) {
			// setBackground(Color.BLUE);
			// } else if (botonPulsado == botonAmarillo) {
			// setBackground(Color.YELLOW);
			// } else if (botonPulsado == botonRojo) {
			// setBackground(Color.RED);
			// }

			setBackground(colorDeFondo);

		}

		private Color colorDeFondo;

	}
}
