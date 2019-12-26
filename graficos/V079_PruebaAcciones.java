// Referencias:
//
// Video 079
// Múltiples eventos
// Interfaz Action
// Mapa de entrada

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class V079_PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V079_MarcoAction marco = new V079_MarcoAction();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V079_MarcoAction extends JFrame {

	public V079_MarcoAction() {

		setTitle("Prueba Acciones");
		setBounds(400, 350, 800, 300);
		V079_PanelAccion lamina = new V079_PanelAccion();
		add(lamina);
	}
}

class V079_PanelAccion extends JPanel {

	public V079_PanelAccion() {

		V079_AccionColor accionAmarillo = new V079_AccionColor("Amarillo",
				new ImageIcon("src/recursos/Yellow-Ball-icon.png"), Color.YELLOW);
		V079_AccionColor accionAzul = new V079_AccionColor("Azul", new ImageIcon("src/recursos/Blue-Ball-icon.png"),
				Color.BLUE);
		V079_AccionColor accionRojo = new V079_AccionColor("Rojo", new ImageIcon("src/recursos/Red-Ball-icon.png"),
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

		// Establecer el mapa de entrada
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		// Combinaciones de teclas
		// KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		// KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		// KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");

		// Asignar la combinación de teclas a un objeto
		// mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		// mapaEntrada.put(teclaAzul, "fondo_azul");
		// mapaEntrada.put(teclaRojo, "fondo_rojo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");

		// Asignar el objeto a la acción
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);

	}

	private class V079_AccionColor extends AbstractAction {

		public V079_AccionColor(String nombre, Icon icono, Color color_boton) {

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
