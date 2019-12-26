// Referencias:
//
// Vídeo 109 - Menúes emergentes - Ejemplo sencillo
//
// Clase JPopupMenu
// Clase JMenuItem
// Método setComponentPopupMenu

package graficos;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class V109_a_MenusEmergentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V109_a_Marco marco = new V109_a_Marco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V109_a_Marco extends JFrame {

	public V109_a_Marco() {

		setBounds(100, 100, 300, 250);
		setTitle("Prueba Menú emergente");

		V109_a_Lamina milamina = new V109_a_Lamina();
		add(milamina);

		setVisible(true);

	}
}

class V109_a_Lamina extends JPanel {

	public V109_a_Lamina() {

		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		JMenuItem opcion3 = new JMenuItem("Opción 3");
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);

		setComponentPopupMenu(emergente);
	}

}
