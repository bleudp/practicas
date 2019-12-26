// Referencias:
//
// Vídeo 107 - Menús con iconos
//
// Clases: JMenuBar, JMenu, JMenuItem
// Clase: JMenuItem(String texto, Icon icono)
// Clase ImageIcon

package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class V107_a_MenuIconos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V107_MenuFrame marco = new V107_MenuFrame();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class V107_MenuFrame extends JFrame {

	public V107_MenuFrame() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba de menús");

		V107_MenuLamina milamina = new V107_MenuLamina();
		add(milamina);

		setVisible(true);

	}
}

class V107_MenuLamina extends JPanel {

	public V107_MenuLamina() {

		JMenuBar miBarra = new JMenuBar();

		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como...");
		menuArchivo.add(guardar);
		menuArchivo.add(guardarComo);
		// Separador
		menuArchivo.addSeparator();
		JMenuItem salir = new JMenuItem("Salir");
		menuArchivo.add(salir);

		JMenu menuEdicion = new JMenu("Edición");
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/recursos/cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/recursos/copiar.gif"));
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/recursos/pegar.gif"));
		menuEdicion.add(cortar);
		menuEdicion.add(copiar);
		menuEdicion.add(pegar);

		// Submenú "Opciones" dentro del menú "Edición"
		JMenu menuOpciones = new JMenu("Opciones");
		JMenuItem opcion1 = new JMenuItem("Opción 1...");
		JMenuItem opcion2 = new JMenuItem("Opción 2...");
		menuOpciones.add(opcion1);
		menuOpciones.add(opcion2);
		// Separador
		menuEdicion.addSeparator();
		// Submenú
		menuEdicion.add(menuOpciones);

		JMenu menuHerramientas = new JMenu("Herramientas");
		JMenuItem generales = new JMenuItem("Generales...");
		menuHerramientas.add(generales);

		miBarra.add(menuArchivo);
		miBarra.add(menuEdicion);
		miBarra.add(menuHerramientas);

		add(miBarra);

	}

}
