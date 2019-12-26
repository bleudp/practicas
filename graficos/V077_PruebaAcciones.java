// Referencias:
//
// Video 077
// Múltiples eventos
// Interfaz Action

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V077_PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V077_MarcoAction marco = new V077_MarcoAction();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V077_MarcoAction extends JFrame {

	public V077_MarcoAction() {

		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		V077_PanelAccion lamina = new V077_PanelAccion();
		add(lamina);
	}
}

class V077_PanelAccion extends JPanel {

	public V077_PanelAccion() {

		V077_AccionColor accionAmarillo = new V077_AccionColor("Amarillo",
				new ImageIcon("src/recursos/Yellow-Ball-icon.png"), Color.YELLOW);
		V077_AccionColor accionAzul = new V077_AccionColor("Azul", new ImageIcon("src/recursos/Blue-Ball-icon.png"),
				Color.BLUE);
		V077_AccionColor accionRojo = new V077_AccionColor("Rojo", new ImageIcon("src/recursos/Red-Ball-icon.png"),
				Color.RED);

		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");

		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);

	}
}

class V077_AccionColor extends AbstractAction {

	public V077_AccionColor(String nombre, Icon icono, Color color_boton) {

		putValue(Action.NAME, nombre);
		putValue(Action.SMALL_ICON, icono);
		putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color" + nombre);
		putValue("Color de fondo", color_boton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}