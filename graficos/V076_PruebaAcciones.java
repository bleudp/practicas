// Referencias:
//
// Video 076
// Múltiples eventos
// Interfaz Action

package graficos;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V076_PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V076_MarcoAction marco = new V076_MarcoAction();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V076_MarcoAction extends JFrame {

	public V076_MarcoAction() {

		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		V076_PanelAccion lamina = new V076_PanelAccion();
		add(lamina);
	}
}

class V076_PanelAccion extends JPanel {

	public V076_PanelAccion() {

		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");

		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);

	}
}

class V076_AccionColor extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}