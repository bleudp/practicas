// Referencias:
//
// Video 111 - Barras de herramientas
// 
// Clase JToolBar

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class V111_BarrasHerramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V111_MarcoBarra marco = new V111_MarcoBarra();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class V111_MarcoBarra extends JFrame {

	private JPanel lamina;

	public V111_MarcoBarra() {

		setTitle("Marco con barra");
		setBounds(500, 300, 600, 450);
		lamina = new JPanel();
		add(lamina);
		
		// Configuración de acciones
		Action accionAzul = new V111_AccionColor("Azul",
				new ImageIcon("src/recursos/bluball.gif"), Color.BLUE);
		Action accionAmarillo = new V111_AccionColor("Amarillo",
				new ImageIcon("src/recursos/ylwball.gif"), Color.YELLOW);
		Action accionRojo = new V111_AccionColor("Rojo",
				new ImageIcon("src/recursos/redball.gif"), Color.RED);
		
		// Botón Salir
		Action accionSalir =new AbstractAction("Salir", new ImageIcon("src/recursos/1469388681_common-logout-signout-exit-glyph.png")){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
		}
		};
		
		JMenu menu=new JMenu("Color");
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		JMenuBar barramenus=new JMenuBar();
		barramenus.add(menu);
		setJMenuBar(barramenus);
		
		// Construcción de la barra de herramientas
		JToolBar barra = new JToolBar();
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		barra.add(accionRojo);
		
		barra.addSeparator();
		barra.add(accionSalir);
		
		// Para poder arrastrar la barra tiene que estar con BorderLayout
		add(barra, BorderLayout.NORTH);
		
	}
	
	private class V111_AccionColor extends AbstractAction {

		public V111_AccionColor(String nombre, Icon icono, Color c) {

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			putValue("Color", c);

		}

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			Color c = (Color) getValue("Color");
			lamina.setBackground(c);

			System.out.println(
					"Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
			;

		}

	}

}

