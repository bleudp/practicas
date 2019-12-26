// Referencias:
//
// Vídeo 109 - Menúes emergentes - Ejemplo más complicado
//
// Clase JPopupMenu
// Clase JMenuItem
// Método setComponentPopupMenu

package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class V109_b_MenusEmergentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V109_b_Marco marco = new V109_b_Marco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V109_b_Marco extends JFrame {

	public V109_b_Marco() {

		setBounds(100, 100, 300, 250);
		setTitle("Prueba Menú emergente");

		V109_b_Lamina milamina = new V109_b_Lamina();
		add(milamina);

		setVisible(true);

	}
}

class V109_b_Lamina extends JPanel {

	public V109_b_Lamina() {

		setLayout(new BorderLayout());

		JPanel laminamenu = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamano");

		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);

		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);

		JTextPane miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		// ------------------------------------------------------
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		JMenuItem opcion3 = new JMenuItem("Opción 3");
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);

		// No funciona porque la lámina está tapada por laminamenu y miarea
		// Solo funciona en la parte superior no cubierta por la barra de menús
		// setComponentPopupMenu(emergente);
		
		// Se traslada al área de texto
		miarea.setComponentPopupMenu(emergente);

	}

}
