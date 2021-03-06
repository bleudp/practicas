// Referencias:
//
// Vídeo 100 - Menús
//
// Clases: JMenuBar, JMenu, JMenuItem

package graficos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class V100_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuFrame marco = new MenuFrame();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// marco.setVisible(true);

	}
}

class MenuFrame extends JFrame {

	public MenuFrame() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba de menús");

		MenuLamina milamina = new MenuLamina();
		add(milamina);

		setVisible(true);

	}
}

class MenuLamina extends JPanel {

	public MenuLamina() {

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
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
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
