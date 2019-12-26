// Referencias:
//
// Video 078
// Múltiples eventos
// Interfaz Action

package graficos;

import java.awt.ActiveEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V078_PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V078_MarcoAction marco = new V078_MarcoAction();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V078_MarcoAction extends JFrame {

	public V078_MarcoAction() {

		setTitle("Prueba Acciones");
		setBounds(400, 350, 800, 300);
		V078_PanelAccion lamina = new V078_PanelAccion();
		add(lamina);
	}
}

class V078_PanelAccion extends JPanel {

	public V078_PanelAccion() {

		V078_AccionColor accionAmarillo = new V078_AccionColor("Amarillo",
				new ImageIcon("src/recursos/Yellow-Ball-icon.png"), Color.YELLOW);
		V078_AccionColor accionAzul = new V078_AccionColor("Azul", new ImageIcon("src/recursos/Blue-Ball-icon.png"),
				Color.BLUE);
		V078_AccionColor accionRojo = new V078_AccionColor("Rojo", new ImageIcon("src/recursos/Red-Ball-icon.png"),
				Color.RED);

		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

		// JButton botonAmarillo = new JButton("Amarillo");
		// JButton botonAzul = new JButton("Azul");
		// JButton botonRojo = new JButton("Rojo");
		//
		// add(botonAmarillo);
		// add(botonAzul);
		// add(botonRojo);

	}

	private class V078_AccionColor extends AbstractAction {

		public V078_AccionColor(String nombre, Icon icono, Color color_boton) {

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_de_fondo", color_boton);

		}

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);

			System.out.println(
					"Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
			;

		}

	}
}
