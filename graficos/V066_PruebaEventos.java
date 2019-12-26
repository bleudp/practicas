// Referencias:
//
// Video 066
// Botones
// Eventos

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V066_PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V066_MarcoBotones mimarco = new V066_MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class V066_MarcoBotones extends JFrame {

	public V066_MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);

		V066_LaminaBotones milamina = new V066_LaminaBotones();
		add(milamina);
	}
}

class V066_LaminaBotones extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	// Evento: Al hacer click en el botón "Azul"
	// Objeto origen o fuente: El botón "Azul"
	// Objeto destino o receptor (listener): La lámina

	public V066_LaminaBotones() {

		add(botonAzul);
		botonAzul.addActionListener(this);

		add(botonAmarillo);
		botonRojo.addActionListener(this);

		add(botonRojo);
		botonAmarillo.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		Object botonPulsado = e.getSource();
		if (botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		} else if (botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		} else if (botonPulsado == botonRojo) {
			setBackground(Color.RED);
		}

	}

}